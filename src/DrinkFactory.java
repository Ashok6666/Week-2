
public class DrinkFactory {
	public Drink createDrink(String type) {
		Drink drink=null;
		if(type.equals("Margarita")) {
			drink = new MargaritaDrink();
		}else if(type.equals("Martini")) {
			drink =new MartiniDrink();
		}else if(type.equals("Mimosa")) {
			drink = new MimosaDrink();
		}
		return drink;
		
	}

}
