package com.mju.insurance.dao.uw;

public class UWDao {

//    public UWDao() {
//        super.connect();
//    }
//
//    public String createAndGetId(UW uw) {
//        String query = String.format(
//                "insert into uw values (0, '%s', '%s', %s)",
//                Timestamp.valueOf(uw.getRequestDateTime()), uw.getUwState().name(), uw.getContractId()
//        );
//        return super.createAndGetId(query);
//    }
//
//    public boolean create(UW uw) {
//        String query = String.format(
//                "insert into uw values (0, '%s', '%s', %s)",
//                Timestamp.valueOf(uw.getRequestDateTime()), uw.getUwState().name(), uw.getContractId()
//        );
//        return super.create(query);
//    }
//
//    public boolean update(UW uw) {
//        String query = String.format(
//                "update uw set request_date_time='%s', uw_state='%s', contract_id=%s where id=%s",
//                Timestamp.valueOf(uw.getRequestDateTime()), uw.getUwState().name(), uw.getContractId(), uw.getId()
//        );
//        return super.update(query);
//    }
//
//    public boolean delete(String id) {
//        String query = String.format("delete from uw where id=%s", id);
//        return super.delete(query);
//    }
//
//    public ArrayList<UW> retrieveAll() {
//        try {
//            String query = "select * from uw";
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null) return null;
//            ArrayList<UW> uws = new ArrayList<>();
//            while (resultSet.next()) {
//                UW uw = getCurrentUw(resultSet);
//                uws.add(uw);
//            }
//            return uws;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    public UW retrieveById(String id) {
//        try {
//            String query = String.format("select * from uw where id=%s", id);
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null || !resultSet.next()) return null;
//            UW uw = getCurrentUw(resultSet);
//            return uw;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private UW getCurrentUw(ResultSet resultSet) throws SQLException {
//        String id = resultSet.getString("id");
//        LocalDateTime requestDateTime = resultSet.getTimestamp("request_date_time").toLocalDateTime();
//        UWState uwState = UWState.valueOf(resultSet.getString("uw_state"));
//        String contractId = resultSet.getString("contract_id");
//        UW uw = new UW();
//        uw.setId(id);
//        uw.setRequestDateTime(requestDateTime);
//        uw.setUwState(uwState);
//        uw.setContractId(contractId);
//        return uw;
//    }
}
