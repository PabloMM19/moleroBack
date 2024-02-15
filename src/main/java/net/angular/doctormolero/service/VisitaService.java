package net.angular.doctormolero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.VisitaEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.VisitaRepository;

@Service
public class VisitaService {
    @Autowired
    VisitaRepository oVisitaRepository;

    @Autowired
    SessionService oSessionService;
    
    public VisitaEntity get(Long id) {
        oSessionService.isLogged();
        return oVisitaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(VisitaEntity oVisitaEntity) {
        oSessionService.isLogged();
        return oVisitaRepository.save(oVisitaEntity).getId();
    }

    public VisitaEntity update(VisitaEntity oVisitaEntity) {
        oSessionService.isLogged();
        return oVisitaRepository.save(oVisitaEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oVisitaRepository.deleteById(id);
        return id;
    }

    public Page<VisitaEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oVisitaRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            VisitaEntity oVisitaEntity = new VisitaEntity();
            oVisitaEntity.setComentario("Visita " + i);
            oVisitaRepository.save(oVisitaEntity);
        }
        return Long.valueOf(amount);
    }

    public List<VisitaEntity> getVisitasByPacienteId(Long pacienteId) {
        oSessionService.isLogged();
        return oVisitaRepository.findByPacienteId(pacienteId);
    }
}
