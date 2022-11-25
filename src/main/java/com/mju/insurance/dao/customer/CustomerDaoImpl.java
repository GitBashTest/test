package com.mju.insurance.dao.customer;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mju.insurance.entity.customer.Customer;
import com.mju.insurance.mybatis.MyBatisConnectionFactory;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
	
	@Autowired
	private AdditionalInfoDao additionalInfoDao;

	private static final String Insert = "CustomerMapper.insert";
	private static final String SelectByColumnName = "CustomerMapper.selectByColumnName";
	
	@Override
    public boolean createCustomer(Customer customer) {
    	if(sqlSession.insert(Insert, customer) == 1) {
        	sqlSession.commit(); // apply to Database
    		return true;
    	}
    	return false; // insert failed
    }

//    public boolean update(Customer customer) {
//        String query = String.format(
//                "update customer set email='%s', password='%s', name='%s', age='%s', gender=%s, registration_no='%s', phone_no='%s', account_no='%s', is_married=%s where id=%s",
//                customer.getEmail(), customer.getPassword(), customer.getName()
//                , customer.getAge(), customer.getGender(), customer.getRegistrationNo()
//                , customer.getPhoneNo(), customer.getAccountNo(), customer.isMarried(), customer.getId()
//        );
//        return super.update(query);
//    }

//    public boolean delete(String id) {
//        String query = String.format("delete from customer where id=%s", id);
//        return super.delete(query);
//    }

//	private static final String SelectAll = "CustomerMapper.selectAll";
//	@Override
//	public List<Customer> getCustomers() {
//		List<Customer> customers = sqlSession.selectList(SelectAll);
//		for (Customer customer : customers)
//			customer.setAdditionalInfo(additionalInfoDao.retrieveByCustomerId(customer.getId()));
//		return customers;
//	}

	@Override
	public Customer getCustomerByColumnName(String column, String value) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("column", column);
		map.put("value", value);
		Customer customer = sqlSession.selectOne(SelectByColumnName, map);
		if(customer == null) return null;
		customer.setAdditionalInfo(additionalInfoDao.getAdditionalInfoByCustomerId(customer.getId()));
		return customer;
	}

//	@Override
//    public List<Customer> getCustomersByColumnName(String column, String value) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("column", column);
//		map.put("value", value);
//		List<Customer> customers = sqlSession.selectList(SelectByColumnName, map);
//		for (Customer customer : customers)
//			customer.setAdditionalInfo(additionalInfoDao.retrieveByCustomerId(customer.getId()));
//		return customers;
//    }
}
