package site.Member.Action;

import java.util.Scanner;

import site.DTO.AccountBean;
import site.DTO.Drop;
import site.Member.View.ProcessorView;

public class DropOut implements Action{
	ProcessorView processor;
	Drop drop;
	
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		drop = processor.DropOut(sc);
		
		if(drop.getDrop().equals("Y") || drop.getDrop().equals("y")) {
			site.Member.DAO.DropOut dropout = new site.Member.DAO.DropOut();
		} else {
			site.Member.View.MemberView.Fail();
		}
		
	}

}
