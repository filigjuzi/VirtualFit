package virtualfit.model;

import java.util.Date;

public class Review {
    private String reviewID;
    private int rating;
    private String title;
    private String text;
    private Date timestamp;
    private Account createdBy; // many-to-1
    private Product product;   // many-to-1

    public Review(String reviewID, int rating, String title, String text,
                  Date timestamp, Account createdBy, Product product) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.title = title;
        this.text = text;
        this.timestamp = timestamp;
        this.createdBy = createdBy;
        this.product = product;
    }

    public String getReviewID() { return reviewID; }
    public void setReviewID(String reviewID) { this.reviewID = reviewID; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }

    public Account getCreatedBy() { return createdBy; }
    public void setCreatedBy(Account createdBy) { this.createdBy = createdBy; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}