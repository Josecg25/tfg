package com.example.ciudades.service;

import com.example.ciudades.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final List<Categoria> categorias = List.of(
            new Categoria(1, "OCIO Y CULTURA"),
            new Categoria(2, "DEPORTE")
    );

    public List<Categoria> getAllCategorias() {
        return categorias;
    }
}
