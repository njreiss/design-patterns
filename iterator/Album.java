/**
 * @author njreiss
 * public class Album, holds array of songs
 */
public class Album {
  private int count;
  private String name;
  private Song[] songs;
  /**
   * Constructor makes album object
   * @param name is the name of the album
   */
  public Album(String name) {
    this.count = 0;
    this.name = name;
    this.songs = new Song[20];
  }
  /**
   * AddSong method that returns boolean whether song is being added
   * @param name is song name
   * @param artist is song artist
   * @param length is song length
   * @param genre is song genre
   */
  public boolean addSong(String name, String artist, double length, Genre genre) {
    if (count > 19) {
      return false;
    } else {
      songs[count] = new Song(name, artist, length, genre);
      count++;
      return true;
    }
  }
  /**
   * Creates and returns albumiterator
   */
  public AlbumIterator createIterator() {
    AlbumIterator songList = new AlbumIterator(songs);
    return songList;
  }
  /**
   * Returns string name
   */
  public String getName() {
    return name;
  }
}
