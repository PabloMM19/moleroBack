package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita_prueba")
public class VisitaPruebaEntity {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "visita_id")
    private VisitaEntity visita;
    
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "prueba_id")
    private PruebaEntity prueba;

    public VisitaPruebaEntity() {
    }

    public VisitaPruebaEntity(Long id, VisitaEntity visita, PruebaEntity prueba) {
        this.id = id;
        this.visita = visita;
        this.prueba = prueba;
    }

    public VisitaPruebaEntity(VisitaEntity visita, PruebaEntity prueba) {
        this.visita = visita;
        this.prueba = prueba;
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

    public void setVisita(VisitaEntity visita) {
        this.visita = visita;
    }

    public PruebaEntity getPrueba() {
        return prueba;
    }

    public void setPrueba(PruebaEntity prueba) {
        this.prueba = prueba;
    }

    
    
}
