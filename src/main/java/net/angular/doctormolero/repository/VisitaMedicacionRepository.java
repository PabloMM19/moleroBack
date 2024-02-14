package net.angular.doctormolero.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.angular.doctormolero.entity.VisitaMedicacionEntity;

public interface VisitaMedicacionRepository extends JpaRepository<VisitaMedicacionEntity, Long>{
    Page<VisitaMedicacionEntity> findByVisitaId(Long visitaId, Pageable pageable);
}
