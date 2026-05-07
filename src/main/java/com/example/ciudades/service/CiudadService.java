package com.example.ciudades.service;

import com.example.ciudades.model.Ciudad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadService {

    public List<Ciudad> obtenerCiudades() {
        List<Ciudad> ciudades = new ArrayList<>();
        // Inicialmente solo una ciudad, pero la lista está preparada para más
        ciudades.add(new Ciudad(28L, "Madrid"));
        return ciudades;
    }
}
