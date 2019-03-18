package site.Member.View;

import java.util.*;
import site.Member.Action.*;
import site.Utils.FrontController;


public class MemberMain {
	boolean Repeat = true;
	Scanner sc;
	MemberView view;
	FrontController frontcontroller;
	
	public MemberMain(){
		
		sc = new Scanner(System.in);
		view = new MemberView();
		frontcontroller = new FrontController();
		
		int menu = 0;
		site.Member.Action.Action action = null;
		
		while(Repeat) {
		
		view.MainMenu();
		view.Menu();
		menu = Integer.parseInt(sc.next());
		
		if(menu == 1) {
			action = new Modify();
		} else if(menu == 2) {
			action = new Write();
		} else if(menu == 3) {
			action = new DropOut();
		} else if(menu == 4){
			Repeat = false;
			view.End();
			System.exit(1); //시스템 종료 
		} else {
			view.Miss();
		}
		if(action != null) {
			frontcontroller.Processor(action, sc);
		}
		
		}
		
	}
}
