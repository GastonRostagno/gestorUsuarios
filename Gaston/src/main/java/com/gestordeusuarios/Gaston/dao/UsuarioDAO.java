package com.gestordeusuarios.Gaston.dao;

import java.util.List;

import com.gestordeusuarios.Gaston.entity.Usuario;


public interface UsuarioDAO {

    public List<Usuario> findAll();

    public Usuario findById(int id);

    public void save(Usuario usuario);

    public void deleteById(int id);
}