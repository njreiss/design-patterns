package statePattern;

public class DeliveryDriver {

	public static void main(String[] args) {
		System.out.println("\nCoffee Filters:");
		Package coffeeFilters = new Package("Coffee Filters", 20);
		System.out.println(coffeeFilters.order());
		System.out.println(coffeeFilters.delay());
		System.out.println(coffeeFilters.mail());
		System.out.println(coffeeFilters.received());

		System.out.println("\nSpiderman Bike:");
		Package bike = new Package("Spiderman Bike", 1);
		System.out.println(bike.order());
		System.out.println(bike.mail());
		System.out.println(bike.delay());
		System.out.println(bike.received());
	}
}
