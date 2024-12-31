package com.tienda.tiendaApp.Controller;

import com.tienda.tiendaApp.DTO.UsuarioDTO;
import com.tienda.tiendaApp.Model.Usuario;
import com.tienda.tiendaApp.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    //crea un endpoint que retorne un helloworld
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/Login/{email}/{password}")
    public String login(@PathVariable String email, @PathVariable String password) {

        if (usuarioRepository.findUsuarioByEmailAndPassword(email, password) != null) {
            return "Bienvenido";
        } else {
            return "Usuario o contraseña incorrectos";
        }

    }


    @PostMapping("/Usuario/{nombre}/{email}/{password}/{rol}")
    public String crearUsuario(@PathVariable String nombre,  @PathVariable String email,@PathVariable String password, @PathVariable String rol) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        usuario.setRol(rol);
        usuarioRepository.save(usuario);
        return "Usuario creado";
    }

    @PutMapping("/Usuario/{id}/{nombre}/{email}/{password}/{rol}")
    public String actualizarUsuario(@PathVariable Long id, @PathVariable String nombre, @PathVariable String email, @PathVariable String password, @PathVariable String rol) {
        Usuario usuario = usuarioRepository.findById(id).get();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        usuario.setRol(rol);
        usuarioRepository.save(usuario);
        return "Usuario actualizado";
    }

    @DeleteMapping("/Usuario/{id}")
    public String borrarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "Usuario eliminado";
    }

    @GetMapping("/Usuario/{id}")
    public UsuarioDTO obtenerUsuario(@PathVariable Long id) {
        var usuario = usuarioRepository.findById(id);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.get().getId(), usuario.get().getNombre(), usuario.get().getEmail(), usuario.get().getRol());


        return usuarioDTO;
    }



}
