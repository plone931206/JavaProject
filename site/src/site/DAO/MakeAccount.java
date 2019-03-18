package site.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import site.DTO.AccountBean;

//회원가입 처리를 담당하는 클래스

public class MakeAccount {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	public MakeAccount(AccountBean Bean){
		int count;
		
		try {
			DBCon = new DBConnection();
			
			String sql = "Insert Into MemberTable Values(null,?,?,?,?,?,?)";
			PreparedStatement pstmt = DBCon.connection.prepareStatement(sql);
			
			pstmt.setString(1, Bean.getId());
			pstmt.setString(2, Bean.getPass());
			pstmt.setString(3, Bean.getNickName());
			pstmt.setString(4, Bean.getName());
			pstmt.setString(5, Bean.getEmail());
			pstmt.setString(6, Bean.getPhoneNum());
	
			count = pstmt.executeUpdate();
			
			if(count>0) {
				System.out.println(Bean.getName()+"님의 회원가입이 완료되었습니다.");
			} else {
				System.out.println(Bean.getName()+"님의 회원가입이 실패하였습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}

	
}
