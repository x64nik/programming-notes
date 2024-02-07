class Less18 extends RuntimeException{
	Less18(String err_msg){
		System.out.println(err_msg);
	}
}


class Greater90 extends RuntimeException{
	Greater90(String err_msg){
		System.out.println(err_msg);
	}
}

class Voting{
	int age;

	void check(int age){
		this.age = age;
		if (age < 18){
			throw new Less18("Voting not Allowed [too young]");
		}
		else if(age > 90){
			throw new Greater90("Voting not Allowed [too old]");
		}
		else {
			System.out.println("Voting Allowed");	
		}
	}
}


public class CustomException{
	public static void main(String[] args){

		Voting vote = new Voting();
		vote.check(92);

		System.out.println("\n\nend...");
	}
}