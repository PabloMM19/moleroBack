package net.angular.doctormolero.service;

import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.MedicacionEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.MedicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class MedicacionService {
    @Autowired
    MedicacionRepository oMedicacionRepository;

    public MedicacionEntity get(Long id) {
        return oMedicacionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(MedicacionEntity oMedicacionEntity) {
        return oMedicacionRepository.save(oMedicacionEntity).getId();
    }

    public MedicacionEntity update(MedicacionEntity oMedicacionEntity) {
        return oMedicacionRepository.save(oMedicacionEntity);
    }

    public Long delete(Long id) {
        oMedicacionRepository.deleteById(id);
        return id;
    }

    public Page<MedicacionEntity> getPage(Pageable oPageable) {
        return oMedicacionRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            MedicacionEntity oMedicacionEntity = new MedicacionEntity();
            oMedicacionEntity.setNombre("Medicacion " + i);
            oMedicacionRepository.save(oMedicacionEntity);
        }
        return Long.valueOf(amount);
    }
}
