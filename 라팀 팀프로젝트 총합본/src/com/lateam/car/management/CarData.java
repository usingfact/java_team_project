package com.lateam.car.management;

import java.util.ArrayList;
import java.util.Scanner;

public class CarData {
	Scanner s = new Scanner(System.in);
	ArrayList<Car> carList = new ArrayList<Car>();
	boolean flag = true;

	public void Car() {

		carList.add(new Car("�ڳ�", "����", "���", "2020-01-01", "2021-01-01", "1500", "�����", "2200", "5000", "����", "����"));
		carList.add(new Car("�ҳ�Ÿ", "����", "����", "2020-02-01", "2021-01-01", "1300", "�����", "1800", "10000", "����", "����"));
		carList.add(new Car("����", "����", "������", "2020-03-01", "2021-01-01", "3500", "�����", "2500", "2500", "����", "����"));
		carList.add(new Car("�ƹ݋�", "����", "�Ķ���", "2020-04-01", "2021-01-01", "1200", "�����", "1800", "2000", "����", "����"));
		carList.add(new Car("�׷���", "����", "���", "2020-05-01", "2021-01-01", "3200", "�����", "2400", "6000", "����", "����"));
		carList.add(new Car("����3", "����", "���", "2020-06-01", "2021-01-01", "3000", "�����", "2000", "15000", "����", "����"));
		carList.add(new Car("SM3", "����Ｚ", "���", "2019-01-01", "2021-01-01", "2000", "�����", "2000", "16000", "���ָ�,����",
				"����"));
		carList.add(new Car("SM5", "����Ｚ", "���", "2019-05-01", "2021-01-01", "2200", "�����", "2000", "5000", "���ָ�,����",
				"����"));
		carList.add(
				new Car("SM7", "����Ｚ", "���", "2019-09-01", "2021-01-01", "2300", "���", "2000", "3000", "LPG,����", "����"));
		carList.add(
				new Car("Ƽ����", "�ֿ�", "������", "2020-12-01", "2021-03-01", "3000", "�����", "3000", "6000", "���ָ�", "����"));
		carList.add(new Car("������", "�ֿ�", "���", "2020-06-01", "2021-03-01", "2000", "���", "2600", "25000", "���ָ�", "����"));
		carList.add(
				new Car("�ڶ���", "�ֿ�", "�Ķ���", "2020-09-01", "2021-03-01", "2400", "�����", "2800", "4000", "���ָ�", "����"));
	}

	public void CarAll() {
		System.out.println("�������� �����ȸ");

		if (carList.isEmpty())
			System.out.println("�Էµ� ���� ������ �����ϴ�.");

		else {
			for (int i = 0; i < carList.size(); i++) {
				Car car = carList.get(i);
				car.CarInfo();
			}
		}
	}

	// ����������ȸ

