package com.mju.insurance.dao.cancelApplication;

public class CancelApplicationDao {
	
//	public CancelApplicationDao() {
//		super.connect();
//	}
//	
//	public boolean create(CancelApplication cancelApplication) {
//        String query = String.format(
//                "insert into cancel_application values (0, %s, '%s', '%s')",
//                cancelApplication.getContractId(), Timestamp.valueOf(cancelApplication.getApplicationDate())
//                , cancelApplication.getState().name()
//        );
//        return super.create(query);
//    }
//	
//    public boolean update(CancelApplication cancelApplication) {
//        String query = String.format(
//                "update cancel_application set contract_id=%s, application_date='%s', state='%s' where id=%s",
//                cancelApplication.getContractId(), Timestamp.valueOf(cancelApplication.getApplicationDate())
//                , cancelApplication.getState().name(), cancelApplication.getId()
//        );
//        return super.update(query);
//    }
//
//    public boolean delete(String id) {
//        String query = String.format("delete from cancel_application where id=%s", id);
//        return super.delete(query);
//    }
//
//    public ArrayList<CancelApplication> retrieveAll() {
//        try {
//            String query = "select * from cancel_application";
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null) return null;
//            ArrayList<CancelApplication> cancelApplications = new ArrayList<>();
//            while (resultSet.next()) {
//            	CancelApplication cancelApplication = getCurrentCancelApplication(resultSet);
//            	cancelApplications.add(cancelApplication);
//            }
//            return cancelApplications;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    public CancelApplication retrieveById(String id) {
//        try {
//            String query = String.format("select * from cancel_application where id=%s", id);
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null || !resultSet.next()) return null;
//            CancelApplication cancelApplication = getCurrentCancelApplication(resultSet);
//            return cancelApplication;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public CancelApplication retrieveByContractId(String contractId) {
//        try {
//            String query = String.format("select * from cancel_application where contract_id='%s'", contractId);
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null || !resultSet.next()) return null;
//            CancelApplication cancelApplication = getCurrentCancelApplication(resultSet);
//            return cancelApplication;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//	
//    private CancelApplication getCurrentCancelApplication(ResultSet resultSet) throws SQLException {
//        String id = resultSet.getString("id");
//        String contractId = resultSet.getString("contract_id");
//        LocalDateTime applicationDate = resultSet.getTimestamp("application_date").toLocalDateTime();
//        CancelApplicationState state = CancelApplicationState.valueOf(resultSet.getString("state"));
//        
//        CancelApplication cancelApplication = new CancelApplication();
//        cancelApplication.setId(id);
//        cancelApplication.setContractId(contractId);
//        cancelApplication.setApplicationDate(applicationDate);
//        cancelApplication.setState(state);
//        return cancelApplication;
//    }

}
