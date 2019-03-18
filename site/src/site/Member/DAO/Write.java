package site.Member.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import site.DTO.TextBean;

//글 작성을 담당하는 클래스

public class Write {
	DBConnection DBCon;
	PreparedStatement pstmt = null;
	Connection con = null;
	ResultSet resultset; // 명령이 성공적으로 실행되면  이 값이 반환됨 
	String sql;
	
	public Write(TextBean Bean) {
		int count;
		
		try {
			DBCon = new DBConnection();
			
			String sql = "Insert INto Borad Values(null,?)";
			PreparedStatement pstmt = DBCon.connection.prepareStatement(sql);
		
			pstmt.setString(1, Bean.getText());
			
			count = pstmt.executeUpdate();
			
			if(count>0) {
				site.Member.View.MemberView.Writed();
			} else {
				site.Member.View.MemberView.NotWrited();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
