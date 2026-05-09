package com.example.ciudades.service;

import com.example.ciudades.model.Evento;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    private List<Evento> eventos = new ArrayList<>();

    @PostConstruct
    public void init() {

        eventos.add(new Evento(
                3,
                6,
                1,
                "Espacios de la ciudad de Barcelona donde se realiza cine, teatro y conciertos",
                "Espacios de la ciudad de Barcelona donde se realiza cine, teatro y conciertos. Incluye auditorios",
                "https://opendata-ajuntament.barcelona.cat/data/dataset/beeb12bb-b153-45cb-bf4a-0e579f60912d/resource/a837dfd4-6f8d-4c79-9a45-0de486464e25/download"
        ));

        eventos.add(new Evento(
                1,
                28,
                1,
                "Monumentos de la ciudad de Madrid",
                "Los tipos de monumentos incluidos son: estatuas, grupos escultóricos, fuentes y estanques ornamentales, fuentes monumentales, puertas y arcos triunfales, lápidas y placas conmemorativas, láminas de agua y estanques simples y otros varios.",
                "https://datos.madrid.es/dataset/300356-0-monumentos-ciudad-madrid/resource/300356-2-monumentos-ciudad-madrid-json/download/300356-2-monumentos-ciudad-madrid-json.json"
        ));

        eventos.add(new Evento(
                2,
                28,
                2,
                "Sedes. Centros con Espacios Deportivos.",
                "Recopila información de centros e instalaciones que cuentan con espacios deportivos tanto de ámbito público como privado.",
                "https://datos.madrid.es/dataset/212808-0-espacio-deporte/resource/212808-1-espacio-deporte-json/download/212808-1-espacio-deporte-json.json"
        ));

        eventos.add(new Evento(
                4,
                28,
                1,
                "Agenda de actividades y eventos.",
                "Relación de actividades de distinto tipo que se celebran en centros municipales o asociados al Ayuntamiento.",
                "https://datos.madrid.es/dataset/300107-0-agenda-actividades-eventos/resource/300107-5-agenda-actividades-eventos-json/download/300107-5-agenda-actividades-eventos-json.json"
        ));

        eventos.add(new Evento(
                5,
                28,
                2,
                "Piscinas municipales en la ciudad de Madrid.",
                "Información de los centros deportivos municipales donde existe piscina, cubierta o al aire libre.",
                "https://datos.madrid.es/dataset/210227-0-piscinas-publicas/resource/210227-1-piscinas-publicas-json/download/210227-1-piscinas-publicas-json.json"
        ));

        eventos.add(new Evento(
                6,
                28,
                1,
                "Cursos y talleres en los centros culturales de los distritos.",
                "Información sobre cursos y talleres organizados por centros culturales de los distritos.",
                "https://datos.madrid.es/dataset/50064-0-talleres-culturales-cursos/resource/50064-20-talleres-culturales-cursos/download/50064-20-talleres-culturales-cursos.json"
        ));

        eventos.add(new Evento(
                7,
                46,
                3,
                "Datos de turismo sobre hoteles en la Comunidad Valenciana",
                "Datos semanales con información de empresas turísticas inscritas en el Registro de Turismo de la Comunitat Valenciana.",
                "https://dadesobertes.gva.es/es/dataset/dades-turisme-hotels-comunitat-valenciana/resource/71d330c9-85e9-4ad5-94b6-95a07e6c2d51"
        ));
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
