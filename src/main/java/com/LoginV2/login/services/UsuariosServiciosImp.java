package com.LoginV2.login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginV2.login.entities.Usuarios;
import com.LoginV2.login.repositorios.UsuarioRepositorio;

@Service
public class UsuariosServiciosImp implements UsuariosServicios {
    

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuarios guardar(Usuarios usuario) {
        return usuarioRepositorio.save(usuario);
    }


    @Override
    public List<Usuarios> listar() {
        return usuarioRepositorio.findAll();
    }
    
    @Override
    public Optional<Usuarios> getbyCorreo(String Correo) {
        return usuarioRepositorio.findById(Correo);

        
    }
}
