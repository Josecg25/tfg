package com.example.ciudades.controller;

import com.example.ciudades.model.Evento;
import com.example.ciudades.service.OcioYCulturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias/ocio")
public class OcioYCulturaController {

    private final OcioYCulturaService ocioService;

    public OcioYCulturaController(OcioYCulturaService ocioService) {
        this.ocioService = ocioService;
    }

    @GetMapping
    public List<Evento> getEventosOcioYCultura() {
        return ocioService.getEventosOcioYCultura();
    }
}
