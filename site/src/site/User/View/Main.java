package site.User.View;

import java.util.*;
import site.User.Action.*;
import site.Utils.FrontController;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserView view = new UserView();
		boolean Repeat = true;
		FrontController frontcontroller = new FrontController();
		int menu = 0;
		
		Action action = null;
		
		
		while(Repeat) {
			
		
		view.MainMenu();
		view.Menu();
		menu = Integer.parseInt(sc.next());
		
		if(menu == 1) {
			action = new MakeAccount();
		} else if(menu == 2) {
			action = new MemberLogin();
		} else if(menu == 3) {
			action = new AdminLogin();
		} else if(menu == 4) {
			Repeat = false;
			view.End();
			System.exit(0);
		} else {
			view.Miss();
		}
		
		if(action != null) {
			frontcontroller.Processor(action, sc);
		}
		
		}

	}

}
