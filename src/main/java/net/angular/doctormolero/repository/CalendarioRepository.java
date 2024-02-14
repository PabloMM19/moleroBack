package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.CalendarioEntity;

public interface CalendarioRepository extends JpaRepository<CalendarioEntity, Long>{
    
}
