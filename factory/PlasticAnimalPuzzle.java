import java.util.ArrayList;
/**
 * A PlasticAnimalPuzzle class that extends puzzle
 * @author njreiss
 */
public class PlasticAnimalPuzzle extends Puzzle {
  /**
   * A PlasticAnimalPuzzle constructor that sets all variables of parent class.
   */
  public PlasticAnimalPuzzle(){
    super.pieces = new ArrayList<String>(); 
    super.name = "Animal Puzzle by Fisher Price";
    super.material = "plastic";
    super.pieces.add("Fox");
    super.pieces.add("Elephant");
    super.pieces.add("Giraffe");
    super.pieces.add("Owl");
    super.pieces.add("Monkey");
  }
}