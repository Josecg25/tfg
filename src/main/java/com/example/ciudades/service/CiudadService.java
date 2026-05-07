package com.example.ciudades.service;

import com.example.ciudades.model.Ciudad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {

    private final List<Ciudad> ciudades = List.of(
            new Ciudad(28, "MADRID"),
            new Ciudad(46, "VALENCIA"),
            new Ciudad(6, "BARCELONA")
    );

    public List<Ciudad> getCiudades() {
        return ciudades;
    }
}
