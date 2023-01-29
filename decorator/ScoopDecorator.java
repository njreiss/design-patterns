package decorator;
/**
 * An abstract ScoopDecorator class that extends Icecream
 * @author njreiss
 */
public abstract class ScoopDecorator extends IceCream{
  protected IceCream iceCream;
  protected int numScoops;
  protected String flavor;
  protected double flavorCost;
  /**
   * Constructor for ScoopDecorator object
   * @param iceCream the other flavors/container for the icecream
   * @param numScoops number of scoops of ice cream
   */
  public ScoopDecorator(IceCream iceCream, int numScoops){
    this.iceCream = iceCream;
    this.numScoops = numScoops;
  }
  /**
   * toString method returns a piece of a sentance with details of scoop flavor 
   * and number of scoops
   */
  public String toString(){
    if(numScoops == 1)
      return iceCream.toString() + ", a scoop of " + flavor + " ice cream";
    else
      return iceCream.toString() + ", " + numScoops + " scoops of " + flavor + " ice cream";
    
  }
  /**
   * getCost method returns sum of price of scoops and cone/bowl
   */
  public double getCost(){
    return iceCream.getCost() + (numScoops * flavorCost);
  }
}
