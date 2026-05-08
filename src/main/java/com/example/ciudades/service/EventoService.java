package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    private List<Evento> eventos = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/eventos.json");

            eventos = mapper.readValue(inputStream, new TypeReference<List<Evento>>() {});
            System.out.println("✔ eventos.json cargado: " + eventos.size());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Error cargando eventos.json");
        }
    }

    public List<Evento> getAllEventos() {
        return eventos;
    }

    public List<Evento> getEventosByCiudad(int idCiudad) {
        return eventos.stream()
                .filter(e -> e.getIdCiudad() == idCiudad)
                .toList();
    }
}
