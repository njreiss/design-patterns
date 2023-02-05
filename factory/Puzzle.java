import java.util.ArrayList;
/**
 * An abstract class Puzzle
 * @author njreiss
 */
public abstract class Puzzle {
  protected String name;
  protected String material;
  protected ArrayList<String> pieces;
  /**
   * A method Assemble 
   * @return type String consisting of a description of the puzzle assembly process
   */
  public String assemble(){
    String assemble = "Putting together a " + name + "\n" + 
    "This puzzle is made out of " + material + "\n" +
    "Adding the following pieces " + "\n";
    for(int i = 0; i < pieces.size(); i++) {
      assemble = assemble + " - " + pieces.get(i) + "\n";
    }
    return assemble;
  }
  /**
   * A method boxPuzzle
   * @return putting the <name> in a box
   */
  public String boxPuzzle(){
    return "Putting the " + name + " in a box";
  }
}
