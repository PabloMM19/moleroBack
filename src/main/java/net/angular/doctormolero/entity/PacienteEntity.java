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
    private String fnacimiento;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "seguromedico_id")
    private SeguroMedicoEntity seguroMedico;

    @OneToMany(mappedBy = "paciente", fetch = jakarta.persistence.FetchType.LAZY)
    private List<ProgenitorEntity> progenitores;

    @OneToMany(mappedBy = "paciente", fetch = jakarta.persistence.FetchType.LAZY)
    private List<VisitaEntity> visitas;




    public PacienteEntity() {
    }

    public PacienteEntity(Long id, String codigo, String fnacimiento, String nombre, String papellido, String sapellido, String foto,
            SeguroMedicoEntity seguroMedico) {
        this.id = id;
        this.codigo = codigo;
        this.fnacimiento = fnacimiento;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
        this.seguroMedico = seguroMedico;
    }

    public PacienteEntity(String codigo, String fnacimiento, String nombre, String papellido, String sapellido, String foto,
            SeguroMedicoEntity seguroMedico) {
        this.codigo = codigo;
        this.fnacimiento = fnacimiento;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
        this.seguroMedico = seguroMedico;
    }

    public PacienteEntity(String codigo, String fnacimiento, String nombre, String papellido, String sapellido, String foto) {
        this.codigo = codigo;
        this.fnacimiento = fnacimiento;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.foto = foto;
    }

    public PacienteEntity(Long id, String codigo, String fnacimiento, String nombre, String papellido, String sapellido, String foto) {
        this.id = id;
        this.codigo = codigo;
        this.fnacimiento = fnacimiento;
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

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
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

    public SeguroMedicoEntity getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(SeguroMedicoEntity seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public int getProgenitores() {
        return this.progenitores != null ? this.progenitores.size() : 0;
    }

    public int getVisitas() {
        return this.visitas != null ? this.visitas.size() : 0;
    }
    
}
