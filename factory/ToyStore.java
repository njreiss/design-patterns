/**
 * An abstract class ToyStore
 * @author njreiss 
 */
public abstract class ToyStore {
  /**
   * A method orderPuzzle returns a string depicting ordering a puzzle
   * @param type holds the type of puzzle
   */
  public String orderPuzzle(String type){
    Puzzle puzzle = createPuzzle(type);
    return puzzle.assemble() + puzzle.boxPuzzle();
  }
  /**
   * Abstract method createPuzzle returns puzzle 
   * @param type decides puzzle type
   */
  public abstract Puzzle createPuzzle(String type);

}
