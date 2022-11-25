package com.mju.insurance.dao.customer;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mju.insurance.entity.customer.AdditionalInfo;
import com.mju.insurance.mybatis.MyBatisConnectionFactory;

@Repository
public class AdditionalInfoDaoImpl implements AdditionalInfoDao {
	private SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
	
	private static final String SelectByCustomerId = "AdditionalInfoMapper.selectByCustomerId";

    public AdditionalInfo getAdditionalInfoByCustomerId(String customerId) {
		return sqlSession.selectOne(SelectByCustomerId, customerId);
    }
}
