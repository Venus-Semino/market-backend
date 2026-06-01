package mx.edu.tecdesoftware.market_backend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_producto")
    private Integer id;

    private String nombre;

    @Column(name = "id_categorias")
    private Integer id_categoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne()
    @JoinColumn(name = "id_categoria",
    insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getId_categoria() { return id_categoria; }

    public void setId_categoria(Integer id_categoria) { this.id_categoria = id_categoria; }

    public String getCodigoBarras() { return codigoBarras; }

    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }

    public Double getPrecioVenta() { return precioVenta; }

    public void setPrecioVenta(Double precioVenta) { this.precioVenta = precioVenta; }

    public Boolean getEstado() { return estado; }

    public void setEstado(Boolean estado) { this.estado = estado; }
}
