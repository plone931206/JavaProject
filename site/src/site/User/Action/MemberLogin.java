package site.User.Action;

import java.util.Scanner;

import site.DTO.AccountBean;
import site.User.View.ProcessorView;
import site.User.View.UserView;

//로그인 화면  로그인 성공시  MemberView 패키지에 있는 메인으로 넘어감 
public class MemberLogin implements Action{
	UserView view;
	ProcessorView processor;
	AccountBean account;
	
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		account = processor.MemberLoginView(sc); // DTO에 로그인뷰(스캐너)에서 작업한 내용을 보냄
		site.DAO.MemberLogin login = new site.DAO.MemberLogin(account);
	}

}
