package decorator;

public class IceCreamShopDriver {
	public static void main(String[] args) {
		IceCream cone = new Cone(ConeType.CHOCOLATE_DIPPED_CONE);
		IceCream coneFilledIceCream = new Chocolate(new Vanilla(cone, 2), 1);

		IceCream bowl = new Bowl();
		IceCream bowlFilledIceCream = new Strawberry(new Vanilla(bowl, 1), 1);

		System.out.println("\n******** Ice Cream Shop *******");

		System.out.println("I would like to order, 2 Ice Creams:");
		System.out.println(coneFilledIceCream);
		System.out.println("Price: $" + coneFilledIceCream.getCost());
		System.out.println("\n" + bowlFilledIceCream);
		System.out.println("Price: $" + bowlFilledIceCream.getCost());
	}
}
