package com.LoginV2.login.entities;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "tbl_usuarios")
@NoArgsConstructor
@Entity
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "correo")
    private String Correo;

    @NotBlank
    @Column(name = "contraseña")  
    private String contrasena;
    
    @NotBlank
    @Column(name = "rol_sistema")
    private String rolSistema;

    @NotBlank
    @Column(name = "estatus")
    private String estatus;

    @NotBlank
    @Column(name = "nombre")
    private String nombre;

    @NotBlank
    @Column(name = "apellidos")
    private String apellidos;

    @NotBlank
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @NotBlank
    @Column(name = "edad")
    private int edad;

    @NotBlank
    @Column(name = "rfc")
    private String rfc;

    @NotBlank
    @Column(name = "curp")
    private String curp;
    
    @NotBlank
    @Column(name = "telefono")
    private String telefono;

    
    @Column(name = "foto")
    private byte foto;

    @NotBlank
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @NotBlank
    @Column(name = "puesto")
    private String puesto;

    @NotBlank
    @Column(name = "costo_hora")
    private double costoHora;

    @NotBlank
    @Column(name = "sueldo_liquido")
    private double sueldoLiquido;

    @NotBlank
    @Column(name = "sueldo_neto")
    private double sueldoNeto;


}
