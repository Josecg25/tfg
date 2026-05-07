package com.example.ciudades.controller;

import com.example.ciudades.dto.EventoDto;
import com.example.ciudades.model.Evento;
import com.example.ciudades.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/{ciudadId}")
    public List<EventoDto> obtenerEventos(@PathVariable Long ciudadId) {
        List<Evento> eventos = eventoService.obtenerEventosPorCiudad(ciudadId);

        return eventos.stream()
                .map(e -> new EventoDto(
                        e.getId(),
                        e.getTitulo(),
                        e.getDescripcion(),
                        e.getUrl(),
                        e.getCiudadId()))
                .collect(Collectors.toList());
    }
}
