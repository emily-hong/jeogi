package com.stay.dao;

import java.sql.Connection;	// 데이터베이스와의 연결을 나타내는 클래스 
import java.sql.DriverManager;  // JDBC 드라이버를 통해 데이터베이스 연결을 관리하는 클래스 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;  // SQL 관련 예외를 처리하기 위한 클래스 
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.stay.exception.DMLException;
import com.stay.exception.RecordNotFoundException;
import com.stay.vo.AccommodationAmenities;
import com.stay.vo.AccommodationInfo;

import config.ServerInfo;	// 서버정보를 담고있는 클래

// ReserveDao 클래스는 데이터베이스와의 연결 및 예약 관련 작업을 처리하는 DAO(Data Access Object) 클래스
public class ReserveDao {
	// 싱글톤 패턴을 사용하여, 하나의 ReserveDao 인스턴스만 생성하여 사용하도록 한다.
	public static ReserveDao dao = new ReserveDao();
	
	// private 생성사를 사용하여 외부에서 인스턴스를 생성하지 못하도록 한다.
	private ReserveDao() {
		try {
			// JDBC 드라이버를 로드한다.
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading 성공");
		}catch (ClassNotFoundException e) {
			// 드라이버 로딩이 실패한 경우 에러 메시지를 출력한다. 
			System.out.println("Driver Loading 실패");
		}
	}
	// 싱글톤 인스턴스를 반환하는 메서드 
	public static ReserveDao getInstance() {
		return dao;
	}
	
	// 데이터베이스 연결을 반환하는 메서드 
	public Connection getConnection() throws SQLException{
		// DriverManager를 통해 데이터베이스에 연결하고, Connection 객체를 반환한다. 
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		return conn;
	}
	
	// TODO 조회: 기본 조회(id순)
	public ArrayList<AccommodationInfo> find(String location) throws SQLException {
	    ArrayList<AccommodationInfo> list = new ArrayList<>();
	    String query = "SELECT id, name, address, contact_number, operating_hours, star_rating, description, accommodation_type FROM AccommodationInfo WHERE address LIKE ? order by id;";
	    
	    try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
	        ps.setString(1, location + "%");
	        ResultSet rs = ps.executeQuery();
	        	
	            while (rs.next()) {
	                list.add(new AccommodationInfo(
	                    rs.getString("id"), 
	                    rs.getString("name"), 
	                    rs.getString("address"), 
	                    rs.getString("contact_number"),
	                    rs.getString("operating_hours"),
	                    rs.getString("star_rating"),
	                    rs.getString("description"),
	                    rs.getString("accommodation_type")
	                ));
	            }
	            
	            if(list.size() == 0) {
	            	System.out.println("검색결과가 없습니다.");
	            }
	        } 	    
	    return list;
	}

	// TODO 조회: 필터선택 (무료주차, 반려견동반, 사우나/찜질방, 픽업가능) - findByFilter
	public ArrayList<AccommodationInfo> findByfilter(String location, ArrayList<String> filterOptions, String sortOption) throws SQLException {
	    ArrayList<AccommodationInfo> list = new ArrayList<>();
	    
	    String query = "SELECT a.id, a.name, a.address, a.contact_number, a.operating_hours, a.star_rating, a.description, a.accommodation_type\n"
	    		+ "FROM AccommodationInfo a\n"
	    		+ "JOIN AccommodationAmenities m ON a.id = m.AccommodationInfo_id\n"
	    		+ "WHERE a.address LIKE ?\n"
	    		+ "AND m.name IN (";
	    
        for(int i = 0; i < filterOptions.size(); i++) {
        	// 옵션 리스트 순회하며 옵션 요소를 쿼리에 붙임
        	query += "'" + filterOptions.get(i)+ "',";
        	
        }
        query = query.substring(0, query.length() - 1); // 마지막 , 제거
        query += ") GROUP BY a.id HAVING COUNT(DISTINCT m.name)=" + filterOptions.size(); // 옵션들을 옵션개수만큼 다 갖고있는 쿼리를 중복제거한 다음 추출

	    try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
		        ps.setString(1, location + "%");
		        
		        ResultSet rs = ps.executeQuery();
		        
	            while (rs.next()) {
	                list.add(new AccommodationInfo(
	                    rs.getString("id"), 
	                    rs.getString("name"), 
	                    rs.getString("address"), 
	                    rs.getString("contact_number"),
	                    rs.getString("operating_hours"),
	                    rs.getString("star_rating"),
	                    rs.getString("description"),
	                    rs.getString("accommodation_type")
	                ));
	            }
	            if(list.size() == 0) {
	            	System.out.println("검색결과가 없습니다.");
	            }
	        }
	    return list;
	}

	// TODO 조회: 평점 높은순(default) 
//	public ArrayList<AccommodationInfo> findByRatingCount(String location) throws DMLException{
//		ArrayList<AccommodationInfo> list = new ArrayList<>();
//		ResultSet rs = null;
//		String query = "";
//		return list;
//	}
	// TODO 조회: 리뷰 많은순 - findByReviewCount
	// TODO 조회: 낮은 가격순 - findByMinPrice
		
		
		
	


}
