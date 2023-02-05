/**
 * A FisherPriceStore object that extends ToyStore
 * @author njreiss
 */
public class FisherPriceStore extends ToyStore{
  /**
   * A createPuzzle Method that returns puzzle being created based on string type
   * @param type determines which type of puzzle is going to be created 
   */
  public Puzzle createPuzzle(String type){
    if(type.equalsIgnoreCase("color")){
      Puzzle puzzle = new PlasticColorPuzzle();
      return puzzle;
    }
    else if(type.equalsIgnoreCase("animal")){
      Puzzle puzzle = new PlasticAnimalPuzzle();
      return puzzle;
    }
    else{
      return null;
    }
  }
}
