package com.gestordeusuarios.Gaston.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestordeusuarios.Gaston.entity.Usuario;
import com.gestordeusuarios.Gaston.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuarios/{Id}")
    public Usuario getUsuario(@PathVariable int Id){
    	Usuario usuario = usuarioService.findById(Id);

        if(usuario == null) {
            throw new RuntimeException("Usuario " + Id + "no encontrado.");
        }
        
        return usuario;
    }

    @PostMapping("/usuarios")
    public Usuario addUsuario(@RequestBody Usuario usuario) {
    	usuarioService.save(usuario);

        return usuario;
    }

    @PutMapping("/usuarios")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
    	usuarioService.save(usuario);

        return usuario;
    }

   @DeleteMapping("usuarios/{Id}")
    public String deteteUsuario(@PathVariable int Id) {

    	Usuario usuario = usuarioService.findById(Id);

        if(usuario == null) {
            throw new RuntimeException("Usuario " + Id + "no encontrado.");
        }

        usuarioService.deleteById(Id);

        return "Usuario " + Id + "borrado.";
    }

}
