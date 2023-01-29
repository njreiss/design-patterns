package decorator;
/**
 * A Vanilla object that extends ScoopDecorator
 * @author njreiss
 */
public class Vanilla extends ScoopDecorator{
  /**
   * Constructor for Vanilla object
   * @param iceCream the other flavors/container for the icecream
   * @param numScoops number of scoops of Vanilla ice cream
   */
  public Vanilla(IceCream iceCream, int numScoops){
    super(iceCream, numScoops);
    super.flavorCost = 1.25;
    super.flavor = "vanilla";
  }
}
