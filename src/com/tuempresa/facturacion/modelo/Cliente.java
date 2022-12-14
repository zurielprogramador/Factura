package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="simple",members="numero,nombre")
public class Cliente {
	
	@Id
	@Column(length=6)
	int numero;
	@Column(length = 50)
	@Required
	String nombre;
	
	@Embedded
	Direccion direccion;

}
