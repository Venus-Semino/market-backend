package mx.edu.tecdesoftware.market_backend.persistence.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "compras_productos")

public class CompraProducto {

    @Embeddable
    private CompraProductoPk id;

    private Integer cantidad;
    private Double totoa;
    private Boolean estado;

    public CompraProductoPk getId() {
        return id;
    }

    public void setId(CompraProductoPk id) {
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
}
