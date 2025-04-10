package org.example.services;

import org.example.models.Paciente;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PacienteService {
    private List<Paciente> pacientes = new ArrayList<>();

    public List<Paciente> obtenerTodos() {
        return pacientes;
    }

    public Paciente obtenerPorId(Long id) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void guardar(Paciente paciente) {
        pacientes.add(paciente);
    }
}