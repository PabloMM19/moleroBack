package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.VisitaPruebaEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.VisitaPruebaRepository;

@Service
public class VisitaPruebaService {
    @Autowired
    VisitaPruebaRepository oVisitaPruebaRepository;

    public VisitaPruebaEntity get(Long id) {
        return oVisitaPruebaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(VisitaPruebaEntity oVisitaPrueba) {
        return oVisitaPruebaRepository.save(oVisitaPrueba).getPrueba_id();
    }

    public VisitaPruebaEntity update(VisitaPruebaEntity oVisitaPrueba) {
        return oVisitaPruebaRepository.save(oVisitaPrueba);
    }

    public Long delete(Long id) {
        oVisitaPruebaRepository.deleteById(id);
        return id;
    }

    public Page<VisitaPruebaEntity> getPage(Pageable oPageable) {
        return oVisitaPruebaRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            VisitaPruebaEntity oVisitaPrueba = new VisitaPruebaEntity();
            oVisitaPrueba.setPrueba_id(Long.valueOf(1));
            oVisitaPruebaRepository.save(oVisitaPrueba);
        }
        return Long.valueOf(amount);
    }
}
