package mx.edu.tecdesoftware.market_backend.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.List;
import java.util.stream.LongStream;

@Entity
@Table (name = "clientes")
public class Cliente {

    @Id

    private String id;
    private String nombre;
    private String apellidos;
    private String celular;
    private Integer direccion;

    @Column(name = "correo_electronico")
    private String CorreoElectronico;
    //Un cliete tiene muchas compras
    @OneToMany(mappedBy = "id_cliente")
    private List<Compra> compras;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getCelular() { return celular; }

    public void setCelular(String celular) { this.celular = celular; }

    public Integer getDireccion() { return direccion; }

    public void setDireccion(Integer direccion) { this.direccion = direccion; }

    public String getCorreoElectronico() { return CorreoElectronico; }

    public void setCorreoElectronico(String correoElectronico) { CorreoElectronico = correoElectronico; }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
