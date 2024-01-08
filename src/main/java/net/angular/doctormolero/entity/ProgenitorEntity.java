package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Long paciente_id;

    public ProgenitorEntity() {
    }

    public ProgenitorEntity(Long id, String dni, String nombre, String papellido, String sapellido, boolean rol,
            Long paciente_id) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.rol = rol;
        this.paciente_id = paciente_id;
    }

    public ProgenitorEntity(String dni, String nombre, String papellido, String sapellido, boolean rol,
            Long paciente_id) {
        this.dni = dni;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.rol = rol;
        this.paciente_id = paciente_id;
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

    public Long getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    
}
