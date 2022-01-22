
public class DrinkStore {
	DrinkFactory factory;
	
	public DrinkStore(DrinkFactory factory) {
		this.factory=factory;
		
	}
	public Drink orderDrink(String type) {
		Drink drink;
		
		drink=factory.createDrink(type);
		drink.prepare();
		drink.Blend();
		drink.Build();
		drink.Pack();
		return drink;
	}
}
