package virtualfit.model;

import java.util.Date;

public class Shipment {
    private String shipmentID;
    private Order order; // 1:1 relationship
    private String shipmentStatus;
    private String trackingNumber;
    private Date shipmentDate;
    private Date deliveryDate;

    public Shipment(String shipmentID, Order order, String shipmentStatus, String trackingNumber,
                    Date shipmentDate, Date deliveryDate) {
        this.shipmentID = shipmentID;
        this.order = order;
        this.shipmentStatus = shipmentStatus;
        this.trackingNumber = trackingNumber;
        this.shipmentDate = shipmentDate;
        this.deliveryDate = deliveryDate;
    }

    public String getShipmentID() { return shipmentID; }
    public void setShipmentID(String shipmentID) { this.shipmentID = shipmentID; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public String getShipmentStatus() { return shipmentStatus; }
    public void setShipmentStatus(String shipmentStatus) { this.shipmentStatus = shipmentStatus; }

    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }

    public Date getShipmentDate() { return shipmentDate; }
    public void setShipmentDate(Date shipmentDate) { this.shipmentDate = shipmentDate; }

    public Date getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(Date deliveryDate) { this.deliveryDate = deliveryDate; }
}

