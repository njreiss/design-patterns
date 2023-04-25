package adapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Holds the data for a new media object
 */
public interface Media {
    /**
     * Provides the title of the media
     * 
     * @return The media items title
     */
    public String getTitle();

    /**
     * Provides the author of the media
     * 
     * @return The author as an object
     */
    public Author getAuthor();

    /**
     * Provides the description of the media
     * 
     * @return The text description
     */
    public String getDescription();

    /**
     * Creates a review for the media
     * 
     * @param firstName The reviewers first name
     * @param lastName  The reviewers last name
     * @param date      The date the review was made
     * @param rating    The rating out of 5
     * @param comment   The comment the user made
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment);

    /**
     * Provides all the reviews
     * 
     * @return The list of medias reviews
     */
    public ArrayList<Review> getReviews();
}
