package com.predefine;

public class Student {
	private int sId;
	private String name;
	private String address;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(int sId, String name, String address) {
		super();
		this.sId = sId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", address=" + address + "]";
	}
	
}
