package com.mju.insurance.dao.insurance;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mju.insurance.entity.insurance.Clause;
import com.mju.insurance.entity.insurance.Insurance;
import com.mju.insurance.mybatis.MyBatisConnectionFactory;

@Repository
public class InsuranceDaoImpl implements InsuranceDao {
	private SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
	
	@Autowired
	private ClauseDao clauseDao;

	private static final String SelectAll = "InsuranceMapper.selectAll";

	@Override
	public List<Insurance> getInsurances() {
		List<Insurance> insurances = sqlSession.selectList(SelectAll);
		for (Insurance insurance : insurances)
			insurance.setClauses((ArrayList<Clause>) clauseDao.getClauseByInsuranceId(insurance.getId()));
		return insurances;
	}
//
//    public String createAndGetId(Insurance insurance) {
//        String query = String.format(
//                "insert into insurance values (0, '%s', '%s', '%s')",
//                insurance.getName(), insurance.getInsuranceCategory().name(), insurance.getInsuranceState().name()
//        );
//        return super.createAndGetId(query);
//    }
//
//    public boolean create(Insurance insurance) {
//        String query = String.format(
//                "insert into insurance values (0, '%s', '%s', '%s')",
//                insurance.getName(), insurance.getInsuranceCategory().name(), insurance.getInsuranceState().name()
//        );
//        return super.create(query);
//    }
//
//    public boolean update(Insurance insurance) {
//        String query = String.format(
//                "update insurance set name='%s', insurance_category='%s', insurance_state='%s' where id=%s",
//                insurance.getName(), insurance.getInsuranceCategory().name(), insurance.getInsuranceState().name(), insurance.getId()
//        );
//        return super.update(query);
//    }
//
//    public boolean delete(String id) {
//        String query = String.format("delete from insurance where id=%s", id);
//        return super.delete(query);
//    }
//
//    public ArrayList<Insurance> retrieveAll() {
//        try {
//            String query = "select * from insurance";
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null) return null;
//            ArrayList<Insurance> insurances = new ArrayList<>();
//            while (resultSet.next()) {
//                Insurance insurance = getCurrentInsurance(resultSet);
//                insurances.add(insurance);
//            }
//            return insurances;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    public Insurance retrieveById(String id) {
//        try {
//            String query = String.format("select * from insurance where id=%s", id);
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null || !resultSet.next()) return null;
//            Insurance insurance = getCurrentInsurance(resultSet);
//            return insurance;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
