package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long>{
    
}
