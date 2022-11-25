package com.mju.insurance.dao.carAccidentHandling;

public class AccidentPersonDao {
//    
//    private final String tableName = "accident_person";
//
//    public AccidentPersonDao() {
//        super.connect();
//    }
//
//    public boolean create(AccidentPerson accidentPerson){
//        String query = this.makeCreationQuery(accidentPerson);
//        
//        return super.create(query);
//    }
//
//    public String createAndGetId(AccidentPerson accidentPerson){
//        String query = this.makeCreationQuery(accidentPerson);
//        
//        return super.createAndGetId(query);
//    }
//
//    private String makeCreationQuery(AccidentPerson accidentPerson){
//        String query = String.format(
//                "insert into %s values (0, '%d', '%d', '%s', '%s', '%s')",
//                this.tableName,  Integer.parseInt(accidentPerson.getCarAccidentHandlingId()),
//                accidentPerson.getCost(), accidentPerson.getName(), accidentPerson.getPhoneNo(), accidentPerson.getVisitedHospitalName()
//    );
//        return query;
//    }
//
//    public boolean update(AccidentPerson accidentPerson) {
//        String query = String.format(
//            "update %s set " +
//                    "cost=%d, name=%s, phone_no=%s, visited_hospital_name=%s",
//            this.tableName,
//            accidentPerson.getCost(), accidentPerson.getName(), accidentPerson.getPhoneNo(), accidentPerson.getVisitedHospitalName()
//    );
//        
//        return super.create(query);
//    }
//
//
//    public boolean delete(String id, String carAccidentHandlingId) {
//        String query = String.format("delete from %s where id=%s and car_accident_handling_id=%s ", this.tableName, id, carAccidentHandlingId);
//        
//        return super.delete(query);
//    }
//
//    public boolean deleteByCarAccidentHandlingId(String id) {
//        String query = String.format("delete from %s where car_accident_handling_id=%s", this.tableName, id);
//        return super.delete(query);
//    }
//
//    public ArrayList<AccidentPerson> retrieveAll() {
//        try{
//            String query = "select * from "+this.tableName;
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null) return null;
//            ArrayList<AccidentPerson> accidentPersons = new ArrayList<>();
//            while(resultSet.next()){
//                AccidentPerson accidentPerson = getCurrentRecord(resultSet);
//                accidentPersons.add(accidentPerson);
//            }
//            return accidentPersons;
//        }catch (SQLException e) {
////			e.printStackTrace();
//            return null;
//        }
//    }
//
//    public AccidentPerson retrieveById(String id, String carAccidentHandlingId){
//        try{
//            String query = String.format("select * from "+this.tableName+" where id=%s and car_accident_handling_id=%s", id, carAccidentHandlingId);
//            
//            ResultSet resultSet = super.retrieve(query);
//            if(resultSet==null || !resultSet.next()) return null;
//            AccidentPerson accidentPerson = this.getCurrentRecord(resultSet);
//            return accidentPerson;
//        } catch (SQLException e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public ArrayList<AccidentPerson> retrieveByCarAccidentHandlingId(String carAccidentHandlingId){
//        try {
//            String query = "select * from accident_person where car_accident_handling_id=" + carAccidentHandlingId;
//            ResultSet resultSet = super.retrieve(query);
//            if (resultSet == null) return null;
//            ArrayList<AccidentPerson> accidentPeople = new ArrayList<>();
//            while (resultSet.next()) {
//                AccidentPerson accidentPerson = getCurrentRecord(resultSet);
//                accidentPeople.add(accidentPerson);
//            }
//            return accidentPeople;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    private AccidentPerson getCurrentRecord(ResultSet resultSet) throws SQLException {
//        String id = resultSet.getString("id");
//        String carAccidentHandlingId = resultSet.getString("car_accident_handling_id");
//        long cost = Long.parseLong(resultSet.getString("cost"));
//        String name = resultSet.getString("name");
//        String phoneNo = resultSet.getString("phone_no");
//        String visitedHospitalName = resultSet.getString("visited_hospital_name");
//
//        AccidentPerson accidentPerson = new AccidentPerson();
//        accidentPerson.setId(id);
//        accidentPerson.setCarAccidentHandlingId(carAccidentHandlingId);
//        accidentPerson.setCost(cost);
//        accidentPerson.setName(name);
//        accidentPerson.setPhoneNo(phoneNo);
//        accidentPerson.setVisitedHospitalName(visitedHospitalName);
//        return accidentPerson;
//    }

}
