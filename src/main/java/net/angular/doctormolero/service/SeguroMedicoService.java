package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.SeguroMedicoEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.SeguroMedicoRepository;

@Service
public class SeguroMedicoService {
    @Autowired
    SeguroMedicoRepository oSeguroMedicoRepository;

    @Autowired
    SessionService oSessionService;

    public SeguroMedicoEntity get(Long id) {
        oSessionService.isLogged();
        return oSeguroMedicoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(SeguroMedicoEntity oSeguroMedico) {
        oSessionService.isLogged();
        return oSeguroMedicoRepository.save(oSeguroMedico).getId();
    }

    public SeguroMedicoEntity update(SeguroMedicoEntity oSeguroMedico) {
        oSessionService.isLogged();
        return oSeguroMedicoRepository.save(oSeguroMedico);
    }

    public Long delete(Long id) {
        oSessionService.isLogged();
        oSeguroMedicoRepository.deleteById(id);
        return id;
    }

    public Page<SeguroMedicoEntity> getPage(Pageable oPageable) {
        oSessionService.isLogged();
        return oSeguroMedicoRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        oSessionService.isLogged();
        for (int i = 0; i < amount; i++) {
            SeguroMedicoEntity oSeguroMedico = new SeguroMedicoEntity();
            oSeguroMedico.setCompanyia("SeguroMedico " + i);
            oSeguroMedicoRepository.save(oSeguroMedico);
        }
        return Long.valueOf(amount);
    }
}
