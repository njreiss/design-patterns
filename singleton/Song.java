/**
 * @author njreiss
 * Song class 
 */
public class Song {
  private String title;
  private String artist;
/**
 * Song constructor creates song object
 * @param title is song title
 * @param artist is song artist
 */
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;

  }
  /**
   * toString consttructor returns song formatted as a string
   */
  public String toString() {
    return title + " by " + artist;
  }
}