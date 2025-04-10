package org.example.models;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class HistoriaClinica {
    private Long id;
    private String antecedentesmedicos;
    private String alergias;
    private String medicamentosActuales;
    private List<Tratamiento> tratamientosRealizados;
    private List<String> observaciones;
    
    public HistoriaClinica(Long id) {
        this.id = id;
        this.tratamientosRealizados = new ArrayList<>();
        this.observaciones = new ArrayList<>();
    }
    
    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getAntecedentesmedicos() { return antecedentesmedicos; }
    public void setAntecedentesmedicos(String antecedentesmedicos) { 
        this.antecedentesmedicos = antecedentesmedicos; 
    }
    
    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }
    
    public String getMedicamentosActuales() { return medicamentosActuales; }
    public void setMedicamentosActuales(String medicamentosActuales) { 
        this.medicamentosActuales = medicamentosActuales; 
    }
    
    // Métodos para manejar tratamientos
    public void agregarTratamiento(Tratamiento tratamiento) {
        this.tratamientosRealizados.add(tratamiento);
    }
    
    public List<Tratamiento> getTratamientosRealizados() {
        return tratamientosRealizados;
    }
    
    // Métodos para manejar observaciones
    public void agregarObservacion(String observacion) {
        this.observaciones.add(observacion);
    }
    
    public List<String> getObservaciones() {
        return observaciones;
    }
}