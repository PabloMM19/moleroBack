package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.PruebaEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.PruebaRepository;

@Service
public class PruebaService {
    @Autowired
    PruebaRepository oPruebaRepository;

    public PruebaEntity get(Long id) {
        return oPruebaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(PruebaEntity oPruebaEntity) {
        return oPruebaRepository.save(oPruebaEntity).getId();
    }

    public PruebaEntity update(PruebaEntity oPruebaEntity) {
        return oPruebaRepository.save(oPruebaEntity);
    }

    public Long delete(Long id) {
        oPruebaRepository.deleteById(id);
        return id;
    }

    public Page<PruebaEntity> getPage(Pageable oPageable) {
        return oPruebaRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            PruebaEntity oPruebaEntity = new PruebaEntity();
            oPruebaEntity.setNombre("Prueba " + i);
            oPruebaRepository.save(oPruebaEntity);
        }
        return Long.valueOf(amount);
    }
}
