package com.LoginV2.login.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginV2.login.entities.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, String>{
    
}
