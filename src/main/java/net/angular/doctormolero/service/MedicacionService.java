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

    @Autowired
    SessionService oSessionService;

    public MedicacionEntity get(Long id) {
        oSessionService.isLogged();
        return oMedicacionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(MedicacionEntity oMedicacionEntity) {
        oSessionService.isLogged();
        return oMedicacionRepository.save(oMedicacionEntity).getId();
    }

    public MedicacionEntity update(MedicacionEntity oMedicacionEntity) {
        oSessionService.isLogged();
        return oMedicacionRepository.save(oMedicacionEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oMedicacionRepository.deleteById(id);
        return id;
    }

    public Page<MedicacionEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oMedicacionRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            MedicacionEntity oMedicacionEntity = new MedicacionEntity();
            oMedicacionEntity.setNombre("Medicacion " + i);
            oMedicacionRepository.save(oMedicacionEntity);
        }
        return Long.valueOf(amount);
    }
}
