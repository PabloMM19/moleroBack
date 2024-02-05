package net.angular.doctormolero.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.entity.ProgenitorEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.ProgenitorRepository;

@Service
public class ProgenitorService {
    @Autowired
    ProgenitorRepository oProgenitorRepository;

public List<PacienteEntity> getPacientesByProgenitorId(Long progenitorId) {
        ProgenitorEntity progenitor = oProgenitorRepository.findById(progenitorId)
                .orElseThrow(() -> new ResourceNotFoundException("Progenitor not found"));
        return Collections.singletonList(progenitor.getPaciente());
    }

    public ProgenitorEntity get(Long id) {
        return oProgenitorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(ProgenitorEntity oProgenitorEntity) {
        return oProgenitorRepository.save(oProgenitorEntity).getId();
    }

    public ProgenitorEntity update(ProgenitorEntity oProgenitorEntity) {
        return oProgenitorRepository.save(oProgenitorEntity);
    }

    public Long delete(Long id) {
        oProgenitorRepository.deleteById(id);
        return id;
    }

    public Page<ProgenitorEntity> getPage(Pageable oPageable) {
        return oProgenitorRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            ProgenitorEntity oProgenitorEntity = new ProgenitorEntity();
            oProgenitorEntity.setNombre("Progenitor " + i);
            oProgenitorRepository.save(oProgenitorEntity);
        }
        return Long.valueOf(amount);
    }
}