	public void ConCarName(String carname) { // ������
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String CName = s.getCarname();
			if (CName.equals(carname)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarProvider(String provider) { // ������

		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Pro = s.getProvider();
			if (Pro.equals(provider)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarColor(String color) { // ����
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Color = s.getColor();
			if (Color.equals(color)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarAccident(String accident) { // �������
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Acc = s.getAccident();
			if (Acc.equals(accident)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarFuel(String fuel) { // ��뿬��
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Fuel = s.getFuel();
			if (Fuel.equals(fuel)) {
				s.CarInfo();
			}
		}
	}

	public void ConCarTrans(String trans) { // ����&����
		for (int i = 0; i < carList.size(); i++) {
			Car s = carList.get(i);
			String Trans = s.getTrans();
			if (Trans.equals(trans)) {
				s.CarInfo();
			}
		}
	}

	public void CarAdd() { // �������� �߰�
		System.out.println("-------------------");
		System.out.println("�������� �߰�");
		System.out.println("-------------------");
		System.out.println("�����̸�:");
		String carname = s.next();
		System.out.println("������:");
		String provider = s.next();
		System.out.println("�� ��:");
		String color = s.next();
		System.out.println("����:");
		String production = s.next();
		System.out.println("�԰���:");
		String receiving = s.next();
		System.out.println("����:");
		String price = s.next();
		System.out.println("�������:");
		String accident = s.next();
		System.out.println("��ⷮ(cc):");
		String displace = s.next();
		System.out.println("����Ÿ�(km):");
		String distan = s.next();
		System.out.println("��� ����:");
		String fuel = s.next();
		System.out.println("���ӱ�(����, ����):");
		String trans = s.next();

		// listũ�⸸ŭ for�� ����
		for (int i = 0; i < carList.size(); i++) {

			// �ߺ��� �̸� ������ �ٽ� �Է�
			if (carList.get(i).getCarname().equals(carname)) {
				System.out.println("�ߺ��Ǵ� �ڵ������Դϴ� �ٽ� �Է��ϼ���.");
				flag = false;
				break;
			}
		}

		// ������ �� �Է�
		if (flag == true) {
			carList.add(new Car(carname, provider, color, production, receiving, price, accident, displace, distan, fuel,
					trans));
		}
	}

	// ������������(�̸��������� �˻��� ����)
	public void CarEdit() {

		String edit_car;
		System.out.println("������ ������ �̸��� �Է��ϼ���:");
		edit_car = s.next();
		if (carList.size() == 0) {
			System.out.println("���� ������ �������� �ʽ��ϴ�.");
			return;
		}
		int select;

		for (int i = 0; i < carList.size(); i++) {
			if (edit_car.equals(carList.get(i).getCarname())) {
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("�������� ����");
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("1.����");
				System.out.println("2.����");
				System.out.println("3.�������");
				System.out.println("4.����Ÿ�");
				System.out.println("5.������");
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.print("������ �޴��� �����ϼ���: ");
				select = s.nextInt();
				if (select == 1) {
					String previous;
					previous = carList.get(i).getColor();
					System.out.println("������ ������ �Է��ϼ���:");
					carList.get(i).setColor(s.next());
					System.out.println(edit_car + "�� ������ " + previous + " ���� " + carList.get(i).getColor() + "���� ����Ǿ����ϴ�");
					break;
				} else if (select == 2) {
					String previous;
					previous = carList.get(i).getPrice();
					System.out.println("������ ������ �Է��ϼ���(����):");
					carList.get(i).setPrice(s.next());
					System.out.println(edit_car + "�� ������ " + previous + "�������� " + carList.get(i).getPrice() + "�������� ����Ǿ����ϴ�");
					break;
				} else if (select == 3) {
					String previous;
					previous = carList.get(i).getAccident();
					System.out.println("��� ������ �Է��ϼ���(�����,���):");
					carList.get(i).setAccident(s.next());
					System.out.println(
							edit_car + "�� ��� ������ " + previous + " ���� " + carList.get(i).getAccident() + "�� ����Ǿ����ϴ�");
					break;
				} else if (select == 4) {
					String previous;
					previous = carList.get(i).getDistan();
					System.out.println("������ ����Ÿ��� �Է��ϼ���(km):");
					carList.get(i).setDistan(s.next());
					System.out.println(
							edit_car + "�� ���� �Ÿ��� " + previous + " km���� " + carList.get(i).getDistan() + "km�� ����Ǿ����ϴ�");
					break;
				} else if (select == 5) {
					break;
				} else {
					System.out.println("�߸� �Է� �Ͽ����ϴ�.");
				}
			}
		}
	}

	// ���� �̸����� �˻��� �ش�����(�̸�)���� ��ü����
	public void CarDelete() {
		String del_Car;
		System.out.println("������ ������ �̸��� �Է��ϼ���:");
		del_Car = s.next();
		for (Car data : carList) {
			if (data.getCarname().equals(del_Car)) {//car array����Ʈ�� �Էµ� �������̶� �� �����ϸ� ����
				carList.remove(data);
				System.out.println(del_Car + "�� ������ �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	public ArrayList<Car> getcarList() {
		return carList;
	}
}
