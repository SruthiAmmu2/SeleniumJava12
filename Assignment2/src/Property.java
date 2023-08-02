import java.util.Scanner;


public class Property {


	public static void main(String[] args) {
	
       int price1, price2;
       
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the Price Michael is investing");
       price1 = in.nextInt();
       
       System.out.println("Enter the Price Bruce is investing");
       price2 = in.nextInt();
       
       if(price1>price2)
       {
    	   System.out.println("Michael has won the Property");
       }
       else
       if(price2 > price1)
       {
    	   System.out.println("Bruce has won the Property");
       }
       else
       {
    	   System.out.println("Both of them did not won the Property, the Price invested is equal");
       }
	}

}
