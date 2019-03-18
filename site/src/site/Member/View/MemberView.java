package site.Member.View;

public class MemberView {
	
	public void MainMenu() {
		System.out.println("=====1.내정보수정하기 2.글쓰기 3.회원탈퇴 4.종료 =====");
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
	
	public static void Success() {
		System.out.println("회원정보가 갱신되었습니다");
	}
	
	public static void Writed() {
		System.out.println("성공적으로 글이 작성되었습니다.");
	}
	
	public static void NotWrited() {
		System.out.println("글 작성에 실패하였습니다.");
	}
	
	public static void DropSuccess() {
		System.out.println("회원탈퇴에 성공하셨습니다.");
	}
	public static void NotDrop() {
		System.out.println("회원탈퇴에 실패하셨습니다.");
	}
	public static void Fail() {
		System.out.println("취소하셨습니다.");
	}
	}


