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

    public DiagnosticoEntity get(Long id) {
        return oDiagnosticoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(DiagnosticoEntity oDiagnosticoEntity) {
        return oDiagnosticoRepository.save(oDiagnosticoEntity).getId();
    }

    public DiagnosticoEntity update(DiagnosticoEntity oDiagnosticoEntity) {
        return oDiagnosticoRepository.save(oDiagnosticoEntity);
    }

    public Long delete(Long id) {
        oDiagnosticoRepository.deleteById(id);
        return id;
    }

    public Page<DiagnosticoEntity> getPage(Pageable oPageable) {
        return oDiagnosticoRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            DiagnosticoEntity oDiagnosticoEntity = new DiagnosticoEntity();
            oDiagnosticoEntity.setNombre("Diagnostico " + i);
            oDiagnosticoRepository.save(oDiagnosticoEntity);
        }
        return Long.valueOf(amount);
    }
}
