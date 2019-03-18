package site.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import site.DTO.AccountBean;
import site.User.View.ProcessorView;

public class MemberLogin {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	ProcessorView view;
	public static String Member_ID_Num;  // 로그인에 성공한 아이디 넘버를 저장하는 변수,  로그인 후 액션에서 사용
	
	public MemberLogin(AccountBean Bean){
	
		try {
			DBCon = new DBConnection();
			
			String sql = "Select * from MemberTable";
			PreparedStatement pstmt = DBConnection.connection.prepareStatement(sql);
			resultset = pstmt.executeQuery(sql);
			
			while(resultset.next()) {
				
				if(Bean.getId().equals(resultset.getString(2)) && 
						Bean.getPass().equals(resultset.getString(3))){
					Member_ID_Num = resultset.getString(1);
				
					System.out.println(resultset.getString(5)+"님 로그인에 성공하셨습니다");
					
					site.Member.View.MemberMain membermain = new site.Member.View.MemberMain();
					
				}
												
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		site.User.View.UserView.LoginFailed();// 위조건이 다 실행 되고  로그인 되지 않고 나올경우 출력 문장 위치
	}
}
