package com.LoginV2.login.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoginV2.login.entities.Usuarios;
import com.LoginV2.login.services.UsuariosServiciosImp;

@RestController()
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class UsuariosControlador {
    

    @Autowired
    UsuariosServiciosImp usuariosServiciosImp;

    @PostMapping
    public ResponseEntity<Usuarios> guardar(@RequestBody Usuarios usuarios){

        try{
            Usuarios usuarioGuardado = usuariosServiciosImp.guardar(usuarios);
            return new ResponseEntity<>(usuarioGuardado, HttpStatus.OK);
        }catch(Exception e){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping
    public ResponseEntity<List<Usuarios>> listar(){
        return new ResponseEntity<>(usuariosServiciosImp.listar(), HttpStatus.OK);
    }

    @GetMapping("/{correo}") 
    public ResponseEntity<Usuarios> getbyCorreo(@PathVariable("correo") String correo) {
        Optional<Usuarios> usuario = usuariosServiciosImp.getbyCorreo(correo);
        return usuario.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
