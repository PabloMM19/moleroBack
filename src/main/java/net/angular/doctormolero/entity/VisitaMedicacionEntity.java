package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita_medicacion")
public class VisitaMedicacionEntity {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "visita_id")
    private VisitaEntity visita;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "medicacion_id")
    private MedicacionEntity medicacion;

    public VisitaMedicacionEntity() {
    }

    public VisitaMedicacionEntity(Long id, VisitaEntity visita, MedicacionEntity medicacion) {
        this.id = id;
        this.visita = visita;
        this.medicacion = medicacion;
    }

    public VisitaMedicacionEntity(VisitaEntity visita, MedicacionEntity medicacion) {
        this.visita = visita;
        this.medicacion = medicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VisitaEntity getVisita() {
        return visita;
    }

    public MedicacionEntity getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(MedicacionEntity medicacion) {
        this.medicacion = medicacion;
    }

    public void setVisita(VisitaEntity visita) {
        this.visita = visita;
    }

    
}
