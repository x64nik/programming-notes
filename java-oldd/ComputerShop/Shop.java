import java.util.Scanner;


class Processor {
	String comp;
	String gen;
	String speed;
	int price;

	public Processor(String comp, String gen, String speed, int price) {
		this.comp = comp;
		this.gen = gen;
		this.speed = speed;
		this.price = price;
	}

	// String disp() {
	// 	return this.comp + this.speed + this.gen + this.price;
	// }

}

class Memory {
	String comp;
	String gen;
	String speed;
	int price;

	public Memory(String comp, String gen, String speed, int price) {
		this.comp = comp;
		this.gen = gen;
		this.speed = speed;
		this.price = price;
	}

}

class Storage {
	String comp;
	String speed;
	int price;

	public Storage(String comp, String speed, int price) {
		this.comp = comp;
		this.speed = speed;
		this.price = price;
	}
}


class Machine {


	Processor p1;	Memory m1; Storage s1;

	public Machine(Processor p1,	Memory m1, Storage s1) {

		this.p1 = p1;
		this.m1 = m1;
		this.s1 = s1;
	}

	void disp() {
		String cpu = this.p1.gen + " | " +this.p1.speed + " | " + this.p1.price ;
		String ram = this.m1.gen + " | " +this.m1.speed + " | " + this.m1.price ;
		String ssd = this.s1.comp + " | " +this.s1.speed + " | " + this.s1.price ; 
		//return combine;
		int total_cost = this.p1.price + this.m1.price + this.s1.price;
		System.out.println("\ncpu: " + cpu + " \n" + "ram: " + ram + " \n" + "ssd: " + ssd + " \n" + "Total_Cost: " + total_cost);
	}

}


public class Shop {

	public static void main(String[] anything) {

	
	Processor cpu = new Processor("AMD", "R5 3500X", "4.5Gz", 15000);
	Memory mem = new Memory("XPG", "DDR5", "3200Mhz", 2500);
	Storage disk = new Storage("Segate", "6Gbps", 2000);

	// System.out.println(cpu);
	// System.out.println(mem);
	// System.out.println(disk);

	Machine elliot = new Machine(cpu, mem, disk);
	System.out.print("* Configs of elliots's machine: ");
	elliot.disp();
	System.out.print("\n");

	Processor cpu1 = new Processor("INTEL", "i5 2400g", "2.5", 5000);
	Memory mem1 = new Memory("Corsair", "DDR3", "1200Mhz", 1200);
	Storage disk1 = new Storage("WD Green", "2Gbps", 1000);

	Machine cisco = new Machine(cpu1, mem1, disk1);
	System.out.print("* Configs of cisco's machine: ");
	cisco.disp();

	//System.out.println(machine.p1.gen);


	System.out.println("\n\nend");

	}
}