package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.MedidaEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.MedidaRepository;

@Service
public class MedidaService {
    @Autowired
    MedidaRepository oMedidaRepository;

    @Autowired
    SessionService oSessionService;

    public MedidaEntity get(Long id) {
        oSessionService.isLogged();
        return oMedidaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(MedidaEntity oMedidaEntity) {
        oSessionService.isLogged();
        return oMedidaRepository.save(oMedidaEntity).getId();
    }

    public MedidaEntity update(MedidaEntity oMedidaEntity) {
        oSessionService.isLogged();
        return oMedidaRepository.save(oMedidaEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oMedidaRepository.deleteById(id);
        return id;
    }

    public Page<MedidaEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oMedidaRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            MedidaEntity oMedidaEntity = new MedidaEntity();
            oMedidaEntity.setNombre("Medida " + i);
            oMedidaRepository.save(oMedidaEntity);
        }
        return Long.valueOf(amount);
    }
}
