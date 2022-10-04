package com.Tienda_L.domain;

import javax.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="cliente")

public class Cliente {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //Hibernate lo convierte en id_cliente
    String nombre;
    String apellidos;
    String correo;
    String telefonos;

    public Cliente(String nombre, String apellidos, String correo, String telefonos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefonos = telefonos;
    }
    
    public Cliente() {
    }
    
    
 
    
    
}
