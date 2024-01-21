package net.angular.doctormolero.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "medida")
public class MedidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "medida", fetch = jakarta.persistence.FetchType.LAZY)
    private List<MedicacionEntity> medicaciones;

    public MedidaEntity() {
    }

    public MedidaEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public MedidaEntity(String nombre) {
        this.nombre = nombre;
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

    public int getMedicaciones() {
        return this.medicaciones != null ? this.medicaciones.size() : 0;
    }

    
}
