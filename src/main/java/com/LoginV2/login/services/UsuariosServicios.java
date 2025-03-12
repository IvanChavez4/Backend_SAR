package com.LoginV2.login.services;

import java.util.List;
import java.util.Optional;

import com.LoginV2.login.entities.Usuarios;

public interface UsuariosServicios {
    

    List<Usuarios> listar();

    Optional<Usuarios> getbyCorreo(String Correo);
}
