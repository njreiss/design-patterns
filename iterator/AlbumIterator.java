import java.util.Iterator;
/**
 * @author njreiss
 * Class AlbumIterator implements java's Iterator
 */
public class AlbumIterator implements java.util.Iterator {
  private Song[] song;
  private int position;

  /**
   * Constructor albumIterator 
   * @param songs is the list of songs
   */
  public AlbumIterator(Song[] songs) {
    this.song = songs;
    position = -1;
  }
  /**
   * Method hasNext returns whether or not there is another song in the list
   */
  public boolean hasNext() {
    if (position > 19) {
      return false;
    } else if (song[position + 1] == null) {
      return false;
    } else {
      return true;
    }
  }
  /**
   * Method next returns the next song on the list
   */
  public Song next() {
    if (hasNext()) {
      position++;
      return song[position];
    } else {
      return null;
    }

  }
}
