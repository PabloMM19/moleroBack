package net.angular.doctormolero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Long paciente_id;
    /* CLAVE AJENA */
    private Long diagnostico_id;

    public VisitaEntity() {
    }

    public VisitaEntity(Long id, String fecha, String comentario, Long paciente_id, Long diagnostico_id) {
        this.id = id;
        this.fecha = fecha;
        this.comentario = comentario;
        this.paciente_id = paciente_id;
        this.diagnostico_id = diagnostico_id;
    }

    public VisitaEntity(String fecha, String comentario, Long paciente_id, Long diagnostico_id) {
        this.fecha = fecha;
        this.comentario = comentario;
        this.paciente_id = paciente_id;
        this.diagnostico_id = diagnostico_id;
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

    public Long getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Long getDiagnostico_id() {
        return diagnostico_id;
    }

    public void setDiagnostico_id(Long diagnostico_id) {
        this.diagnostico_id = diagnostico_id;
    }

    
}
