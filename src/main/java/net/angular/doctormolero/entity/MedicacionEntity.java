package net.angular.doctormolero.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @ManyToOne
    @JoinColumn(name = "medida_id")
    private MedidaEntity medida;

    @OneToMany(mappedBy = "medicacion", fetch = jakarta.persistence.FetchType.LAZY)
    private List<VisitaMedicacionEntity> medicacionVisitas;

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

    public MedicacionEntity(Long id, String nombre, String descripcion, MedidaEntity medida) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medida = medida;
    }

    public MedicacionEntity(String nombre, String descripcion, MedidaEntity medida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medida = medida;
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

    public MedidaEntity getMedida() {
        return medida;
    }

    public void setMedida(MedidaEntity medida) {
        this.medida = medida;
    }

    public int getMedicacionVisitas() {
        return medicacionVisitas.size();
    }

}
