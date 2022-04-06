package com.lateam.car.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginMenu {

	public static final int LOG_MENU_lOGIN = 1;
	public static final int LOG_MENU_SIGNUP = 2;
	public static final int LOG_MENU_EDIT = 3;
	public static final int LOG_MENU_DEL = 4;
	public static final int LOG_MENU_END = 5;

	Scanner s = new Scanner(System.in);

	public int menu() {
		int menu = 0;
		try {
			System.out.println("######################");
			System.out.println("[[[차량,회원 관리 프로그램 v1.0]]]");
			System.out.println("######################");
			System.out.println("1.로 그 인");
			System.out.println("2.회원 가입");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 탈퇴");
			System.out.println("5.종료");
			System.out.println("######################");
			System.out.print("메뉴를 선택하세요: ");
			menu = s.nextInt();
		} catch (InputMismatchException ex) { // 문자열 입력을 막기위해 예외처리
			System.out.println("★★★★★ 올바른 메뉴를 입력하세요! ★★★★★");
			s.next();
		}
		return menu;
	}
}
