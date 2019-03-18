package site.Member.View;

import java.util.Scanner;
import site.DTO.AccountBean;
import site.DTO.Drop;
import site.DTO.TextBean;

public class ProcessorView {
	
	public AccountBean ModifyView(Scanner sc) {
		
		System.out.print("수정 하실 비밀번호 입력 = ");
		String Pass = sc.next();
		
		System.out.print("수정 하실 닉네임 입력 = ");
		String NickName = sc.next();
		
		System.out.print("수정 하실 이름 입력 = ");
		String Name = sc.next();
		
		System.out.print("수정 하실 이메일 입력 = ");
		String Email = sc.next();
		
		System.out.print("수정 하실 핸드폰 번호 입력 = ");
		String PhoneNum = sc.next();
		
		return new AccountBean(Pass, NickName, Name, Email, PhoneNum);
	}
	
	public TextBean WriteView(Scanner sc) {
		System.out.print("게시판에 작성하실 내용을 적어주세요 : ");
		String text = sc.nextLine();
		
		return new TextBean(text);
	}
	
	public Drop DropOut(Scanner sc) {
		System.out.println("정말로 탈퇴하시겠습니까?");
		System.out.println(" Y를 입력하시면 탈퇴 됩니다: ");
		String text = sc.next();
		
		return new Drop(text);	
		}
		
		
	}


