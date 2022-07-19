package com.gestordeusuarios.Gaston.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestordeusuarios.Gaston.dao.UsuarioDAO;
import com.gestordeusuarios.Gaston.entity.Usuario;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listUsuarios= usuarioDAO.findAll();
        return listUsuarios;
    }

    @Override
    public Usuario findById(int id) {
    	Usuario usuario = usuarioDAO.findById(id);
        return usuario;
    }

    @Override
    public void save(Usuario usuario) {
    	usuarioDAO.save(usuario);

    }

    @Override
    public void deleteById(int id) {
    	usuarioDAO.deleteById(id);
    }

}
