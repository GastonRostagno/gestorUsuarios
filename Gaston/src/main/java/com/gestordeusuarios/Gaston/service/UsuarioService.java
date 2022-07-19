package com.gestordeusuarios.Gaston.service;

import java.util.List;

import com.gestordeusuarios.Gaston.entity.Usuario;


public interface UsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(int id);

    public void save(Usuario usuario);

    public void deleteById(int id);
}
