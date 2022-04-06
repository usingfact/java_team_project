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
			System.out.println("[[[���� �Ŵ�����Ʈ]]]");
			System.out.println("1.�������� �����ȸ");
			System.out.println("2.�������� ������ȸ");
			System.out.println("3.�������� �߰�");
			System.out.println("4.�������� ����");
			System.out.println("5.�������� ����");
			System.out.println("6.���α׷� ����");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.print("�޴��� �����ϼ���: ");
			menu = s.nextInt();
		} catch (InputMismatchException ex) { // ���ڿ� �Է��� �������� ����ó��
			System.out.println("�ڡڡڡڡ� �ùٸ� �޴��� �Է��ϼ���! �ڡڡڡڡ�");
			s.next();
		}
		return menu;
	}
}
