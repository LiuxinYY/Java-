package com.sh.test;

import com.sh.cpu.CPU;
import com.sh.hd.HardDisk;
import com.sh.pc.PC;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//��������
		CPU cpu;
		HardDisk disk;
		PC pc;
		//Ϊ����������
		cpu = new CPU(); 
		disk = new HardDisk();
		pc = new PC();*/
		//��������
		/*CPU c =new CPU(2200,"���");
		HardDisk h=new HardDisk(20,"��̬");*/
		CPU cpu = new CPU();
		HardDisk disk = new HardDisk();
		PC pc = new PC();
//		������Լ��ı�����ֵ
		cpu.setSpeed(2200);
		disk.setAmount(200);
		//pc����**����
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
