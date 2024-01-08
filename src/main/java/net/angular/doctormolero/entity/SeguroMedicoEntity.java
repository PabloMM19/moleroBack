package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seguromedico")
public class SeguroMedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyia;
    private String descripcion;

    public SeguroMedicoEntity() {
    }

    public SeguroMedicoEntity(Long id, String companyia, String descripcion) {
        this.id = id;
        this.companyia = companyia;
        this.descripcion = descripcion;
    }

    public SeguroMedicoEntity(String companyia, String descripcion) {
        this.companyia = companyia;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
