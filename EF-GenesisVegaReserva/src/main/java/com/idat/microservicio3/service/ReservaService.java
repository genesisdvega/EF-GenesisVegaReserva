package com.idat.microservicio3.service;

import java.util.List;

import com.idat.microservicio3.dto.ReservaDTO;

public interface ReservaService {
	List<ReservaDTO> listar();

	void guardar(ReservaDTO reserva);

}
