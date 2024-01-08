package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita_medicacion")
public class VisitaMedicacionEntity {
    
    private Long visita_id;
    private Long medicacion_id;

    public VisitaMedicacionEntity() {
    }

    public VisitaMedicacionEntity(Long visita_id, Long medicacion_id) {
        this.visita_id = visita_id;
        this.medicacion_id = medicacion_id;
    }

    public Long getVisita_id() {
        return visita_id;
    }

    public void setVisita_id(Long visita_id) {
        this.visita_id = visita_id;
    }

    public Long getMedicacion_id() {
        return medicacion_id;
    }

    public void setMedicacion_id(Long medicacion_id) {
        this.medicacion_id = medicacion_id;
    }

    
}
