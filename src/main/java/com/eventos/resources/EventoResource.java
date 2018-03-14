package com.eventos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import com.eventos.model.Evento;
import com.eventos.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResource {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping(produces="application/json")
	//@GetMapping("/cool-eventos")
	@CrossOrigin(origins = "http://localhost:4200")
	public @ResponseBody Iterable<Evento> listaEventos() {
		Iterable<Evento> listaEventos = er.findAll();
		return listaEventos;
	}
	
	@GetMapping(value = "/{name}")
	public Evento findByName(@PathVariable final String name) {
		return er.findByName(name);
	}
	
	@PostMapping()
	public Evento cadastraEvento(@RequestBody @Valid Evento evento)
	{
		return er.save(evento);
	}
	
	@DeleteMapping()
	public Evento deletaEvento(@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}
	
}
