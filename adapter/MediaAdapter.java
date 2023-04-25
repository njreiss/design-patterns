package adapter;

import java.util.Date;
import java.util.ArrayList;

public class MediaAdapter implements Media {
  private LittleMedia littleMedia;
  private ArrayList<Review> reviews;


  public MediaAdapter(LittleMedia littleMedia) {
      this.littleMedia = littleMedia;

  }

  public String getTitle() {
      return littleMedia.getTitle();
  }

  public Author getAuthor() {
    String Author = littleMedia.getAuthor();
    String[] names = Author.split(" ");

    String firstName = names[0];
    String lastName = names[1];
    return Author;  
  }

  public String getDescription() {
    return littleMedia.getDescription();
  }

  public void addReview(String firstName, String lastName, Date date, double rating, String comment){
  // String[] names = 
    firstName = firstName;
    Review review = new Review(firstName, lastName, date, (int)rating, comment);


    littleMedia.getReviews().add(review.toString());
  }

  public ArrayList<Review> getReviews() {

    ArrayList<Review> reviews = new ArrayList<>();
    for (int i = 0; i < littleMedia.getReviews().size(); i++) {
      String review = littleMedia.getReviews().get(i);
      String[] splitReview = review.split(" stars - ");
      String rating = splitReview[0];
      review = splitReview[1];
      String[] splitReview2 = review.split(" by ");
      String comment = splitReview2[0];
      review = splitReview2[1];
      String[] splitReview3 = review.split(" ");
      String firstName = splitReview3[0];
      String lastName = splitReview3[1];
      String date = splitReview3[3];
      String[] dateParts = date.split("/");
      Date dateFromatted = new Date(dateParts[2], dateParts[0], dateParts[1]);

      reviews.add(new Review(firstName, lastName, dateFromatted, rating, comment));
    }
    return reviews;
  }

}