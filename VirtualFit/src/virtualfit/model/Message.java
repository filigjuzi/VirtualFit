package virtualfit.model;

import java.time.LocalDateTime;

public class Message {
    private String messageId;
    private String text;
    private Account createdBy;
    private LocalDateTime timestamp;

    public Message(String messageId, String text, Account createdBy, LocalDateTime timestamp) {
        this.messageId = messageId;
        this.text = text;
        this.createdBy = createdBy;
        this.timestamp = timestamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
