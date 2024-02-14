package net.angular.doctormolero.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.CalendarioEntity;
import net.angular.doctormolero.exception.ResourceNotFoundException;
import net.angular.doctormolero.repository.CalendarioRepository;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository oCalendarioRepository;

    public CalendarioEntity get(Long id) {
        return oCalendarioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reply not found"));
    }

    public Long create(CalendarioEntity oCalendario) {
        return oCalendarioRepository.save(oCalendario).getId();
    }

    public CalendarioEntity update(CalendarioEntity oCalendario) {
        return oCalendarioRepository.save(oCalendario);
    }

    public Long delete(Long id) {
        oCalendarioRepository.deleteById(id);
        return id;
    }

    public Long populate(Integer amount) {
        for (int i = 0; i < amount; i++) {
            CalendarioEntity oCalendario = new CalendarioEntity("Title " + i, new Date());
            oCalendarioRepository.save(oCalendario);
        }
        return Long.valueOf(amount);
    }

    public Page<CalendarioEntity> getPage(Pageable oPageable) {
        return oCalendarioRepository.findAll(oPageable);
    }
}
