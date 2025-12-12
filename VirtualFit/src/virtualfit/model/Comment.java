package virtualfit.model;

import java.util.Date;

public class Comment {
    private String commentID;
    private String text;
    private Date timestamp;
    private Account createdBy; // many-to-1

    public Comment(String commentID, String text, Date timestamp, Account createdBy) {
        this.commentID = commentID;
        this.text = text;
        this.timestamp = timestamp;
        this.createdBy = createdBy;
    }

    public String getCommentID() { return commentID; }
    public void setCommentID(String commentID) { this.commentID = commentID; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }

    public Account getCreatedBy() { return createdBy; }
    public void setCreatedBy(Account createdBy) { this.createdBy = createdBy; }
}