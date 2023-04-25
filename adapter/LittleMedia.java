package adapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Holds all the inforamtion for a media
 * associated with the little book store
 */
public interface LittleMedia {

    /**
     * Provides the title of the media
     * 
     * @return The media title
     */
    public String getTitle();

    /**
     * Provides the author of the media
     * 
     * @return firstname space last name
     */
    public String getAuthor();

    /**
     * Provides a description of the media
     * 
     * @return The description
     */
    public String getDescription();

    /**
     * Creates a new review and associates it with the media
     * 
     * @param userName The name of the user making a review (first last)
     * @param date     The date the review was made on
     * @param rating   The rating out of 5
     * @param comment  The comment the reviewer made
     */
    public void addReview(String userName, Date date, int rating, String comment);

    /**
     * Provides all the reviews
     * 
     * @return The list of all reviews
     */
    public ArrayList<String> getReviews();
}
