package virtualfit.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String cartID;
    private Guest user;
    private List<Product> items;
    private BigDecimal totalAmount;

    public Cart(String cartID, Guest user) {
        this.cartID = cartID;
        this.user = user;
        this.items = new ArrayList<>();
        this.totalAmount = BigDecimal.ZERO;
    }

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public Guest getUser() {
        return user;
    }

    public void setUser(Guest user) {
        this.user = user;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
