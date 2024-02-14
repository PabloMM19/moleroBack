package net.angular.doctormolero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.VisitaPruebaEntity;

public interface VisitaPruebaRepository extends JpaRepository<VisitaPruebaEntity, Long>{
    List<VisitaPruebaEntity> findByVisitaId(Long visitaId);
}
