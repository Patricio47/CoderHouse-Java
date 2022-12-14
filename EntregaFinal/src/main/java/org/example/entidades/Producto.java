package org.example.entidades;

import jakarta.persistence.*;
import org.springframework.http.HttpStatusCode;

import java.util.Objects;



@Entity
@Table(name = "PRODUCTO")


public class Producto{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public HttpStatusCode save;

    public Producto() {
    }
    public Producto(String producto, String marca, long idProducto){
        this.producto = producto;
        this.marca = marca;
        this.idproducto = idproducto;
    }
    @Column (name = "PRODUCTO")
    private String producto;
    @Column (name = "MARCA")
    private String marca;
    @Column (name = "IDPRODUCTO")
    private long idproducto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    @Override

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Producto producto1 = (Producto) object;
        return idproducto == producto1.idproducto && java.util.Objects.equals(producto, producto1.producto) && java.util.Objects.equals(marca, producto1.marca);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), producto, marca, idproducto);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Producto{" +
                "producto='" + producto + '\'' +
                ", marca='" + marca + '\'' +
                ", idproducto=" + idproducto +
                '}';
    }
}


