package MyShop;

import java.util.Scanner;

public class AllData {

	public static void main(String[] args) {

		int k=1;
		do
		{
			
		
		Scanner s= new Scanner(System.in);
		System.out.println("1 flower");
		System.out.println("2 customer");
		System.out.println("Enter choice");
		int choice =s.nextInt();
		
		switch(choice)
		{
		case 1: 
			Flower f= new Flower("lily",70,8,80);
			f.display();
			break;
		case 2:
			 Customer c= new Customer();
			 c.getData();
			 c.display();
			 break;
		default:
			System.out.println(" wrong choice");
		}
		
       System.out.println("do you wish to continue (0 to terminate");
       k= s.nextInt();
		
		}
		while(k!=0);
	}

}
