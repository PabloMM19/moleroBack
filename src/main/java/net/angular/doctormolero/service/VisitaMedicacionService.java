package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.DiagnosticoEntity;
import net.angular.doctormolero.entity.MedicacionEntity;
import net.angular.doctormolero.entity.MedidaEntity;
import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.entity.VisitaEntity;
import net.angular.doctormolero.entity.VisitaMedicacionEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.VisitaMedicacionRepository;

@Service
public class VisitaMedicacionService {
    @Autowired
    VisitaMedicacionRepository oVisitaMedicacionRepository;

    @Autowired
    SessionService oSessionService;

    public VisitaMedicacionEntity get(Long id) {
        oSessionService.isLogged();
        return oVisitaMedicacionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(VisitaMedicacionEntity oVisitaMedicacion) {
        oSessionService.isLogged();
        return oVisitaMedicacionRepository.save(oVisitaMedicacion).getId();
    }

    public VisitaMedicacionEntity update(VisitaMedicacionEntity oVisitaMedicacion) {
        oSessionService.isLogged();
        return oVisitaMedicacionRepository.save(oVisitaMedicacion);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oVisitaMedicacionRepository.deleteById(id);
        return id;
    }

    public Page<VisitaMedicacionEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oVisitaMedicacionRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            VisitaMedicacionEntity oVisitaMedicacion = new VisitaMedicacionEntity();
            oVisitaMedicacion.setMedicacion(new MedicacionEntity("Medicacion " + i, "Descripcion " + i, new MedidaEntity("Kilogramo")));
            oVisitaMedicacion.setVisita(new VisitaEntity("2024-02-09", "Comentario " + i, new PacienteEntity("PRUEBA", "2002-02-09", "pablo", "molero", "marin", "foto1"), new DiagnosticoEntity("Diagnostico " + i, "Descripcion " + i)));
            oVisitaMedicacionRepository.save(oVisitaMedicacion);
        }
        return Long.valueOf(amount);
    }

    /* get by visitaid */
    public Page<VisitaMedicacionEntity> getByVisitaId(Long visitaId, Pageable pageable) {
        oSessionService.isLogged();
        return oVisitaMedicacionRepository.findByVisitaId(visitaId, pageable);
    }
}
