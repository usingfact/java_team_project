package com.lateam.car.management;

public class Car {

	private String carname; // �����̸�
	private String provider; // ������
	private String color; // ����
	private String production; // ����⵵
	private String receiving; // �԰���
	private String price; // ����
	private String accident; // �������
	private String displace; // ��ⷮ
	private String distan; // ����Ÿ�
	private String fuel; // ��뿬��
	private String trans; // ���ӱ�

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getReceiving() {
		return receiving;
	}

	public void setReceiving(String receiving) {
		this.receiving = receiving;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getDisplace() {
		return displace;
	}

	public void setDisplace(String displace) {
		this.displace = displace;
	}

	public String getDistan() {
		return distan;
	}

	public void setDistan(String distan) {
		this.distan = distan;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}
	
	public Car(String carname, String provider, String color,
			String production, String receiving, String price,
			String accident, String displace, String distan,
			String fuel, String trans) {
		super();
		this.carname = carname;
		this.provider = provider;
		this.color = color;
		this.production = production;
		this.receiving = receiving;
		this.price = price;
		this.accident = accident;
		this.displace = displace;
		this.distan = distan;
		this.fuel = fuel;
		this.trans = trans;
	}
	
	public void CarInfo() {
		System.out.println("���� �̸� : "+carname);
		System.out.println("�� �� �� : "+provider);
		System.out.println("�� �� : "+color);
		System.out.println("���� �⵵ : "+production);
		System.out.println("�� �� �� : "+receiving);
		System.out.println("�� ��(����) : "+price);
		System.out.println("��� ���� : "+accident);
		System.out.println("�� �� ��(cc) : "+displace);
		System.out.println("���� �Ÿ�(km) : "+distan);
		System.out.println("��� ���� : "+fuel);
		System.out.println("�� �� ��(����&����) : "+trans);
		System.out.println("----------------------");
	}
}
