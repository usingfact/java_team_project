package com.lateam.car.management;

import java.util.ArrayList;
import java.util.Scanner;

public class CarData {
	Scanner s = new Scanner(System.in);
	ArrayList<Car> carList = new ArrayList<Car>();
	boolean flag = true;

	public void Car() {

		carList.add(new Car("코나", "현대", "흰색", "2020-01-01", "2021-01-01", "1500", "무사고", "2200", "5000", "디젤", "오토"));
		carList.add(new Car("소나타", "현대", "은색", "2020-02-01", "2021-01-01", "1300", "무사고", "1800", "10000", "디젤", "오토"));
		carList.add(new Car("에쿠스", "현대", "검은색", "2020-03-01", "2021-01-01", "3500", "무사고", "2500", "2500", "디젤", "오토"));
		carList.add(new Car("아반뗴", "현대", "파란색", "2020-04-01", "2021-01-01", "1200", "무사고", "1800", "2000", "디젤", "오토"));
		carList.add(new Car("그렌저", "현대", "흰색", "2020-05-01", "2021-01-01", "3200", "무사고", "2400", "6000", "디젤", "오토"));
		carList.add(new Car("봉고3", "현대", "흰색", "2020-06-01", "2021-01-01", "3000", "무사고", "2000", "15000", "디젤", "수동"));
		carList.add(new Car("SM3", "르노삼성", "흰색", "2019-01-01", "2021-01-01", "2000", "무사고", "2000", "16000", "가솔린,디젤",
				"오토"));
		carList.add(new Car("SM5", "르노삼성", "흰색", "2019-05-01", "2021-01-01", "2200", "무사고", "2000", "5000", "가솔린,디젤",
				"오토"));
		carList.add(
				new Car("SM7", "르노삼성", "흰색", "2019-09-01", "2021-01-01", "2300", "사고", "2000", "3000", "LPG,디젤", "오토"));
		carList.add(
				new Car("티볼리", "쌍용", "검은색", "2020-12-01", "2021-03-01", "3000", "무사고", "3000", "6000", "가솔린", "오토"));
		carList.add(new Car("렉스턴", "쌍용", "흰색", "2020-06-01", "2021-03-01", "2000", "사고", "2600", "25000", "가솔린", "오토"));
		carList.add(
				new Car("코란도", "쌍용", "파란색", "2020-09-01", "2021-03-01", "2400", "무사고", "2800", "4000", "가솔린", "오토"));
	}

	public void CarAll() {
		System.out.println("차량정보 모두조회");

		if (carList.isEmpty())
			System.out.println("입력된 차량 정보가 없습니다.");

		else {
			for (int i = 0; i < carList.size(); i++) {
				Car car = carList.get(i);
				car.CarInfo();
			}
		}
	}

	// 차량조건조회

