package com.sh.hd;

public class HardDisk {

	private int amount;
	private String type;
	 
	public HardDisk() {
		super();
	}

	public HardDisk(int m, String type) {
		super();
		amount = m;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setAmount(int m){
		amount=m;
	}
	public int getAmount(){
		return amount;
	}
}
