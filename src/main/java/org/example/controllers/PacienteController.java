package org.example.controllers;

import org.example.models.Paciente;
import org.example.services.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }
    
    @GetMapping
    public String listaPacientes(Model model) {
        model.addAttribute("pacientes", pacienteService.obtenerTodos());
        return "pacientes/lista";
    }

    @GetMapping("/nuevo")
    public String nuevoPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPaciente(@ModelAttribute Paciente paciente) {
        pacienteService.guardar(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/{id}/editar")
    public String editarPaciente(@PathVariable Long id, Model model) {
        model.addAttribute("paciente", pacienteService.obtenerPorId(id));
        return "pacientes/formulario";
    }
}