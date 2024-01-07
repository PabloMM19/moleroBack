package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicacion")
public class MedicacionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nombre;
    String descripcion;
    /* CLAVE AJENA */
    Long medida_id;

    public MedicacionEntity() {
    }

    public MedicacionEntity(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public MedicacionEntity(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public MedicacionEntity(Long id, String nombre, String descripcion, Long medida_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medida_id = medida_id;
    }

    public MedicacionEntity(String nombre, String descripcion, Long medida_id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medida_id = medida_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getMedida_id() {
        return medida_id;
    }

    public void setMedida_id(Long medida_id) {
        this.medida_id = medida_id;
    }

    
}
