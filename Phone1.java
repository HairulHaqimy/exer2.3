
import java.util.Scanner;

public class Phone1 {
	
     String brand , colour ;
     int storage;
     char waterproof;
     
     Scanner s = new Scanner(System.in);
	
     void specification() {
    	 
    	 System.out.println("Enter Brand, colour and storage : ");
    	 String a = s.nextLine();
    	 String b = s.nextLine();
    	 int c = s.nextInt();
    	 
    	 System.out.println("Phone brand > " + a );
    	 System.out.println("Colour > " + b );
    	 System.out.println("Phone storage > " + c + " GB ");
    	 
     }
    	 
    	 void waterproof(String name) {
        	 do {
        	 System.out.println("\nDoes this phone waterproof? (y-yes,n-no)");
        	 waterproof = s.next().charAt(0);
        	 switch(waterproof){
        	 case'y':System.out.println(brand + " waterproof.");break;
        	 case'n':System.out.println("\n" + brand + " not waterproof.");break;
        	 default : System.out.print("Error. Wrong choice!(Input only 'y' or 'n'.)");
        	 }
        	 
        	 }while (waterproof != 'y' && waterproof != 'n');
        
    	 
    	 }
     
    	 void Quantity() {
       	  System.out.println("Enter the price : RM ");
       	  double d = s.nextDouble();
         	  System.out.println("Enter the quantity : ");
         	  int phone = s.nextInt();
         	
             int totalItem = (int) (phone * d) ;
             System.out.println("Total price item : RM " + totalItem); 
             System.out.println("\n--next--");
         }
     
     
    	 void totalPrice() {
    			System.out.println("How many phone do you want to buy?");
    			int quantity = s.nextInt();
    			System.out.println("Enter the price");
    			double money = s.nextDouble();
    			double totalPrice = quantity*money;
    			System.out.println("Total price of the phone:"+ totalPrice);
     
     
     
     }
     
     
    
     }
     
     
     
     
    	
