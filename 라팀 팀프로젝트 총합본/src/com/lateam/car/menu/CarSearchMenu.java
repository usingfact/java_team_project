package com.lateam.car.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarSearchMenu {
	public static final int INS_SEARCH_NAME = 1;
	public static final int INS_SEARCH_PROV = 2;
	public static final int INS_SEARCH_COLOR = 3;
	public static final int INS_SEARCH_ACC = 4;
	public static final int INS_SEARCH_FUEL = 5;
	public static final int INS_SEARCH_TRANS = 6;
	public static final int INS_SEARCH_EXIT = 7;
	
	Scanner s = new Scanner(System.in);
	
	public int SearchMenu() {
		int menu=0;
		try {
		System.out.println("★★★★★★★★★★★★★★");
		System.out.println("차량정보 조건검색");
		System.out.println("★★★★★★★★★★★★★★");
		System.out.println("1.이름으로 검색");
		System.out.println("2.제조사로 검색");
		System.out.println("3.색상으로 검색");
		System.out.println("4.사고유무로 검색");
		System.out.println("5.사용연료로 검색");
		System.out.println("6.수동&오토로 검색");
		System.out.println("7.나가기");
		System.out.println("★★★★★★★★★★★★★★");
		System.out.print("조건을 선택하세요: ");
		menu = s.nextInt();
		}
		catch (InputMismatchException ex) {
			System.out.println(">>>> 올바른 메뉴를 입력하세요! <<<<");
			s.next();
		}
		return menu;
	}
	
	public String getSearchCarName() {
		System.out.print("차량 이름을 입력하세요: ");
		return s.next();
	}
	public String getSearchProvider() {
		System.out.print("제조사를 입력하세요: ");
		return s.next();
	}
	public String getSearchColor() {
		System.out.print("색상을 입력하세요: ");
		return s.next();
	}
	public String getSearchAccident() {
		System.out.print("사고 유,무를 입력하세요: ");
		return s.next();
	}
	public String getSearchFuel() {
		System.out.print("사용연료를 입력하세요: ");
		return s.next();
	}
	public String getSearchTrans() {
		System.out.print("수동&오토를 입력하세요: ");
		return s.next();
	}
}
