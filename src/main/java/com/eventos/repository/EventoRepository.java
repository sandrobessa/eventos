package com.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eventos.model.Evento;

@Repository //para o Spring gerenciar o objeto
@CrossOrigin(origins = "http://localhost:4200")
public interface EventoRepository extends JpaRepository<Evento, String> {
	Evento findByName(String name);
}