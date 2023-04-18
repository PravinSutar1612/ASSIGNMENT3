package MyShop;
/*
 * A company named MyShop started online portal for flower selling .
 * Design Java application that keeps its flower record and 
 * also maintain its customer database for future promotions .


b) define class Flower having fields like name ,no_of_petals, price, no_of_piece, total price
c) define no argument constructor  and initialize with some default values
d) define parameterized constructor .
e)  create calculate_discount method that checks if total price is greater than 2000 then give return 200 else return 100
f) define display method to show all values . and values after discount .

 */
public class Flower {
	String fname;
	int price;
	int no_of_petals;
	int no_of_piece;
	int total;
	
	Flower()
	{
		  fname="Rose";
		  price=50;
		  no_of_petals=20;
		  no_of_piece=100;
		  total=0;
	}
	Flower(String a,int b,int c,int d)
	{
		  fname=a;
		  price=b;
		  no_of_petals=c;
		  no_of_piece=d;
		  total=price* no_of_piece;
	}
	
int	calculate_discount()
{
	if(total>2000) 		return 200;
	else         		return 100;
}
	
void display()
{
	System.out.println("flower name="+ fname);
	System.out.println("flower no of petels="+ no_of_petals);
	System.out.println("flower price="+ price);
	int discount = calculate_discount();
	System.out.println("flower discount="+ discount);
	System.out.println("Total price="+ (total-discount));
	
}
}
