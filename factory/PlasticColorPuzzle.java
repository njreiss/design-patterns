import java.util.ArrayList;
/**
 * A createPuzzle Method that returns puzzle being created based on string type
 * @param type determines which type of puzzle is going to be created 
 */
public class PlasticColorPuzzle extends Puzzle {
  /**
   * A PlasticColorPuzzle constructor 
   */
  public PlasticColorPuzzle(){
    super.pieces = new ArrayList<String>(); 
    super.name = "Color Puzzle by Fisher Price";
    super.material = "plastic";
    super.pieces.add("Green Dog");
    super.pieces.add("Orange Dog");
    super.pieces.add("Red Dog");
    super.pieces.add("Blue Dog");
    super.pieces.add("Yellow Dog");
    super.pieces.add("Brown Dog");
  }
}