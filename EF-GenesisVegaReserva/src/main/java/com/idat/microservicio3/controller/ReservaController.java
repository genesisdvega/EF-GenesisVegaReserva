package com.idat.microservicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.microservicio3.dto.ReservaDTO;
import com.idat.microservicio3.service.ReservaService;

@Controller
@RequestMapping("/reserva")
public class ReservaController {
	@Autowired
	private ReservaService service;

	@GetMapping("/listar")
	public @ResponseBody List<ReservaDTO> listar() {
		return service.listar();
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody ReservaDTO dto) {
		service.guardar(dto);
	}
}
