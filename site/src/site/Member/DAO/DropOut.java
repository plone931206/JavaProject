package site.Member.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import site.DTO.Drop;

public class DropOut {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	public DropOut() {
		int count;
		
		try {
			DBCon = new DBConnection();
			String sql = "Delete From MemberTable where Id_num = ?";
			PreparedStatement pstmt = DBCon.connection.prepareStatement(sql);
			
			pstmt.setString(1, site.DAO.MemberLogin.Member_ID_Num);
			
			count = pstmt.executeUpdate();
			
			if(count > 0) {
				site.Member.View.MemberView.DropSuccess();
			} else {
				site.Member.View.MemberView.NotDrop();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
