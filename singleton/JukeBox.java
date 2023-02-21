/**
 * @author njreiss
 * public class JukeBox
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
  private static JukeBox jukeBox;
  private ArrayList<Song> songs;
  private LinkedList<String> songQueue;

  /** 
   * private JukeBox constructor creates JukeBox object, is only called once
   * in getInstance
   */
  private JukeBox() {
    DataLoader dataLoader = new DataLoader();

    songs = dataLoader.getSongs();
    songQueue = new LinkedList<String>();
  }
  /**
   * getInstance creates initial instance of JukeBox and always returns that
   * same instance
   */
  public static JukeBox getInstance() {
    if (jukeBox == null) {
			jukeBox = new JukeBox();
		}
		return jukeBox;
  }
  /**
   * method playNextSong returns string depending on whether there is a next
   * song
   */
  public String playNextSong() {
    if (songQueue.isEmpty()){
      return "You need to add songs to the list";
    } else {
      return "Lets jam to " + songQueue.poll().toString() + " ";
    }
  }
  /**
   * Method requestSong returns song name and position on queue or an invalid
   * entry message
   * @param title is the song that is supposed to be added to queue
   */
  public String requestSong(String title) {
    for (int i = 0; i < songs.size(); i++) {
      String songName = songs.get(i).toString();
      songName = songName.substring(0, songName.indexOf(" by"));
      if(title.equals(songName)) {
        songQueue.add(songs.get(i).toString());
        return songName + " is now number " + songQueue.size() + " on the list.";
      }
    }
    return "Sorry we do not have the song " + title;
  }
  /**
   * Method hasMoreSongs returns boolean value that represents whether the
   * queue is empty
   */
  public Boolean hasMoreSongs() {
    if (songQueue.isEmpty()) {
      return false;
    } else {
      return true;
    }
  }

}
