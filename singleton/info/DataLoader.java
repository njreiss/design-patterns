

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Used to read data from text files
 */
public class DataLoader {
  // relative path to the file, based on the directory you currently have open
  private static final String FILE_NAME = "songs.txt";

  /**
   * Returns a list of all songs from the text file
   * 
   * @return An ArrayList of Songs
   */
  public static ArrayList<Song> getSongs() {
    ArrayList<Song> songs = new ArrayList<Song>();

    try {
      File file = new File(FILE_NAME);
      Scanner scanner = new Scanner(file);

      // loop through to get each question
      while (scanner.hasNextLine()) {
        String[] data = scanner.nextLine().split("-");
        String title = data[0].trim();
        String artist = data[1].trim();
        Song song = new Song(title, artist);
        songs.add(song);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Sorry, we could not properly read the songs file");
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return songs;
  }
}
