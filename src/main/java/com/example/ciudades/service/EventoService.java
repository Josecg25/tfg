package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoService {

    private final List<Evento> eventos = new ArrayList<>();

    public EventoService() {
        // 10 eventos inventados para Madrid (id 28)
        eventos.add(new Evento(1L, "Concierto en el Retiro",
                "Música en directo al aire libre en el Parque del Retiro.",
                "https://eventos.madrid/retiro-concierto", 28L));

        eventos.add(new Evento(2L, "Feria del Libro",
                "Encuentro anual con autores, firmas y actividades culturales.",
                "https://eventos.madrid/feria-libro", 28L));

        eventos.add(new Evento(3L, "Exposición de Arte Moderno",
                "Galería con obras de artistas emergentes.",
                "https://eventos.madrid/arte-moderno", 28L));

        eventos.add(new Evento(4L, "Carrera Popular Madrid",
                "Evento deportivo abierto a todos los niveles.",
                "https://eventos.madrid/carrera-popular", 28L));

        eventos.add(new Evento(5L, "Festival Gastronómico",
                "Degustación de platos típicos y cocina internacional.",
                "https://eventos.madrid/gastro-fest", 28L));

        eventos.add(new Evento(6L, "Noche de los Museos",
                "Museos abiertos hasta la madrugada con entrada gratuita.",
                "https://eventos.madrid/noche-museos", 28L));

        eventos.add(new Evento(7L, "Mercado Medieval",
                "Puestos artesanales, espectáculos y gastronomía temática.",
                "https://eventos.madrid/mercado-medieval", 28L));

        eventos.add(new Evento(8L, "Cine de Verano",
                "Proyecciones al aire libre en diferentes barrios.",
                "https://eventos.madrid/cine-verano", 28L));

        eventos.add(new Evento(9L, "Festival de Jazz",
                "Conciertos de jazz en plazas y teatros.",
                "https://eventos.madrid/jazz-fest", 28L));

        eventos.add(new Evento(10L, "Madrid Gaming Week",
                "Convención de videojuegos, eSports y tecnología.",
                "https://eventos.madrid/gaming-week", 28L));
    }

    public List<Evento> obtenerEventosPorCiudad(Long ciudadId) {
        return eventos.stream()
                .filter(e -> e.getCiudadId().equals(ciudadId))
                .collect(Collectors.toList());
    }
}
