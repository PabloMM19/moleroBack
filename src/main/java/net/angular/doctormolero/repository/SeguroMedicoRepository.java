package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.SeguroMedicoEntity;

public interface SeguroMedicoRepository extends JpaRepository<SeguroMedicoEntity, Long>{
    
}
