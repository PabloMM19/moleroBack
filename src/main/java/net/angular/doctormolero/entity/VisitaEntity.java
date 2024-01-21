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
@Table(name = "visita")
public class VisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String comentario;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteEntity paciente;
    /* CLAVE AJENA */
    @ManyToOne
    @JoinColumn(name = "diagnostico_id")
    private DiagnosticoEntity diagnostico;

    @OneToMany(mappedBy = "visita", fetch = jakarta.persistence.FetchType.LAZY)
    private List<VisitaPruebaEntity> visitaPruebas;

    @OneToMany(mappedBy = "visita", fetch = jakarta.persistence.FetchType.LAZY)
    private List<VisitaMedicacionEntity> visitaMedicaciones;

    public VisitaEntity() {
    }

    public VisitaEntity(Long id, String fecha, String comentario, PacienteEntity paciente, DiagnosticoEntity diagnostico) {
        this.id = id;
        this.fecha = fecha;
        this.comentario = comentario;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    public VisitaEntity(String fecha, String comentario, PacienteEntity paciente, DiagnosticoEntity diagnostico) {
        this.fecha = fecha;
        this.comentario = comentario;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public DiagnosticoEntity getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(DiagnosticoEntity diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getVisitaPruebas() {
        return this.visitaPruebas != null ? this.visitaPruebas.size() : 0;
    }

    public int getVisitaMedicaciones() {
        return this.visitaMedicaciones != null ? this.visitaMedicaciones.size() : 0;
    }
    
}
