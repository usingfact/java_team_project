package com.lateam.car.management;

import java.util.ArrayList;
import java.util.Scanner;

import com.lateam.car.menu.CarSearchMenu;
import com.lateam.car.menu.InsMenu;

public class MemberDAO {
	ArrayList<MemberDTO> members = new ArrayList<>();
	InsMenu imenu = new InsMenu();
	CarData Cdata = new CarData();
	CarSearchMenu Cmenu = new CarSearchMenu();
	Scanner sc = new Scanner(System.in);

	public void MemberDTO() {// ȸ������ ����
		members.add(new MemberDTO("customer1", "as1234", "��ö��", "�뱸 ���� ���絿"));
		members.add(new MemberDTO("customer2", "zx1234", "�̿���", "�뱸 ���� ��õ4��"));
		members.add(new MemberDTO("customer3", "qw1234", "�ֿ���", "�뱸 ���� �Ƚ�1��"));
		members.add(new MemberDTO("customer4", "er1234", "������", "�뱸 �߱� ���1��"));
		members.add(new MemberDTO("customer5", "df1234", "������", "�뱸 ������ ����1��"));
		members.add(new MemberDTO("manager", "admin1234", "������", "�뱸 ������ ����1��"));
	}

	public void insertCustomerInfo() {// ȸ������
		String cusid;
		String cuspassword;
		String cusname;
		String cusaddress;		
		while (true) {
			System.out.print("���Խ� �̿��� ���̵� �Է��ϼ���:");
			cusid = sc.nextLine();
			if (ifOverlapId(cusid) == false) {
				System.out.println("�̹� ������� ���̵��Դϴ�!");	
				continue;
			}			
			break;
		}
		System.out.print("���Խ� �̿��� ��й�ȣ�� �Է��ϼ���:");
		cuspassword = sc.nextLine();
		System.out.print("������ �̸��� �Է����ּ���:");
		cusname = sc.nextLine();
		System.out.print("������ �ּҸ� �Է����ּ���:");
		cusaddress = sc.nextLine();
		System.out.println(cusname + "�� ȸ�������� ȯ���մϴ�!");
		members.add(new MemberDTO(cusid, cuspassword, cusname, cusaddress));
	}

	public void Login() {// �α���
		CarData Cdata = new CarData();
		Cdata.Car();
		while (true) {
			System.out.print("���̵� �Է� �ϼ���:");
			String id = sc.nextLine();
			System.out.print("��й�ȣ�� �Է� �ϼ���:");
			String pass = sc.nextLine();
			for (int j = 0; j < members.size(); j++) {
				if (getMemberIndexid(id) == -1) {
					System.out.println("ID�� �߸��Ǿ����ϴ�.");
					break;
				} else if (getMemberIndexid(id) != -1 && getMemberIndexps(pass) == -1) {
					System.out.println("��й�ȣ�� �߸� �Ǿ����ϴ�.");
					break;
				} else if (getMemberIndexid(id) == getMemberIndexps(pass) && getMemberIndexid(id) != -1) {
					System.out.println("�α��� ����!");
					System.out.println("���� �Ŵ�����Ʈ�� ������...");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					while (true) {
						switch (imenu.menu()) {
						case InsMenu.INS_MENU_ALL:
							Cdata.CarAll();
							break;
						case InsMenu.INS_MENU_CON:
							while (true) {
								int searchMenu = Cmenu.SearchMenu();
								if (searchMenu == CarSearchMenu.INS_SEARCH_NAME) {
									String carname = Cmenu.getSearchCarName();
									Cdata.ConCarName(carname);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_PROV) {
									String provider = Cmenu.getSearchProvider();
									Cdata.ConCarProvider(provider);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_COLOR) {
									String color = Cmenu.getSearchColor();
									Cdata.ConCarColor(color);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_ACC) {
									String accident = Cmenu.getSearchAccident();
									Cdata.ConCarAccident(accident);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_FUEL) {
									String fuel = Cmenu.getSearchFuel();
									Cdata.ConCarAccident(fuel);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_TRANS) {
									String trans = Cmenu.getSearchTrans();
									Cdata.ConCarTrans(trans);
								} else if (searchMenu == CarSearchMenu.INS_SEARCH_EXIT) {
									break;
								}
							}
							break;
						case InsMenu.INS_MENU_ADD:
							Cdata.CarAdd();
							break;
						case InsMenu.INS_MENU_EDIT:
							Cdata.CarEdit();
							break;
						case InsMenu.INS_MENU_DEL:
							Cdata.CarDelete();
							break;
						case InsMenu.INS_MENU_EXIT:
							System.out.println("���α׷� ����!");
							System.exit(0); // ���α׷� ���� ����
						default:
							System.out.println(">>>> �ùٸ� �޴��� �Է��ϼ���! <<<<");
							break;
						}
					}
				}
			}
			break;
		}
	}

	// ȸ����������
	public void updateCustomerInfo() {
		System.out.print("������ ������ ȸ�� ���̵� �Է��ϼ���");
		String id = sc.nextLine();
		if (getMemberIndexid(id) != -1) {
			for (int j = 0; j < members.size(); j++) {
				if (members.get(j).getCusid().equals(id)) {
					System.out.print("������ ��й�ȣ�� �Է��ϼ���:");
					String cpassword = sc.nextLine();
					System.out.print("������ �̸��� �Է��ϼ���:");
					String cname = sc.nextLine();
					System.out.print("������ �ּҸ� �Է��ϼ���:");
					String caddress = sc.nextLine();
					members.set(j, new MemberDTO(id, cpassword, cname, caddress));
					System.out.println(members.get(j).getCusname()+"�� ������ ������ ����Ǿ����ϴ�.");
				}
			}
		} else {
			System.out.println("���̵� �߸� �Է��ϼ̽��ϴ�!");
		}
	}

	// ���� ����
	public void deleteCustomerInfo() {
		System.out.print("������ ������ ȸ�� ���̵� �Է��ϼ���:");
		String id = sc.nextLine();
		if (getMemberIndexid(id) != -1) {
			System.out.print("������ ������ ȸ�� ��й�ȣ�� �Է��ϼ���:");
			String password = sc.nextLine();
			if (getMemberIndexid(id) == getMemberIndexps(password)) {
				System.out.println(members.get(getMemberIndexid(id)).getCusname() + "���� ������ �����Ǿ����ϴ�!");
				members.remove(getMemberIndexid(id));
			}
		}

	}

	public int getMemberIndexid(String id) {// arraylist���°�� �ִ��� ���
		int i = 0;
		for (MemberDTO memberDTO : members) {
			if (memberDTO.getCusid().equals(id) == true) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public int getMemberIndexps(String password) {
		int i = 0;
		for (MemberDTO memberDTO : members) {
			if (memberDTO.getCuspassword().equals(password) == true) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean ifOverlapId(String id) {// ���̵� �ߺ� Ȯ��
		int index = getMemberIndexid(id);
		if (index == -1) {
			return true;
		}
		return false;
	}

	public ArrayList<MemberDTO> getmembers() {
		return members;
	}
}
