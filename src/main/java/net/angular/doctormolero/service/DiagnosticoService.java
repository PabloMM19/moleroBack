package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.DiagnosticoEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.DiagnosticoRepository;

@Service
public class DiagnosticoService {
    @Autowired
    DiagnosticoRepository oDiagnosticoRepository;

    @Autowired
    SessionService oSessionService;

    public DiagnosticoEntity get(Long id) {
        oSessionService.isLogged();
        return oDiagnosticoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(DiagnosticoEntity oDiagnosticoEntity) {
        oSessionService.isLogged();
        return oDiagnosticoRepository.save(oDiagnosticoEntity).getId();
    }

    public DiagnosticoEntity update(DiagnosticoEntity oDiagnosticoEntity) {
        oSessionService.isLogged();
        return oDiagnosticoRepository.save(oDiagnosticoEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oDiagnosticoRepository.deleteById(id);
        return id;
    }

    public Page<DiagnosticoEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oDiagnosticoRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            DiagnosticoEntity oDiagnosticoEntity = new DiagnosticoEntity();
            oDiagnosticoEntity.setNombre("Diagnostico " + i);
            oDiagnosticoRepository.save(oDiagnosticoEntity);
        }
        return Long.valueOf(amount);
    }
}
