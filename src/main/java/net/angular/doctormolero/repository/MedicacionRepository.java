package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.MedicacionEntity;

public interface MedicacionRepository extends JpaRepository<MedicacionEntity, Long>{
    
}
