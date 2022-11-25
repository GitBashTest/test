package com.mju.insurance.dao.carAccidentHandling;

public class CarAccidentHandlingDao {
//	//desc car_accident_handling;
//	private final String tableName = "car_accident_handling";
//
//	public CarAccidentHandlingDao()  {
//		super.connect();
//	}
//
//	public boolean create(CarAccidentHandling carAccidentHandling){
//		String query = this.makeCreationQuery(carAccidentHandling);
//		
//		return super.create(query);
//	}
//
//	public String createAndGetId(CarAccidentHandling carAccidentHandling){
//		String query = this.makeCreationQuery(carAccidentHandling);
//		
//		return super.createAndGetId(query);
//	}
//
//	private String makeCreationQuery(CarAccidentHandling carAccidentHandling){
//		String query = String.format(
//				"insert into %s values (0, '%d', '%s', '%s', '%s', '%s', '%d')",
//				this.tableName,  Integer.parseInt(carAccidentHandling.getContractId()), Timestamp.valueOf(carAccidentHandling.getRequestDate()), Timestamp.valueOf(carAccidentHandling.getAccidentDate()),
//				carAccidentHandling.getAccidentContent(), carAccidentHandling.getAccidentLocation(), carAccidentHandling.getState().ordinal()
//		);
//		return query;
//	}
//
//	public boolean update(CarAccidentHandling carAccidentHandling) {
//		String query = String.format(
//			"update %s set request_date=%s, accident_date=%s, accident_content=%s, accident_location=%s, state=%d",
//				this.tableName, Timestamp.valueOf(carAccidentHandling.getRequestDate()), Timestamp.valueOf(carAccidentHandling.getAccidentDate()),
//				carAccidentHandling.getAccidentContent(), carAccidentHandling.getAccidentLocation(), carAccidentHandling.getState().ordinal()
//		);
//		
//		return super.create(query);
//	}
//
//
//	public boolean delete(String id) {
//		String query = String.format("delete from %s where id=%s", this.tableName, id);
//		
//		return super.delete(query);
//	}
//
//	public ArrayList<CarAccidentHandling> retrieveAll() {
//		try{
//			String query = "select * from "+this.tableName;
//			ResultSet resultSet = super.retrieve(query);
//			if(resultSet==null) return null;
//			ArrayList<CarAccidentHandling> carAccidentHandlings = new ArrayList<>();
//			while(resultSet.next()){
//				CarAccidentHandling carAccidentHandling = getCurrentRecord(resultSet);
//				carAccidentHandlings.add(carAccidentHandling);
//			}
//			return carAccidentHandlings;
//		}catch (SQLException e) {
////			e.printStackTrace();
//			return null;
//		}
//	}
//
//	public CarAccidentHandling retrieveById(String id){
//		try{
//			String query = String.format("select * from "+this.tableName+" where id=%s", id);
//			
//			ResultSet resultSet = super.retrieve(query);
//			if(resultSet==null || !resultSet.next()) return null;
//			CarAccidentHandling carAccidentHandling = this.getCurrentRecord(resultSet);
//			return carAccidentHandling;
//		} catch (SQLException e){
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	public CarAccidentHandling retrieveByName(String name) {
//		try {
//			String query = String.format("select * from insurance where name='%s'", name);
//			
//			ResultSet resultSet = super.retrieve(query);
//			if(resultSet==null || !resultSet.next()) return null;
//			CarAccidentHandling carAccidentHandling = getCurrentRecord(resultSet);
//			return carAccidentHandling;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	private CarAccidentHandling getCurrentRecord(ResultSet resultSet) throws SQLException {
//		String id = resultSet.getString("id");
//		String contractId = resultSet.getString("contract_id");
//		LocalDateTime requestDate = resultSet.getTimestamp("request_date").toLocalDateTime();
//		LocalDateTime accidentDate = resultSet.getTimestamp("accident_date").toLocalDateTime();
//		String accidentContent = resultSet.getString("accident_content");
//		String accidentLocation = resultSet.getString("accident_location");
//		ECarAccidentHandlingState state = ECarAccidentHandlingState.values()[resultSet.getInt("state")];
//
//		CarAccidentHandling carAccidentHandling = new CarAccidentHandling();
//		carAccidentHandling.setId(id);
//		carAccidentHandling.setContractId(contractId);
//		carAccidentHandling.setRequestDate(requestDate);
//		carAccidentHandling.setAccidentDate(accidentDate);
//		carAccidentHandling.setAccidentContent(accidentContent);
//		carAccidentHandling.setAccidentLocation(accidentLocation);
//		carAccidentHandling.setState(state);
//		return carAccidentHandling;
//	}
}
