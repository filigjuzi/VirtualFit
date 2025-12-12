package virtualfit.model;

public class Customer extends Guest {
    private String customerId;
    private String name;
    private String surname;
    private Account account; // 1:1 relationship

    public Customer(String sessionId, String guestId, int[] measurements,
                    String customerId, String name, String surname) {
        super(sessionId, guestId, measurements);
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

