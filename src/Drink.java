import java.util.ArrayList;
import java.util.List;

 public  class Drink {
	String name;
	String price;
	private static Drink uniqueInstance;
	
	public static Drink getInstance() {
		if(uniqueInstance==null) {
			System.out.println(" ******Creating Unique Instance of Drink******\n");
			uniqueInstance= new Drink();
		}
//		System.out.println("Returning instance of Drink");
		return uniqueInstance;
	}
	public String getName() {
		return name;
	}
	List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing "+ name);
	}
	public void Blend() {
		System.out.println("Mixing your drink "+name);
	}
	public void Build() {
		System.out.println("Your "+name+" is being extracted from blend process.");
	}
	public void Pack() {
		System.out.println("Started packing your drink "+name);
	}
	
	
	public String toString() {
		StringBuffer display=new StringBuffer();
		display.append("-------------"+name+"--------------");
		display.append(price +"\n");
		for(String topping: toppings) {
			display.append(topping+"\n");
		}
		return display.toString();
		
	}
}
