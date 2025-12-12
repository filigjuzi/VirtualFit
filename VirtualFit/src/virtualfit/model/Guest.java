package virtualfit.model;

public class Guest {
    private String sessionId;
    private String guestId;
    private int[] measurements;

    public Guest(String sessionId, String guestId, int[] measurements) {
        this.sessionId = sessionId;
        this.guestId = guestId;
        this.measurements = measurements;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public int[] getMeasurements() {
        return measurements;
    }

    public void setMeasurements(int[] measurements) {
        this.measurements = measurements;
    }
}
