import java.util.ArrayList;
/**
 * A WoodAnimalPuzzle class that extends Puzzle
 * @author njreiss
 */
public class WoodAnimalPuzzle extends Puzzle {
  /**
   * A WoodAnimalPuzzle constructor that initializes all the super variables 
   */
  public WoodAnimalPuzzle(){
    super.pieces = new ArrayList<String>(); 
    super.name = "Animal Puzzle by Melissa and Doug";
    super.material = "wood";
    super.pieces.add("Horse");
    super.pieces.add("Sheep");
    super.pieces.add("Dog");
    super.pieces.add("Cat");
    super.pieces.add("Cow");
    super.pieces.add("Chicken");
  }
}
