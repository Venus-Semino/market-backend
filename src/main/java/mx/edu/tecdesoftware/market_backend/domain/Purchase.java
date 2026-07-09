package mx.edu.tecdesoftware.market_backend.domain;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Cliente;

import java.time.LocalDateTime;

public class Purchase {
    private int purchaseId;
    private String customerId;
    private LocalDateTime date;
    private String payment;
    private String comment;
    private String active;
    private Customer customer;

    public int getPurchaseId() { return purchaseId; }

    public void setPurchaseId(int purchaseId) { this.purchaseId = purchaseId; }

    public String getClientId() { return customerId; }

    public void setClientId(String clientId) { this.customerId = clientId; }

    public LocalDateTime getDate() { return date; }

    public void setDate(LocalDateTime date) { this.date = date; }

    public String getPayment() { return payment; }

    public void setPayment(String payment) { this.payment = payment; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }

    public String getActive() { return active; }

    public void setActive(String active) { this.active = active; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
}
