class Laptop{
	Cpu processor;
	Ram memory;
	Disk storage;

	String logo = "L3N0V0";

	Laptop(Cpu processor, Ram memory, Disk storage){
		this.processor = processor;
		this.storage = storage;
		this.memory = memory;
	}

	void display(){
		System.out.println("--- "+logo+" ---");
		System.out.println(processor.price+" "+processor.name+" "+processor.speed);
		System.out.println(memory.price+" "+memory.name+" "+memory.size+" "+memory.speed);
		System.out.println(storage.price+" "+storage.size+" "+storage.name);
		System.out.println("--------------");
	}
}


class Cpu{
	int price;
	String name;
	String speed;

	public Cpu(int price, String name, String speed){
		this.price = price;
		this.name = name;
		this.speed = speed;
	}
}

class Ram{
	int price;
	String name;
	int size;
	String speed;

	public Ram(int price, String name, String speed, int size){
		this.price = price;
		this.name = name;
		this.speed = speed;
		this.size = size;
	}
}

class Disk{
	int price;
	int size;
	String name;

	public Disk(int price, int size, String name){
		this.price = price;
		this.size = size;
		this.name = name;
	}
}

public class MultiObj{
	public static void main(String[] args){

		Cpu proc1 = new Cpu(150, "R5 3500X", "3.5Gz");
		Ram mem1 = new Ram(580, "XPG", "3200Mhz", 16);
		Disk disk1 = new Disk(650, 1000, "WD-Green");

		Laptop l1 = new Laptop(proc1, mem1, disk1);

		Cpu proc2 = new Cpu(300, "R5 2600", "3.2Gz");
		Ram mem2 = new Ram(600, "XPG", "4000Mhz", 32);
		Disk disk2 = new Disk(800, 2000, "WD-Green");

		Laptop l2 = new Laptop(proc2, mem2, disk2);

		Cpu proc3 = new Cpu(150, "R5 3800X", "3.5Gz");
		Ram mem3 = new Ram(650, "XPG", "1200Mhz", 16);
		Disk disk3 = new Disk(806, 500, "Segate");

		Laptop l3 = new Laptop(proc1, mem1, disk1);

		Cpu proc4 = new Cpu(300, "R5 2600", "3.2Gz");
		Ram mem4 = new Ram(600, "XPG", "4000Mhz", 32);
		Disk disk4 = new Disk(800, 2000, "WD-Green");

		Laptop l4 = new Laptop(proc2, mem2, disk2);


		l1.display();
		l2.display();
		l3.display();
		l4.display();

		System.out.println("\n\nend...");
	}
}