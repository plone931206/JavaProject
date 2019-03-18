package site.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import site.DTO.AccountBean;

//회원 삭제를 담당하는 클래스

public class DeleteMember {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet rs; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	public DeleteMember(AccountBean Bean){
		boolean result = false;
		int count;
		
		try {
			DBCon = new DBConnection();
			String sql = "Delete From MemberTable Where ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(5, Bean.getName());
			
			count = pstmt.executeUpdate();
			
			if(count>0) {
				result = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
