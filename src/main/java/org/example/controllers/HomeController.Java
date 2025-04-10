package org.example.controllers;

import org.example.services.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    private final CitaService citaService;

    public HomeController(CitaService citaService) {
        this.citaService = citaService;
    }
    
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/api/citas")
    @ResponseBody
    public List<EventoCalendario> obtenerCitas() {
        return citaService.obtenerTodas().stream()
            .map(cita -> new EventoCalendario(
                cita.getId(),
                cita.getPaciente().getNombre() + " " + cita.getPaciente().getApellido(),
                cita.getFechaHora().toString(),
                cita.getFechaHora().plusHours(1).toString()
            ))
            .collect(Collectors.toList());
    }

    // Clase interna para el formato del calendario
    private static class EventoCalendario {
        public Long id;
        public String title;
        public String start;
        public String end;

        public EventoCalendario(Long id, String title, String start, String end) {
            this.id = id;
            this.title = title;
            this.start = start;
            this.end = end;
        }
    }
}