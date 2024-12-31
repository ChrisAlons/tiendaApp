package com.tienda.tiendaApp.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuario", schema = "tienda")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @Size(max = 255) @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@Size(max = 255) @NotNull String nombre) {
        this.nombre = nombre;
    }

    public @Size(max = 255) @NotNull String getEmail() {
        return email;
    }

    public void setEmail(@Size(max = 255) @NotNull String email) {
        this.email = email;
    }

    public @Size(max = 255) @NotNull String getPassword() {
        return password;
    }

    public void setPassword(@Size(max = 255) @NotNull String password) {
        this.password = password;
    }

    public @Size(max = 50) @NotNull String getRol() {
        return rol;
    }

    public void setRol(@Size(max = 50) @NotNull String rol) {
        this.rol = rol;
    }

    @Size(max = 255)
    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @Size(max = 50)
    @NotNull
    @Column(name = "rol", nullable = false, length = 50)
    private String rol;


}