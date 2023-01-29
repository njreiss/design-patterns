package decorator;
/**
 * A Cone object that extends Icecream
 * @author njreiss
 */
public class Cone extends IceCream{
  ConeType coneType;
  /**
   * Constructor for Cone object
   * @param coneType the type of cone that the icecream is in
   */
  public Cone(ConeType coneType){
    this.coneType = coneType;

    if(coneType == ConeType.SUGAR_CONE)
      super.description = "Sugar cone";
    else if(coneType == ConeType.PRETZEL_CONE)
      super.description = "Pretzel cone";
    else if(coneType == ConeType.CHOCOLATE_DIPPED_CONE)
      super.description = "Chocolate dipped cone";
    else if(coneType == ConeType.WAFFLE_CONE)
      super.description = "Waffle cone";
  }
  /**
   * Method getCost returns price of cone
   */
  public double getCost(){
    if(coneType == ConeType.SUGAR_CONE)
      return .75;
    else if(coneType == ConeType.PRETZEL_CONE)
      return 1.80;
    else if(coneType == ConeType.CHOCOLATE_DIPPED_CONE)
      return 1.50;
    else if(coneType == ConeType.WAFFLE_CONE)
      return 1.20;  
    else 
      return 0;
  }
}
