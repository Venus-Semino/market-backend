package mx.edu.tecdesoftware.market_backend.domain;

public class PurchaseItem {
    private int purchaseId;
    private int productId;
    private int quantity;
    private Integer total;
    private boolean active;

    public int getPurchaseId() { return purchaseId; }

    public void setPurchaseId(int purchaseId) { this.purchaseId = purchaseId; }

    public int getProductId() { return productId; }

    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Integer getTotal() { return total; }

    public void setTotal(Integer total) { this.total = total; }

    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
