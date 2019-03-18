package site.Member.Action;

import java.util.Scanner;

import site.DTO.AccountBean;
import site.Member.View.ProcessorView;

public class Modify implements Action {
	ProcessorView processor;
	AccountBean account;
	
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		account = processor.ModifyView(sc);
		site.Member.DAO.DropOut dropout = new site.Member.DAO.DropOut();
		
	}

}
