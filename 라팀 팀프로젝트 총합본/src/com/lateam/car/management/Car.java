package com.lateam.car.management;

public class Car {

	private String carname; // 차량이름
	private String provider; // 제조사
	private String color; // 색상
	private String production; // 생산년도
	private String receiving; // 입고일
	private String price; // 가격
	private String accident; // 사고유무
	private String displace; // 배기량
	private String distan; // 주행거리
	private String fuel; // 사용연료
	private String trans; // 변속기

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
		System.out.println("차량 이름 : "+carname);
		System.out.println("제 조 사 : "+provider);
		System.out.println("색 상 : "+color);
		System.out.println("생산 년도 : "+production);
		System.out.println("입 고 일 : "+receiving);
		System.out.println("가 격(만원) : "+price);
		System.out.println("사고 유무 : "+accident);
		System.out.println("배 기 량(cc) : "+displace);
		System.out.println("주행 거리(km) : "+distan);
		System.out.println("사용 연료 : "+fuel);
		System.out.println("변 속 기(수동&오토) : "+trans);
		System.out.println("----------------------");
	}
}
