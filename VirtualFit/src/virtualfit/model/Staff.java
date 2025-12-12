package virtualfit.model;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private String staffID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Account account; // 1:1 relationship with Account
    private List<Role> roles; // many-to-many via assigning

    public Staff(String staffID, String firstName, String lastName,
                 String email, String phoneNumber, Account account) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.roles = new ArrayList<>();
    }

    public String getStaffID() { return staffID; }
    public void setStaffID(String staffID) { this.staffID = staffID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    public List<Role> getRoles() { return roles; }
    public void setRoles(List<Role> roles) { this.roles = roles; }
}
