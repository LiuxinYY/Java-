package com.sh.pc;

import com.sh.cpu.CPU;
import com.sh.hd.HardDisk;

public class PC {
	private CPU cpu;
	private HardDisk HD;
	
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
	//有参的构造方法
	public PC(CPU c, HardDisk h) {
		super();
		cpu = c;
		HD = h;
	}
	//无参的构造方法
	public PC() {
		super();
	}
	public	void show(){
		System.out.println("cpu的速度是："+cpu.getSpeed());
//		System.out.println("名字是："+cpu.getName());
		System.out.println("硬盘的容量是："+HD.getAmount());
//		System.out.println("类型为："+HD.getType());
	}
}
