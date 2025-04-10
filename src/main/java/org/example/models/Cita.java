package org.example.models;

import java.time.LocalDateTime;

public class Cita {
    private Long id;
    private Paciente paciente;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado;

    public Cita() {
    }

    public Cita(Long id, Paciente paciente, LocalDateTime fechaHora) {
        this.id = id;
        this.paciente = paciente;
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}