# 计G201 刘馨 2020322069
# 实验一
## 一、实验目的
熟悉Java中类的访问权限，定义属性修饰符的多样化
了解定义方法操作属性，以及构造方法的定义及使用
## 二、实验内容
1.用类描述计算机中CPU的速度和硬盘的容量。创建PC、CPU、HardDisk和Test四个类，其中Test是主类。
* CPU类中要求getspeed()返回speed的值，要求setSpeed(int m)方法赋值。
* HardDisk类中要求getamount()返回amount的值，要求setAmount(int m)方法赋值.
* PC类中要求setCPU(CPU c)赋值cpu，要求setHardDisk (HardDisk h )方法赋值HD 并使用show()方法显示CPU的速度和硬盘的容量.
* Test类main方法中创建CPU对象cpu，并将speed设置为2200. 创建HardDisk对象disk，并将amount设置为200.创建PC对象pc，pc调用setCPU方法，调用实参cpu，调用setHardDisk方法调用实参disk，调用show()方法
2.附加要求
* 类中定义不少于两个构造方法
* 每个类定义不少于2个属性，且属性类型多样化
* 定义属性修饰符多样化
* 尝试把本次实验的多个类放置不同包体会修饰符private的用法
## 三、核心代码
1.构造方法
```public HardDisk() {
		super();
	}

	public HardDisk(int m, String type) {
		super();
		amount = m;
		this.type = type;
	}
  ```
2.设置和获取对象成员值
  ```	public void setAmount(int m){
		amount=m;
	}
	public int getAmount(){
		return amount;
	}
  ```
  ```	public void setSpeed(int m){
		speed=m;
	}
	public int getSpeed(){
		return speed;
	}
  ``` 
3.实例化对象
  ```	CPU cpu = new CPU();
		HardDisk disk = new HardDisk();
		PC pc = new PC();
 ```
4.方法调用
 ```pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
  ```
5.变量赋值
```
  cpu.setSpeed(2200);
	disk.setAmount(200);
```
## 四、实验结果
 输出显示cpu的速度是：2200 硬盘的容量是：200
 ![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/PiajxSqBRaEK7NVzox8BdMgbmZFyg2S9v2a1JfLfpJlSdxItJHKibbsYiczU8GKSyN1n2BOQl5ct5A/0)
## 五、实验感想
通过本次实验所写的程序代码，通过动手编程实现，观察输出结果，进一步了解到构造方法的使用，了解到对象操作自己的变量和使用类中的方法是有一定限制的。
在编写类的时候，类中的实例方法可以操作该类中的实例变量和类变量；类方法可以操作该类中的类变量，与访问限制没关系，学会使用限制修饰符private、protected、public的用法
 
