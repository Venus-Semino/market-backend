package mx.edu.tecdesoftware.market_backend.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "compras_productos")

public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;
    private Double totoa;
    private Boolean estado;

    //Producto: todos los productos que hay en una compra
    @ManyToOne
    @JoinColumn(name = "id_compra",
    insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name =  "id_producto",
    insertable = false, updatable = false)
    private Producto producto;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotoa() {
        return totoa;
    }

    public void setTotoa(Double totoa) {
        this.totoa = totoa;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
