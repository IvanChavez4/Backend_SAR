package com.LoginV2.login.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuarios {
    
    @Id
    @NotBlank
    private String Correo;

    @NotBlank
    private String NombreCompleto;
    
    
    @NotBlank
    @Column(name = "contraseña")  
    private String contrasena; 
}
