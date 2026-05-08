package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoService {

    private List<Evento> eventos = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/eventos.json");

            eventos = mapper.readValue(inputStream, new TypeReference<List<Evento>>() {});
            System.out.println("✔ Eventos cargados desde eventos.json: " + eventos.size());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Error cargando eventos.json");
        }
    }

    // ✔ Obtener todos los eventos
    public List<Evento> getAllEventos() {
        return eventos;
    }

    // ✔ Obtener eventos filtrados por ciudad
    public List<Evento> getEventosByCiudad(int idCiudad) {
        return eventos.stream()
                .filter(e -> e.getIdCiudad() == idCiudad)
                .collect(Collectors.toList());
    }
}
