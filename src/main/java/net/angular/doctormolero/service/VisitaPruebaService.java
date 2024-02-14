package net.angular.doctormolero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.angular.doctormolero.entity.DiagnosticoEntity;
import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.entity.PruebaEntity;
import net.angular.doctormolero.entity.VisitaEntity;
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
        return oVisitaPruebaRepository.save(oVisitaPrueba).getId();
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
            oVisitaPrueba.setPrueba(new PruebaEntity("Prueba " + i, "Descripcion " + i));
            oVisitaPrueba.setVisita(new VisitaEntity("2024-02-09", "Comentario " + i, new PacienteEntity("PRUEBA", "2002-02-09", "pablo", "molero", "marin", "foto1"), new DiagnosticoEntity("Diagnostico " + i, "Descripcion " + i)));
            oVisitaPruebaRepository.save(oVisitaPrueba);
        }
        return Long.valueOf(amount);
    }

    public List<VisitaPruebaEntity> getPruebasByVisitaId(Long visitaId) {
        return oVisitaPruebaRepository.findByVisitaId(visitaId);
    }
}
