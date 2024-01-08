package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.VisitaMedicacionEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.VisitaMedicacionRepository;

@Service
public class VisitaMedicacionService {
    @Autowired
    VisitaMedicacionRepository oVisitaMedicacionRepository;

    public VisitaMedicacionEntity get(Long id) {
        return oVisitaMedicacionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(VisitaMedicacionEntity oVisitaMedicacion) {
        return oVisitaMedicacionRepository.save(oVisitaMedicacion).getMedicacion_id();
    }

    public VisitaMedicacionEntity update(VisitaMedicacionEntity oVisitaMedicacion) {
        return oVisitaMedicacionRepository.save(oVisitaMedicacion);
    }

    public Long delete(Long id) {
        oVisitaMedicacionRepository.deleteById(id);
        return id;
    }

    public Page<VisitaMedicacionEntity> getPage(Pageable oPageable) {
        return oVisitaMedicacionRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            VisitaMedicacionEntity oVisitaMedicacion = new VisitaMedicacionEntity();
            oVisitaMedicacion.setMedicacion_id(Long.valueOf(1));
            oVisitaMedicacionRepository.save(oVisitaMedicacion);
        }
        return Long.valueOf(amount);
    }
}
