package site.Admin.View;

import java.util.Scanner;

import site.Utils.FrontController;
import site.Admin.Action.*;


public class AdminMain {
	boolean Repeat = true;
	Scanner sc;
	AdminView view;
	FrontController frontcontroller;
	
	public AdminMain() {
		
		sc = new Scanner(System.in);
		view = new AdminView();
		frontcontroller = new FrontController();
		
		int menu = 0;
		site.Admin.Action.Action action = null;
		
		while(Repeat) {
			
			view.MainMenu();
			view.Menu();
			menu = Integer.parseInt(sc.next());
			
			if(menu == 1) {
				action = new MemberLookup();				
			} else if(menu == 2) {
				action = new MemberDelete();
			} else if(menu == 3) {
				action = new TextDelete();
			} else if(menu == 4) {
				Repeat = false;
				view.End();
				System.exit(1);
			} else {
				view.Miss();
			}
			if(action != null) {
				frontcontroller.Processor(action, sc);
			}
		}
	}
}
