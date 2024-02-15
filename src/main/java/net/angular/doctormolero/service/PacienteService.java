package net.angular.doctormolero.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.entity.ProgenitorEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository oPacienteRepository;

    @Autowired
    SessionService oSessionService;

    public Page<PacienteEntity> searchByName(String query, Pageable pageable) {
        oSessionService.isLogged();
        return oPacienteRepository.findByNombreContainingIgnoreCase(query, pageable);
    }

    public Set<ProgenitorEntity> getProgenitoresByPacienteId(Long pacienteId) {
        oSessionService.isLogged();
        PacienteEntity paciente = oPacienteRepository.findById(pacienteId)
                .orElseThrow(() -> new ResourceNotFoundException("Paciente not found"));
        return new HashSet<>(paciente.getProgenitores());
    }

    public PacienteEntity get(Long id) {
oSessionService.isLogged();
            return oPacienteRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Paciente no encontrado"));
    }

    public Long create(PacienteEntity oPacienteEntity) {
        oSessionService.isLogged();
        return oPacienteRepository.save(oPacienteEntity).getId();
    }

    public PacienteEntity update(PacienteEntity oPacienteEntity) {
        oSessionService.isLogged();
        return oPacienteRepository.save(oPacienteEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oPacienteRepository.deleteById(id);
        return id;
    }

    public Page<PacienteEntity> getPage(Pageable oPageable) {
        if (oSessionService.isLogged()) {
            return oPacienteRepository.findAll(oPageable);
            
        } else {
            throw new RuntimeException("El usuario no está autenticado");
        }
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            PacienteEntity oPacienteEntity = new PacienteEntity();
            oPacienteEntity.setNombre("Paciente " + i);
            oPacienteRepository.save(oPacienteEntity);
        }
        return Long.valueOf(amount);
    }

}
