
public class MusicDriver {

	public static void main(String[] args) {
		JukeBox jukeBox = JukeBox.getInstance();

		System.out.println();

		// Holds the list of all the songs we want to add to the jukebox
		String[] myFavSongs = { "Hey Jude", "Baby Shark", "Dancing Queen", "Stand By Me", "No Woman No Cry", "YMCA",
				"My Generation" };

		// loops through and attempst to add songs to the jukebox
		System.out.println("Entering our songs");
		for (String song : myFavSongs) {
			System.out.println(jukeBox.requestSong(song));
		}

		// prints the songs as they are played
		System.out.println("\nPlaying our songs");

		while (jukeBox.hasMoreSongs()) {
			System.out.println(jukeBox.playNextSong());
		}
	}
}

