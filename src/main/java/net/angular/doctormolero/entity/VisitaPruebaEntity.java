package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita_prueba")
public class VisitaPruebaEntity {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private Long visita_id;
    private Long prueba_id;

    public VisitaPruebaEntity() {
    }

    public VisitaPruebaEntity(Long id, Long visita_id, Long prueba_id) {
        this.id = id;
        this.visita_id = visita_id;
        this.prueba_id = prueba_id;
    }

    public VisitaPruebaEntity(Long visita_id, Long prueba_id) {
        this.visita_id = visita_id;
        this.prueba_id = prueba_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisita_id() {
        return visita_id;
    }

    public void setVisita_id(Long visita_id) {
        this.visita_id = visita_id;
    }

    public Long getPrueba_id() {
        return prueba_id;
    }

    public void setPrueba_id(Long prueba_id) {
        this.prueba_id = prueba_id;
    }

    
    
}
