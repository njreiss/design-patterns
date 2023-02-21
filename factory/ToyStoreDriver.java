package factory;

public class ToyStoreDriver {

	public ToyStoreDriver() {

	}

	public void run() {
		ToyStore upperClassToyStore = new MelissaAndDougStore();
		ToyStore regularToyStore = new FisherPriceStore();

		System.out.println("\n---------------------\n");
		System.out.println(upperClassToyStore.orderPuzzle("animal"));
		System.out.println("\n---------------------\n");
		System.out.println(upperClassToyStore.orderPuzzle("color"));
		System.out.println("\n---------------------\n");
		System.out.println(regularToyStore.orderPuzzle("animal"));
		System.out.println("\n---------------------\n");
		System.out.println(regularToyStore.orderPuzzle("color"));
		System.out.println("\n---------------------\n");
	}

	public static void main(String[] args) {
		ToyStoreDriver driver = new ToyStoreDriver();
		driver.run();
	}
}
