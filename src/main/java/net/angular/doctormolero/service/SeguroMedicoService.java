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

    public SeguroMedicoEntity get(Long id) {
        return oSeguroMedicoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(SeguroMedicoEntity oSeguroMedico) {
        return oSeguroMedicoRepository.save(oSeguroMedico).getId();
    }

    public SeguroMedicoEntity update(SeguroMedicoEntity oSeguroMedico) {
        return oSeguroMedicoRepository.save(oSeguroMedico);
    }

    public Long delete(Long id) {
        oSeguroMedicoRepository.deleteById(id);
        return id;
    }

    public Page<SeguroMedicoEntity> getPage(Pageable oPageable) {
        return oSeguroMedicoRepository.findAll(oPageable);
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            SeguroMedicoEntity oSeguroMedico = new SeguroMedicoEntity();
            oSeguroMedico.setCompanyia("SeguroMedico " + i);
            oSeguroMedicoRepository.save(oSeguroMedico);
        }
        return Long.valueOf(amount);
    }
}
