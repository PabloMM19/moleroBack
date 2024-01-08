package net.angular.doctormolero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.ProgenitorEntity;

public interface ProgenitorRepository extends JpaRepository<ProgenitorEntity, Long>{
    
}
