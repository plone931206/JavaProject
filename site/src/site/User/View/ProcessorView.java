package site.User.View;

import java.util.Scanner;

import site.DTO.AccountBean;

public class ProcessorView {
	
	public AccountBean addAccountView(Scanner sc) {
		System.out.print("아이디 입력 = ");
		String Id = sc.next();
		
		System.out.print("비밀번호 입력 = ");
		String Pass = sc.next();
		
		System.out.print("닉네임 입력 = ");
		String NickName = sc.next();
		
		System.out.print("이름 입력 = ");
		String Name = sc.next();
		
		System.out.print("이메일 입력 = ");
		String Email = sc.next();
		
		System.out.print("핸드폰 번호 입력 = ");
		String PhoneNum = sc.next();
		
		return new AccountBean(Id, Pass, NickName, Name, Email, PhoneNum);
	}
		
	public AccountBean MemberLoginView(Scanner sc) {
		System.out.print("아이디 입력 = ");
		String Id = sc.next();
		
		System.out.print("비밀번호 입력 = ");
		String Pass = sc.next();
		
		return new AccountBean(Id, Pass);
		
	}
	
	public AccountBean AdminLoginView(Scanner sc) {
		System.out.print("아이디 입력 = ");
		String Id = sc.next();
		
		System.out.print("비밀번호 입력 = ");
		String Pass = sc.next();
		
		return new AccountBean(Id, Pass);
	}

}
