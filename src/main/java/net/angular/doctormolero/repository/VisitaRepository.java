package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.VisitaEntity;

public interface VisitaRepository extends JpaRepository<VisitaEntity, Long>{
    
}
