package site.User.View;

public class UserView {
	
	public void MainMenu() {
		System.out.println("=====1.회원가입  2.회원 로그인  3.관리자 로그인  4.종료=====");
	}
	
	public void Menu() {
		System.out.print("memu = ");
	}
	
	public void Miss() {
		System.out.println("메뉴 선택이 올바르지 않습니다");
	}
	
	public void End() {
		System.out.println("종료되었습니다");
	}
	
	public static void LoginFailed() {
		System.out.println("로그인에 실패하셨습니다");
	}
	
}
