

import java.util.Iterator;

public class SongDriver {

	public static void main(String[] args) {
		Album myHits = new Album("Surfer Girl");
		myHits.addSong("Surfer Girl", "The Beach Boys", 2.26, Genre.Pop);
		myHits.addSong("Catch a Wave", "The Beach Boys", 2.07, Genre.Pop);
		myHits.addSong("The Surfer Moon", "The Beach Boys", 2.11, Genre.Pop);
		myHits.addSong("South Bay Surfer", "The Beach Boys", 1.45, Genre.Pop);
		myHits.addSong("The Rocking Surfer", "The Beach Boys", 2, Genre.Pop);
		myHits.addSong("Little Deuce Coupe", "The Beach Boys", 1.38, Genre.Pop);
		myHits.addSong("In My Rooom", "The Beach Boys", 2.11, Genre.Pop);
		myHits.addSong("Hawaii", "The Beach Boys", 1.59, Genre.Pop);
		myHits.addSong("Surfers Rule", "The Beach Boys", 1.54, Genre.Pop);
		myHits.addSong("Our Car Club", "The Beach Boys", 2.22, Genre.Pop);
		myHits.addSong("Your Summer Dream", "The Beach Boys", 2.27, Genre.Pop);
		myHits.addSong("Boogie Woodie", "The Beach Boys", 1.56, Genre.Pop);

		AlbumIterator songIterator = myHits.createIterator();

		System.out.println("\n" + myHits.getName() + " Song List:");
		while (songIterator.hasNext()) {
			Song song = songIterator.next();
			System.out.println("-  " + song);
		}
	}
}
