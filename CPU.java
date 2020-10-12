package com.sh.cpu;

public class CPU {
	private int speed;
	private String name;
	 
	public CPU() {
		super();
	}
	public CPU(int m, String name) {
		super();
		speed = m;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpeed(int m){
		speed=m;
	}
	public int getSpeed(){
		return speed;
	}
	
}
