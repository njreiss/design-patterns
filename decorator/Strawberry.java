package decorator;
/**
 * A Strawberry object that extends ScoopDecorator
 * @author njreiss
 */
public class Strawberry extends ScoopDecorator{
  /**
   * Constructor for Strawberry object
   * @param iceCream the other flavors/container for the icecream
   * @param numScoops number of scoops of Strawberry ice cream
   */
  public Strawberry(IceCream iceCream, int numScoops){
    super(iceCream, numScoops);
    super.flavorCost = 1.40;
    super.flavor = "strawberry";
  }
}
