
public class MixedDrink {
	public static void main(String [] args) {
		Drink drink= Drink.getInstance();
		DrinkFactory factory = new DrinkFactory();
		DrinkStore store= new DrinkStore(factory);
		
		Drink drink11=store.orderDrink("Margarita");
		
		System.out.println(drink11);
		Drink drink1= Drink.getInstance();
		// will return the existing instance
		
		Drink drink12=store.orderDrink("Martini");
		System.out.println(drink12);
	}
}
