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
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("�������� ���ǰ˻�");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("1.�̸����� �˻�");
		System.out.println("2.������� �˻�");
		System.out.println("3.�������� �˻�");
		System.out.println("4.��������� �˻�");
		System.out.println("5.��뿬��� �˻�");
		System.out.println("6.����&����� �˻�");
		System.out.println("7.������");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.print("������ �����ϼ���: ");
		menu = s.nextInt();
		}
		catch (InputMismatchException ex) {
			System.out.println(">>>> �ùٸ� �޴��� �Է��ϼ���! <<<<");
			s.next();
		}
		return menu;
	}
	
	public String getSearchCarName() {
		System.out.print("���� �̸��� �Է��ϼ���: ");
		return s.next();
	}
	public String getSearchProvider() {
		System.out.print("�����縦 �Է��ϼ���: ");
		return s.next();
	}
	public String getSearchColor() {
		System.out.print("������ �Է��ϼ���: ");
		return s.next();
	}
	public String getSearchAccident() {
		System.out.print("��� ��,���� �Է��ϼ���: ");
		return s.next();
	}
	public String getSearchFuel() {
		System.out.print("��뿬�Ḧ �Է��ϼ���: ");
		return s.next();
	}
	public String getSearchTrans() {
		System.out.print("����&���並 �Է��ϼ���: ");
		return s.next();
	}
}
