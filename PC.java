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
	//�вεĹ��췽��
	public PC(CPU c, HardDisk h) {
		super();
		cpu = c;
		HD = h;
	}
	//�޲εĹ��췽��
	public PC() {
		super();
	}
	public	void show(){
		System.out.println("cpu���ٶ��ǣ�"+cpu.getSpeed());
//		System.out.println("�����ǣ�"+cpu.getName());
		System.out.println("Ӳ�̵������ǣ�"+HD.getAmount());
//		System.out.println("����Ϊ��"+HD.getType());
	}
}
