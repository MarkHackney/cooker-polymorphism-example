
public class CoockerApp {

	public static void main(String[] args) {
		Cooker myCooker = new Cooker();
		myCooker.cook();
		Cooker myGrill = new Grill();
		myGrill.cook();
		Cooker myPizzaOven = new PizzaOven();
		myPizzaOven.cook();
		Cooker myStove = new Stove();
		myStove.cook();
	}

}
