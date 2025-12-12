package virtualfit.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountId;
    private String username;
    private String email;
    private String password;
    private List<Role> roles;
    private List<Order> orders;

    public Account(String accountId, String username, String email, String password) {
        this.accountId = accountId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public String getAccountId() { return accountId; }
    public void setAccountId(String accountId) { this.accountId = accountId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<Role> getRoles() { return roles; }
    public void setRoles(List<Role> roles) { this.roles = roles; }

    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
}