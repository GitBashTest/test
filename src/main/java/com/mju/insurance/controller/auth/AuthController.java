package com.mju.insurance.controller.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mju.insurance.entity.customer.Customer;
import com.mju.insurance.dto.auth.LoginDTO;
import com.mju.insurance.dto.auth.SignUpDTO;
import com.mju.insurance.enums.EMessage;
import com.mju.insurance.exception.duplicatedInput.DuplicatedInfoException;
import com.mju.insurance.exception.invalidInput.InvalidConfirmException;
import com.mju.insurance.exception.nullInput.NullInputException;
import com.mju.insurance.service.auth.LoginService;
import com.mju.insurance.service.auth.SignUpService;

@Controller
@RequestMapping(value = "/user")
public class AuthController {
	@Autowired
	LoginService loginService;
	@Autowired
	SignUpService signUpService;
	
	@RequestMapping("/login")
	public String loginForm() { return "user/loginForm"; }
	
	@RequestMapping("/signup")
	public String registerForm() { return "user/signUpForm"; }
	
	private final String mAlert = "alert";
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		try {
			String email = getInputAndCheckInvalid(request, "email");
			String password = getInputAndCheckInvalid(request, "password");
			Customer customer = loginService.login(new LoginDTO(email, password));
			if(customer == null) model.addAttribute(mAlert, EMessage.loginFailed.getStr());
			else {
				model.addAttribute(mAlert, "");
				return "index";
			}
		} catch (NullInputException e) { model.addAttribute(e.getMessage()); }
		return "user/loginForm";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUp(HttpServletRequest request, Model model) {
		try {
			String name = getInputAndCheckInvalid(request, "name");
			String email = getInputAndCheckInvalid(request, "email");
			if(signUpService.isEmailDuplicated(email)) throw new DuplicatedInfoException("email", email);
			String password = getInputAndCheckInvalid(request, "password");
			String confirm = getInputAndCheckInvalid(request, "confirm");
			if(!password.equals(confirm)) throw new InvalidConfirmException();
			int age = Integer.parseInt(getInputAndCheckInvalid(request, "age"));
			boolean gender = getInputAndCheckInvalid(request, "gender").equals("male") ? true : false;
			String registrationNo = getInputAndCheckInvalid(request, "registrationNo");
	        if(signUpService.isRegistrationNoDuplicated(registrationNo)) throw new DuplicatedInfoException("registrationNo", registrationNo);
			String phoneNo = getInputAndCheckInvalid(request, "phoneNo");
	        if(signUpService.isPhoneNoDuplicated(phoneNo)) throw new DuplicatedInfoException("phoneNo", phoneNo);
			String bank = getInputAndCheckInvalid(request, "bank");
			String accountNo = bank + " " + getInputAndCheckInvalid(request, "accountNo");;
			if(!signUpService.signUp(new SignUpDTO(name, email, password, age, gender, registrationNo, phoneNo, accountNo))) model.addAttribute(mAlert, "Sign Up Failed");
			return "index";
		}
		catch (NullInputException e) { model.addAttribute(mAlert, e.getMessage()); }
		catch (InvalidConfirmException e) { model.addAttribute(mAlert, e.getMessage()); }
		catch (DuplicatedInfoException e) { model.addAttribute(mAlert, e.getMessage()); }
		return "user/signUpForm";
	}

    // Get Input and Check whether null or not
	private String getInputAndCheckInvalid(HttpServletRequest request, String name) throws NullInputException {
		String input = request.getParameter(name);
		if(input.equals("")) throw new NullInputException(name);
		return input;
	}
}
