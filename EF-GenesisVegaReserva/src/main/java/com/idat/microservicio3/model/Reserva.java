package com.idat.microservicio3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Getter
@Setter
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;

	private double costo;

	public Reserva(Integer idReserva, double costo) {
		super();
		this.idReserva = idReserva;
		this.costo = costo;
	}

	public Reserva() {
		super();
	}

}
