package site.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import site.DTO.AccountBean;

public class InsertAccount {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet rs; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	public InsertAccount(AccountBean Bean){
		boolean result = false;
		int count;
		
		try {
			DBCon = new DBConnection();
			
			String sql = "Update MemberTable set ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(2, Bean.getId());
			pstmt.setString(3, Bean.getPass());
			pstmt.setString(4, Bean.getNickName());
			pstmt.setString(5, Bean.getName());
			pstmt.setString(6, Bean.getEmail());
			pstmt.setString(7, Bean.getPhoneNum());

			
			count = pstmt.executeUpdate();
			
			if(count>0) {
				result = true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
