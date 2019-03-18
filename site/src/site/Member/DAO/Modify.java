package site.Member.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import site.DTO.AccountBean;
import site.User.View.ProcessorView;

public class Modify {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	ProcessorView view;
	
	public Modify(AccountBean Bean) {
		int count;
		String IDNum = site.DAO.MemberLogin.Member_ID_Num;
		
		try {
			DBCon = new DBConnection();
			String sql = "Update MemberTable set Pass = ?, NickName = ?, Name = ?, Email = ?, PhoneNum = ? where Id_Num= ?";
			PreparedStatement pstmt = DBCon.connection.prepareStatement(sql);
			
			pstmt.setString(1, Bean.getPass());
			pstmt.setString(2, Bean.getNickName());
			pstmt.setString(3, Bean.getName());
			pstmt.setString(4, Bean.getEmail());
			pstmt.setString(5, Bean.getPhoneNum());
			pstmt.setString(6, site.DAO.MemberLogin.Member_ID_Num);
			
			count = pstmt.executeUpdate();
			
			if(count > 0) {
				site.Member.View.MemberView.Success();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
