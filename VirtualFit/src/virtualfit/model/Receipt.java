package virtualfit.model;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt {
    private String receiptID;
    private Order order;
    private BigDecimal totalAmount;
    private String paymentStatus;
    private Date issuedDate;
    private String paymentMethod;

    public Receipt(String receiptID, Order order, BigDecimal totalAmount) {
        this.receiptID = receiptID;
        this.order = order;
        this.totalAmount = totalAmount;
    }

    public String getReceiptID() { return receiptID; }
    public void setReceiptID(String receiptID) { this.receiptID = receiptID; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public Date getIssuedDate() { return issuedDate; }
    public void setIssuedDate(Date issuedDate) { this.issuedDate = issuedDate; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
