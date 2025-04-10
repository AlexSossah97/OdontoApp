package org.example.services;

import org.example.models.Cita;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class CitaService {
    private List<Cita> citas = new ArrayList<>();

    public List<Cita> obtenerTodas() {
        return citas;
    }

    public void guardar(Cita cita) {
        citas.add(cita);
    }
}