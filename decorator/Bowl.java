package decorator;
/**
 * A Bowl object that extends Icecream
 * @author njreiss
 */
public class Bowl extends IceCream{
  /**
   * Constructor for Bowl object
   */
  public Bowl(){
    super.description = "Bowl";
  }
  /**
   * Method getCost returns cost of bowl. 
   */
  public double getCost(){
    return 0.0;
  }
}
