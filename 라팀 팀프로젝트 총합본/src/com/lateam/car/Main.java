package com.lateam.car;

import com.lateam.car.management.CarData;
import com.lateam.car.management.MemberDAO;
import com.lateam.car.menu.LoginMenu;

public class Main {

	public static void main(String[] args) {
		LoginMenu lmenu = new LoginMenu();
		MemberDAO mdata = new MemberDAO();
		CarData Cdata = new CarData();
		mdata.MemberDTO();
		Cdata.Car();

		while (true) {
			switch (lmenu.menu()) {
			case LoginMenu.LOG_MENU_lOGIN:
				mdata.Login();
				break;
			case LoginMenu.LOG_MENU_SIGNUP:
				mdata.insertCustomerInfo();
				break;
			case LoginMenu.LOG_MENU_EDIT:
				mdata.updateCustomerInfo();
				break;
			case LoginMenu.LOG_MENU_DEL:
				mdata.deleteCustomerInfo();
				break;
			case LoginMenu.LOG_MENU_END:
				System.out.println("���α׷� ����!");
				System.exit(0); // ���α׷� ���� ����
			default:
				System.out.println(">>>> �ùٸ� �޴��� �Է��ϼ���! <<<<");
				break;
			}
		}
	}
}
