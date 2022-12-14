package com.idat.microservicio3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicio3.dto.ReservaDTO;
import com.idat.microservicio3.model.Reserva;
import com.idat.microservicio3.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaRepository repository;

	@Override
	public List<ReservaDTO> listar() {
		List<ReservaDTO> listadto = new ArrayList<ReservaDTO>();
		

		for (Reserva reserva : repository.findAll()) {
			ReservaDTO dto = new ReservaDTO();
			dto.setIdReserva(reserva.getIdReserva());
			dto.setCosto(reserva.getCosto());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public void guardar(ReservaDTO dto) {
		Reserva reserva = new Reserva(dto.getIdReserva(), dto.getCosto());
		repository.save(reserva);

	}

}
