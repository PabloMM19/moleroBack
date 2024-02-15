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

    @Autowired
    SessionService oSessionService;

    public PruebaEntity get(Long id) {
        oSessionService.isLogged();
        return oPruebaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(PruebaEntity oPruebaEntity) {
        oSessionService.isLogged();
        return oPruebaRepository.save(oPruebaEntity).getId();
    }

    public PruebaEntity update(PruebaEntity oPruebaEntity) {
        oSessionService.isLogged();
        return oPruebaRepository.save(oPruebaEntity);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oPruebaRepository.deleteById(id);
        return id;
    }

    public Page<PruebaEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oPruebaRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            PruebaEntity oPruebaEntity = new PruebaEntity();
            oPruebaEntity.setNombre("Prueba " + i);
            oPruebaRepository.save(oPruebaEntity);
        }
        return Long.valueOf(amount);
    }
}
