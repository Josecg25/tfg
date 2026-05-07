package com.example.ciudades.controller;

import com.example.ciudades.model.Evento;
import com.example.ciudades.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    // ✔ Todos los eventos
    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoService.getAllEventos();
    }

    // ✔ Eventos por ciudad
    @GetMapping("/{idCiudad}")
    public List<Evento> getEventosByCiudad(@PathVariable int idCiudad) {
        return eventoService.getEventosByCiudad(idCiudad);
    }
}
