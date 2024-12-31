package com.tienda.tiendaApp.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "respaldo", schema = "tienda")
public class Respaldo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tienda_id", nullable = false)
    private Tienda tienda;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "archivo_backup")
    private byte[] archivoBackup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public com.tienda.tiendaApp.Model.Tienda getTienda() {
        return tienda;
    }

    public void setTienda(com.tienda.tiendaApp.Model.Tienda tienda) {
        this.tienda = tienda;
    }

    public com.tienda.tiendaApp.Model.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(com.tienda.tiendaApp.Model.Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getArchivoBackup() {
        return archivoBackup;
    }

    public void setArchivoBackup(byte[] archivoBackup) {
        this.archivoBackup = archivoBackup;
    }

}