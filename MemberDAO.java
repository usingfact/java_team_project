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

	public void MemberDTO() {// 회원정보 삽입
		members.add(new MemberDTO("customer1", "as1234", "김철수", "대구 서구 내당동"));
		members.add(new MemberDTO("customer2", "zx1234", "이영희", "대구 동구 신천4동"));
		members.add(new MemberDTO("customer3", "qw1234", "최영수", "대구 동구 안심1동"));
		members.add(new MemberDTO("customer4", "er1234", "김희재", "대구 중구 대봉1동"));
		members.add(new MemberDTO("customer5", "df1234", "서지희", "대구 수성구 범어1동"));
		members.add(new MemberDTO("manager", "admin1234", "서진수", "대구 수성구 범어1동"));
	}

	public void insertCustomerInfo() {// 회원가입
		String cusid;
		String cuspassword;
		String cusname;
		String cusaddress;		
		while (true) {
			System.out.print("가입시 이용할 아이디를 입력하세요:");
			cusid = sc.nextLine();
			if (ifOverlapId(cusid) == false) {
				System.out.println("이미 사용중인 아이디입니다!");	
				continue;
			}			
			break;
		}
		System.out.print("가입시 이용할 비밀번호를 입력하세요:");
		cuspassword = sc.nextLine();
		System.out.print("고객님의 이름을 입력해주세요:");
		cusname = sc.nextLine();
		System.out.print("고객님의 주소를 입력해주세요:");
		cusaddress = sc.nextLine();
		System.out.println(cusname + "님 회원가입을 환영합니다!");
		members.add(new MemberDTO(cusid, cuspassword, cusname, cusaddress));
	}

	public void Login() {// 로그인
		CarData Cdata = new CarData();
		Cdata.Car();
		while (true) {
			System.out.print("아이디를 입력 하세요:");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력 하세요:");
			String pass = sc.nextLine();
			for (int j = 0; j < members.size(); j++) {
				if (getMemberIndexid(id) == -1) {
					System.out.println("ID가 잘못되었습니다.");
					break;
				} else if (getMemberIndexid(id) != -1 && getMemberIndexps(pass) == -1) {
					System.out.println("비밀번호가 잘못 되었습니다.");
					break;
				} else if (getMemberIndexid(id) == getMemberIndexps(pass) && getMemberIndexid(id) != -1) {
					System.out.println("로그인 성공!");
					System.out.println("차량 매니지먼트로 접속중...");
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
							System.out.println("프로그램 종료!");
							System.exit(0); // 프로그램 강제 종료
						default:
							System.out.println(">>>> 올바른 메뉴을 입력하세요! <<<<");
							break;
						}
					}
				}
			}
			break;
		}
	}

	// 회원정보수정
	public void updateCustomerInfo() {
		System.out.print("정보를 수정할 회원 아이디를 입력하세요");
		String id = sc.nextLine();
		if (getMemberIndexid(id) != -1) {
			for (int j = 0; j < members.size(); j++) {
				if (members.get(j).getCusid().equals(id)) {
					System.out.print("변경할 비밀번호를 입력하세요:");
					String cpassword = sc.nextLine();
					System.out.print("변경할 이름을 입력하세요:");
					String cname = sc.nextLine();
					System.out.print("변경할 주소를 입력하세요:");
					String caddress = sc.nextLine();
					members.set(j, new MemberDTO(id, cpassword, cname, caddress));
					System.out.println(members.get(j).getCusname()+"님 변경한 내용이 저장되었습니다.");
				}
			}
		} else {
			System.out.println("아이디를 잘못 입력하셨습니다!");
		}
	}

	// 정보 삭제
	public void deleteCustomerInfo() {
		System.out.print("정보를 삭제할 회원 아이디를 입력하세요:");
		String id = sc.nextLine();
		if (getMemberIndexid(id) != -1) {
			System.out.print("정보를 삭제할 회원 비밀번호를 입력하세요:");
			String password = sc.nextLine();
			if (getMemberIndexid(id) == getMemberIndexps(password)) {
				System.out.println(members.get(getMemberIndexid(id)).getCusname() + "님의 정보가 삭제되었습니다!");
				members.remove(getMemberIndexid(id));
			}
		}

	}

	public int getMemberIndexid(String id) {// arraylist몇번째에 있는지 출력
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

	public boolean ifOverlapId(String id) {// 아이디 중복 확인
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
