import java.util.ArrayList;
/**
 * A WoodColorPuzzle class that extends Puzzle
 * @author njreiss
 */
public class WoodColorPuzzle extends Puzzle{
  public WoodColorPuzzle(){
    /**
     * A WoodColorPuzzle constructor that initializes all the super variables 
     */
    super.pieces = new ArrayList<String>(); 
    super.name = "Color Puzzle by Melissa and Doug";
    super.material = "wood";
    super.pieces.add("Red Fish");
    super.pieces.add("Yellow Fish");
    super.pieces.add("Green Fish");
    super.pieces.add("Purple Fish");
    super.pieces.add("Pink Fish");
    super.pieces.add("Orange Fish");
    super.pieces.add("Brown Fish");
    super.pieces.add("White Fish");
    super.pieces.add("Black Fish");
  }
}
