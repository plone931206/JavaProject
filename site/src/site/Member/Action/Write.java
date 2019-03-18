package site.Member.Action;

import java.util.Scanner;
import site.DTO.TextBean;
import site.Member.View.ProcessorView;

public class Write implements Action{
	ProcessorView processor;
	TextBean text;
	
	@Override
	public void execute(Scanner sc) {
		processor = new ProcessorView();
		text = processor.WriteView(sc);
		site.Member.DAO.Write write = new site.Member.DAO.Write(text);
	}
	
}
