package animal.com;

import java.util.Scanner;

public class Zoo {
	static Animal a;
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	for(;;)
	{
		System.out.println("1. Dog 2. Cat 3.Lion");
		switch(sc.nextInt())
		{
		case 1:
			a= new Dog();
			a.sound();
			break;
		case 2 :
			a= new Cat();
			a.sound();
			break;
		case 3:
			a= new Lion();
			a.sound();
			break;
			
			default:
				System.out.println("enter between 1,2,3 option");
				
				
		}
		}
	}

}
