package com.mju.insurance.dao.insurance;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mju.insurance.entity.insurance.Clause;
import com.mju.insurance.mybatis.MyBatisConnectionFactory;

@Repository
public class ClauseDaoImpl implements ClauseDao {
	private SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();

	private static final String SelectAll = "ClauseMapper.selectAll";

	@Override
	public List<Clause> getClauseByInsuranceId(String id) {
		return sqlSession.selectList(SelectAll);
	}

//    public String createAndGetId(Clause clause) {
//        String query = String.format(
//                "insert into clause values (0, '%s', '%s', %d, %d, %s)",
//                clause.getName(), clause.getClauseCategory().name(), clause.getInsuredAmount(), clause.getPremium(), clause.getInsuranceId()
//        );
//        return super.createAndGetId(query);
//    }
//
//    public boolean create(Clause clause){
//        String query = String.format(
//                "insert into clause values (0, '%s', '%s', %d, %d, %s)",
//                clause.getName(), clause.getClauseCategory().name(), clause.getInsuredAmount(), clause.getPremium(), clause.getInsuranceId()
//        );
//        return super.create(query);
//    }
//
//    public boolean update(Clause clause) {
//        String query = String.format(
//                "update clause set name='%s', clause_category='%s', insured_amount=%d, premium=%d where id=%s",
//                clause.getName(), clause.getClauseCategory().name(), clause.getInsuredAmount(), clause.getPremium(), clause.getId()
//        );
//        return super.update(query);
//    }
//
//    public boolean delete(String id) {
//        String query = String.format("delete from clause where id=%s", id);
//        return super.delete(query);
//    }
//
//    public boolean deleteAllByInsuranceId(String insuranceId) {
//        String query = String.format("delete from clause where insurance_id=%s", insuranceId);
//        return super.delete(query);
//    }
//
//    public ArrayList<Clause> retrieveAll() {
//        try {
//            String query = "select * from clause";
//            ResultSet resultSet = super.retrieve(query);
//            if (resultSet == null) return null;
//            ArrayList<Clause> clauses = new ArrayList<>();
//            while (resultSet.next()) {
//                Clause clause = getCurrentClause(resultSet);
//                clauses.add(clause);
//            }
//            return clauses;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    public Clause retrieveById(String id) {
//        try {
//            String query = String.format("select * from clause where id=%s", id);
//            ResultSet resultSet = super.retrieve(query);
//            if (resultSet == null || !resultSet.next()) return null;
//            Clause clause = getCurrentClause(resultSet);
//            return clause;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public ArrayList<Clause> retrieveAllByInsuranceId(String insuranceId) {
//        try {
//            String query = "select * from clause where insurance_id=" + insuranceId;
//            ResultSet resultSet = super.retrieve(query);
//            if (resultSet == null) return null;
//            ArrayList<Clause> clauses = new ArrayList<>();
//            while (resultSet.next()) {
//                Clause clause = getCurrentClause(resultSet);
//                clauses.add(clause);
//            }
//            return clauses;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//
//    private Clause getCurrentClause(ResultSet resultSet) throws SQLException {
//        String id = resultSet.getString("id");
//        String name = resultSet.getString("name");
//        ClauseCategory clauseCategory = ClauseCategory.valueOf(resultSet.getString("clause_category"));
//        long insuredAmount = Long.parseLong(resultSet.getString("insured_amount"));
//        long premium = Long.parseLong(resultSet.getString("premium"));
//        String insuranceId = resultSet.getString("insurance_id");
//        Clause clause = new Clause();
//        clause.setId(id);
//        clause.setName(name);
//        clause.setClauseCategory(clauseCategory);
//        clause.setInsuredAmount(insuredAmount);
//        clause.setPremium(premium);
//        clause.setInsuranceId(insuranceId);
//        return clause;
//    }
}
