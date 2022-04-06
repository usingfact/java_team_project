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
			System.out.println("[[[����,ȸ�� ���� ���α׷� v1.0]]]");
			System.out.println("######################");
			System.out.println("1.�� �� ��");
			System.out.println("2.ȸ�� ����");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� Ż��");
			System.out.println("5.����");
			System.out.println("######################");
			System.out.print("�޴��� �����ϼ���: ");
			menu = s.nextInt();
		} catch (InputMismatchException ex) { // ���ڿ� �Է��� �������� ����ó��
			System.out.println("�ڡڡڡڡ� �ùٸ� �޴��� �Է��ϼ���! �ڡڡڡڡ�");
			s.next();
		}
		return menu;
	}
}
