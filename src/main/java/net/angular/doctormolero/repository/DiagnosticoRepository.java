package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.DiagnosticoEntity;

public interface DiagnosticoRepository extends JpaRepository<DiagnosticoEntity, Long>{
    
}
