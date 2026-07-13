package mx.edu.tecdesoftware.market_backend.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private int purchaseId;
    private String customerId;
    private LocalDateTime date;
    private String payment;
    private String comment;
    private String active;
    private List<PurchaseItem> items; // La lista de productos de la compra

    public int getPurchaseId() { return purchaseId; }
    public void setPurchaseId(int purchaseId) { this.purchaseId = purchaseId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public String getPayment() { return payment; }
    public void setPayment(String payment) { this.payment = payment; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public String getActive() { return active; }
    public void setActive(String active) { this.active = active; }

    public List<PurchaseItem> getItems() { return items; }
    public void setItems(List<PurchaseItem> items) { this.items = items; }
}