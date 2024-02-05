package net.angular.doctormolero.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "progenitor")
public class ProgenitorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String nombre;
    private String papellido;
    private String sapellido;
    private boolean rol;
    /* CLAVE AJENA */
    @ManyToOne
@JoinColumn(name = "paciente_id")
@JsonBackReference
private PacienteEntity paciente;


    public ProgenitorEntity() {
    }

    public ProgenitorEntity(Long id, String dni, String nombre, String papellido, String sapellido, boolean rol,
            PacienteEntity paciente) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.rol = rol;
        this.paciente = paciente;
    }

    public ProgenitorEntity(String dni, String nombre, String papellido, String sapellido, boolean rol,
            PacienteEntity paciente) {
        this.dni = dni;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.rol = rol;
        this.paciente = paciente;
    }

    public ProgenitorEntity(String dni, String nombre, String papellido, String sapellido, boolean rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public boolean isRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }
    
}
