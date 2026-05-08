package com.example.ciudades.controller;

import com.example.ciudades.model.Evento;
import com.example.ciudades.service.DeporteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias/deporte")
public class DeporteController {

    private final DeporteService deporteService;

    public DeporteController(DeporteService deporteService) {
        this.deporteService = deporteService;
    }

    @GetMapping
    public List<Evento> getEventosDeporte() {
        return deporteService.getEventosDeporte();
    }
}