package site.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import site.DTO.AccountBean;
import site.User.View.ProcessorView;

public class AdminLogin {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	ProcessorView view;
	
	public AdminLogin(AccountBean Bean) { // 매개변수 안에  빈 생성 

		try {
			DBCon = new DBConnection();
			
			String sql = "Select * from AdminTable";
			PreparedStatement pstmt = DBConnection.connection.prepareStatement(sql);
			resultset = pstmt.executeQuery(sql);
			
			while(resultset.next()) {
				
				if(Bean.getId().equals(resultset.getString(2)) &&
						Bean.getPass().equals(resultset.getString(3))) {
					
					System.out.println(resultset.getString(4)+"님 로그인에 성공하셨습니다.");
					site.Admin.View.AdminMain adminmain = new site.Admin.View.AdminMain();
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		site.User.View.UserView.LoginFailed(); // 위조건이 다 실행 되고  로그인 되지 않고 나올경우 출력 문장 위치
	}
}
