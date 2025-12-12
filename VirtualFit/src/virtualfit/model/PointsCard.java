package virtualfit.model;

public class PointsCard {
    private String cardID;
    private Account owner; // 1:1 relationship
    private int currentPoints;

    public PointsCard(String cardID, Account owner, int currentPoints) {
        this.cardID = cardID;
        this.owner = owner;
        this.currentPoints = currentPoints;
    }

    public String getCardID() { return cardID; }
    public void setCardID(String cardID) { this.cardID = cardID; }

    public Account getOwner() { return owner; }
    public void setOwner(Account owner) { this.owner = owner; }

    public int getCurrentPoints() { return currentPoints; }
    public void setCurrentPoints(int currentPoints) { this.currentPoints = currentPoints; }
}