	public void ConCarName(String carname) { // 차량명
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String CName = s.getCarname();
			if (CName.equals(carname)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarProvider(String provider) { // 제조사

		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Pro = s.getProvider();
			if (Pro.equals(provider)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarColor(String color) { // 색상
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Color = s.getColor();
			if (Color.equals(color)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarAccident(String accident) { // 사고유무
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Acc = s.getAccident();
			if (Acc.equals(accident)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarFuel(String fuel) { // 사용연료
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Fuel = s.getFuel();
			if (Fuel.equals(fuel)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarTrans(String trans) { // 수동&오토
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Trans = s.getTrans();
			if (Trans.equals(trans)) {
				s.CarInfo();
			}
		}
	}

	public void CarAdd() { // 차량정보 추가
		System.out.println("-------------------");
		System.out.println("차량정보 추가");
		System.out.println("-------------------");
		System.out.println("차량이름:");
		String carname = s.next();
		System.out.println("제조사:");
		String provider = s.next();
		System.out.println("색 상:");
		String color = s.next();
		System.out.println("연식:");
		String production = s.next();
		System.out.println("입고일:");
		String receiving = s.next();
		System.out.println("가격:");
		String price = s.next();
		System.out.println("사고유무:");
		String accident = s.next();
		System.out.println("배기량(cc):");
		String displace = s.next();
		System.out.println("주행거리(km):");
		String distan = s.next();
		System.out.println("사용 연료:");
		String fuel = s.next();
		System.out.println("변속기(수동, 오토):");
		String trans = s.next();

		// list크기만큼 for문 실행
		for (int i = 0; i < carList.size(); i++) {

			// 중복된 이름 있으면 다시 입력
			if (carList.get(i).getCarname().equals(carname)) {
				System.out.println("중복되는 자동차명입니다 다시 입력하세요.");
				flag = false;
				break;
			}
		}

		// 없으면 값 입력
		if (flag == true) {
			carList.add(new Car(carname, provider, color, production, receiving, price, accident, displace, distan, fuel,
					trans));
		}
	}

	// 차량정보수정(이름조건으로 검색후 수정)
	public void CarEdit() {

		String edit_car;
		System.out.println("수정할 차량의 이름을 입력하세요:");
		edit_car = s.next();
		if (carList.size() == 0) {
			System.out.println("차량 정보가 존재하지 않습니다.");
			return;
		}
		int select;

		for (int i = 0; i < carList.size(); i++) {
			if (edit_car.equals(carList.get(i).getCarname())) {
				System.out.println("★★★★★★★★★★★★★★");
				System.out.println("차량정보 수정");
				System.out.println("★★★★★★★★★★★★★★");
				System.out.println("1.색상");
				System.out.println("2.가격");
				System.out.println("3.사고유무");
				System.out.println("4.주행거리");
				System.out.println("5.나가기");
				System.out.println("★★★★★★★★★★★★★★");
				System.out.print("수정할 메뉴를 선택하세요: ");
				select = s.nextInt();
				if (select == 1) {
					String previous;
					previous = carList.get(i).getColor();
					System.out.println("변경할 색상을 입력하세요:");
					carList.get(i).setColor(s.next());
					System.out.println(edit_car + "의 색상이 " + previous + " 에서 " + carList.get(i).getColor() + "으로 변경되었습니다");
					break;
				} else if (select == 2) {
					String previous;
					previous = carList.get(i).getPrice();
					System.out.println("변경할 가격을 입력하세요(만원):");
					carList.get(i).setPrice(s.next());
					System.out.println(edit_car + "의 가격이 " + previous + "만원에서 " + carList.get(i).getPrice() + "만원으로 변경되었습니다");
					break;
				} else if (select == 3) {
					String previous;
					previous = carList.get(i).getAccident();
					System.out.println("사고 유무를 입력하세요(무사고,사고):");
					carList.get(i).setAccident(s.next());
					System.out.println(
							edit_car + "의 사고 유무가 " + previous + " 에서 " + carList.get(i).getAccident() + "로 변경되었습니다");
					break;
				} else if (select == 4) {
					String previous;
					previous = carList.get(i).getDistan();
					System.out.println("변경할 주행거리를 입력하세요(km):");
					carList.get(i).setDistan(s.next());
					System.out.println(
							edit_car + "의 주행 거리가 " + previous + " km에서 " + carList.get(i).getDistan() + "km로 변경되었습니다");
					break;
				} else if (select == 5) {
					break;
				} else {
					System.out.println("잘못 입력 하였습니다.");
				}
			}
		}
	}

	// 차량 이름으로 검색후 해당차량(이름)정보 전체삭제
	public void CarDelete() {
		String del_Car;
		System.out.println("삭제할 차량의 이름을 입력하세요:");
		del_Car = s.next();
		for (Car data : carList) {
			if (data.getCarname().equals(del_Car)) {//car array리스트랑 입력된 차량명이랑 비교 동일하면 실행
				carList.remove(data);
				System.out.println(del_Car + "의 정보가 삭제되었습니다.");
				break;
			}
		}
	}

	public ArrayList<Car> getcarList() {
		return carList;
	}
}
