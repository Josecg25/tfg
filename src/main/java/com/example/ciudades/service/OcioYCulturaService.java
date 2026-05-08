package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OcioYCulturaService {

    private final EventoService eventoService;

    public OcioYCulturaService(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    public List<Evento> getEventosOcioYCultura() {
        return eventoService.getAllEventos()
                .stream()
                .filter(e -> e.getIdCategoria() == 1)
                .collect(Collectors.toList());
    }
}
