package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EventoService {

    private final Map<Integer, List<Evento>> mapaEventos = new HashMap<>();

    public EventoService() {

        mapaEventos.put(28, List.of(
                new Evento(
                        28, 1,
                        "Monumentos de la ciudad de Madrid",
                        "Los tipos de monumentos incluidos son: estatuas, grupos escultóricos, fuentes y estanques ornamentales, fuentes monumentales, puertas y arcos triunfales, lápidas y placas conmemorativas, laminas de agua y estanque simples y otros varios.",
                        "https://datos.madrid.es/dataset/300356-0-monumentos-ciudad-madrid/resource/300356-2-monumentos-ciudad-madrid-json/download/300356-2-monumentos-ciudad-madrid-json.json"
                ),
                new Evento(
                        28, 2,
                        "Sedes. Centros con Espacios Deportivos.",
                        "Recopila información de centros e instalaciones que cuentan con espacios deportivos tanto de ámbito público como privado que están publicados en el portal institucional madrid.es.",
                        "https://datos.madrid.es/dataset/212808-0-espacio-deporte/resource/212808-1-espacio-deporte-json/download/212808-1-espacio-deporte-json.json"
                )
        ));

        mapaEventos.put(6, List.of(
                new Evento(
                        6, 1,
                        "Espacios de la ciudad de Barcelona donde se realiza cine, teatro y conciertos",
                        "Espacios de la ciudad de Barcelona donde se realiza cine, teatro y conciertos. Incluye auditorios",
                        "https://opendata-ajuntament.barcelona.cat/data/dataset/beeb12bb-b153-45cb-bf4a-0e579f60912d/resource/a837dfd4-6f8d-4c79-9a45-0de486464e25/download"
                )
        ));

        mapaEventos.put(46, List.of()); // Valencia sin eventos por ahora
    }

    public List<Evento> getEventosByCiudad(int idCiudad) {
        return mapaEventos.getOrDefault(idCiudad, Collections.emptyList());
    }

    public List<Evento> getAllEventos() {
        return mapaEventos.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
