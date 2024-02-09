package net.angular.doctormolero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.VisitaEntity;

public interface VisitaRepository extends JpaRepository<VisitaEntity, Long>{
    List<VisitaEntity> findByPacienteId(Long pacienteId);
}
