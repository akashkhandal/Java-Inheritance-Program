package a.com;

import java.util.Scanner;

public class Bag {
	Laptop l;
	static Scanner sc = new Scanner(System.in);
	
	public  void AddLaptop () {
		if (l==null) {
			System.out.println("1.Dell 2.Acer");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter laptop name");
				String name =sc.next();
				System.out.println("enter price");
				double price=sc.nextDouble();
				
				
				l= new Dell(name,price);
				System.out.println("laptop is added in bag");
				break;
				
				
			}
			case 2:
			{
				System.out.println("enter laptop name");
				String name =sc.next();
				System.out.println("enter price");
				double price=sc.nextDouble();
				
				
				l= new Acer(name,price);
				System.out.println("laptop is added in bag");
				break;
				
				
			}
			
			
		}
	
	}
		else
		{
			System.out.println("laptop already in bag");
		}

}
	public void RemoveLaptop()
	{
		if(l==null)
		{
			System.out.println("first add laptop");
			
		}
		else
		{
			l=null;
			System.out.println("laptop removed");
		}
	}
	public void DisplayLaptop()
	{
		if(l==null)
		{
			System.out.println("first add laptop");
		}
		else
		{
			if(l instanceof Dell)
			{
				Dell d1 = (Dell)l;
				System.out.println(d1.name+" "+d1.price);
				
						
			}
			else if(l instanceof Acer)
			{
				Acer a1 =(Acer)l;
				System.out.println(a1.name+" "+a1.price);
			}
		}
	}
	public static void main(String[] args) {
		Bag b1 = new Bag();
				for (;;)
				{
					System.out.println("1. AddLaptop 2.RemoveLaptop 3.DisplayLaptop 4.Exit");
					
					
					
					switch(sc.nextInt())
					{
						case 1:
							b1.AddLaptop();
							break;
							
						case 2:
							b1.RemoveLaptop();
							break;
							
						case 3:
							b1.DisplayLaptop();
							break;
						case 4:
							return;
					}
					
					
					
					
					
					
					
					
					
				}
	}
}
