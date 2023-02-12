/** 
 * @author njreiss
 * public class song creates song object
 */
public class Song {
  private String name;
  private String artist;
  private double length;
  private Genre genre;
  /**
   * Song constructor instantiates all the variables and calls toString method 
   * @param name
   * @param artist
   * @param length
   * @param genre
   */
  public Song(String name, String artist, double length, Genre genre){
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
    this.toString();
  }
  /**
   * toString method returns String data formatted as a sentance
   */
  public String toString() {
    return name + " by " + artist + " category: " + genre + " length: " + length + "min";
  }
}
