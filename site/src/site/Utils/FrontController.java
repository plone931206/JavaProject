package site.Utils;

import java.util.*;

import site.User.Action.*;


//유저,멤머 액션으로 전달 

public class FrontController {
	
	//멤버 메인에 있는 프로세서를 담당하는 메서드
	public void Processor(site.Member.Action.Action action, Scanner sc) {
		action.execute(sc);
		
	}
	//관리자 메인에 있는 프로세서를 담당하는 메서드
	public void Processor(site.Admin.Action.Action action, Scanner sc) {
		action.execute(sc);
		
	}
	//유저 메인에 있는 프로세서를 담당하는 메서드
	public void Processor(Action action, Scanner sc) {
		action.execute(sc);
		
	}

}
