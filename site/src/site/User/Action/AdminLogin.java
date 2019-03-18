package site.User.Action;

import java.util.Scanner;

import site.DTO.AccountBean;
import site.User.View.ProcessorView;
import site.User.View.UserView;

public class AdminLogin implements Action{
	ProcessorView processor;
	AccountBean account;
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		account = processor.AdminLoginView(sc);
		site.DAO.AdminLogin login = new site.DAO.AdminLogin(account);
		
	}

}
