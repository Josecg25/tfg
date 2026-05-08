package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeporteService {

    private final EventoService eventoService;

    public DeporteService(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    public List<Evento> getEventosDeporte() {
        return eventoService.getAllEventos()
                .stream()
                .filter(e -> e.getIdCategoria() == 2)
                .collect(Collectors.toList());
    }
}
