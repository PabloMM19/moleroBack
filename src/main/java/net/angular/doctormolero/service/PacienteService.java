package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository oPacienteRepository;

    public PacienteEntity get(Long id) {
        return oPacienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(PacienteEntity oPacienteEntity) {
        return oPacienteRepository.save(oPacienteEntity).getId();
    }

    public PacienteEntity update(PacienteEntity oPacienteEntity) {
        return oPacienteRepository.save(oPacienteEntity);
    }

    public Long delete(Long id) {
        oPacienteRepository.deleteById(id);
        return id;
    }

    public Page<PacienteEntity> getPage(Pageable oPageable) {
        return oPacienteRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            PacienteEntity oPacienteEntity = new PacienteEntity();
            oPacienteEntity.setNombre("Paciente " + i);
            oPacienteRepository.save(oPacienteEntity);
        }
        return Long.valueOf(amount);
    }

}
