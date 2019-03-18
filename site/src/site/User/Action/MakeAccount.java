package site.User.Action;

import java.util.Scanner;

import site.DTO.AccountBean;
import site.User.View.ProcessorView;
import site.User.View.UserView;

//회원가입처리를 담당하는 클래스 
public class MakeAccount implements Action{
	UserView view;
	ProcessorView processor;
	AccountBean account;
	
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		account = processor.addAccountView(sc);
		site.DAO.MakeAccount make = new site.DAO.MakeAccount(account);
		
		
		
		
	}

}
