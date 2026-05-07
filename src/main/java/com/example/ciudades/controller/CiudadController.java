package com.example.ciudades.controller;

import com.example.ciudades.dto.CiudadDto;
import com.example.ciudades.model.Ciudad;
import com.example.ciudades.service.CiudadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CiudadController {

    private final CiudadService ciudadService;

    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping("/ciudades")
    public List<CiudadDto> listarCiudades() {
        List<Ciudad> ciudades = ciudadService.getCiudades();
        return ciudades.stream()
                .map(c -> new CiudadDto(c.getId(), c.getNombre()))
                .collect(Collectors.toList());
    }
}
