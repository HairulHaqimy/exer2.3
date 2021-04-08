
public class Main1 {

	public static void main(String[] args) {
		
		
		Phone1 iphone = new Phone1(); 
		
		System.out.println(" Iphone ");
		iphone.specification();
		iphone.waterproof("Iphone");
		iphone.Quantity();
		iphone.totalPrice();
		
		System.out.println();
		
		Phone1 samsung = new Phone1(); 
	    
		System.out.println(" Samsung ");
	    samsung.specification(); 
	    samsung.waterproof("Samsung");
	    samsung.Quantity(); 
	    samsung.totalPrice(); 
	}

}
