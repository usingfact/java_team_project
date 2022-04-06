package com.lateam.car.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsMenu {
	public static final int INS_MENU_ALL = 1;
	public static final int INS_MENU_CON = 2;
	public static final int INS_MENU_ADD = 3;
	public static final int INS_MENU_EDIT = 4;
	public static final int INS_MENU_DEL = 5;
	public static final int INS_MENU_EXIT = 6;

	Scanner s = new Scanner(System.in);

	public int menu() {
		int menu = 0;
		try {
			System.out.println("[[[차량 매니지먼트]]]");
			System.out.println("1.차량정보 모두조회");
			System.out.println("2.차량정보 조건조회");
			System.out.println("3.차량정보 추가");
			System.out.println("4.차량정보 수정");
			System.out.println("5.차량정보 삭제");
			System.out.println("6.프로그램 종료");
			System.out.println("★★★★★★★★★★★★★★");
			System.out.print("메뉴를 선택하세요: ");
			menu = s.nextInt();
		} catch (InputMismatchException ex) { // 문자열 입력을 막기위해 예외처리
			System.out.println("★★★★★ 올바른 메뉴를 입력하세요! ★★★★★");
			s.next();
		}
		return menu;
	}
}
