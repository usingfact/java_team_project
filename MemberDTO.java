package com.lateam.car.management;


public class MemberDTO {
	private String cusid;//�� ID
	private String cuspassword;//�� ��й�ȣ
	private String cusname;//���̸�
	private String cusaddress;//���ּ�
	
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public String getCuspassword() {
		return cuspassword;
	}
	public void setCuspassword(String cuspassword) {
		this.cuspassword = cuspassword;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCusaddress() {
		return cusaddress;
	}
	public void setCusaddress(String cusaddress) {
		this.cusaddress = cusaddress;
	}

	public MemberDTO(String cusid, String cuspassword, String cusname, String cusaddress) {
		super();
		this.cusid = cusid;
		this.cuspassword = cuspassword;
		this.cusname = cusname;
		this.cusaddress = cusaddress;
	}
	
	public MemberDTO() {
		super();
	}
	

	
	@Override
	public String toString() {
		return "MemberDTO [cusid=" + cusid + ", cuspassword=" + cuspassword + ", cusname=" + cusname + ", cusaddress="
				+ cusaddress + "]";
	}
	
	public void Introduce() {
		System.out.println("�� �̸�:"+cusname);
		System.out.println("�� �ּ�:"+cusaddress);
		
	}

}
