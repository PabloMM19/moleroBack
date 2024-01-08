package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    private String papellido;
    private String sapellido;
    private String foto;
    /* CLAVE AJENA */
    private Long seguromedico_id;

    public PacienteEntity() {
    }

    public PacienteEntity(Long id, String codigo, String nombre, String papellido, String sapellido, String foto,
            Long seguromedico_id) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
        this.seguromedico_id = seguromedico_id;
    }

    public PacienteEntity(String codigo, String nombre, String papellido, String sapellido, String foto,
            Long seguromedico_id) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
        this.seguromedico_id = seguromedico_id;
    }

    public PacienteEntity(String codigo, String nombre, String papellido, String sapellido, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
    }

    public PacienteEntity(Long id, String codigo, String nombre, String papellido, String sapellido, String foto) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Long getSeguromedico_id() {
        return seguromedico_id;
    }

    public void setSeguromedico_id(Long seguromedico_id) {
        this.seguromedico_id = seguromedico_id;
    }

    
}
