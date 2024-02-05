package net.angular.doctormolero.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import net.angular.doctormolero.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long>{
    Page<PacienteEntity> findByNombreContainingIgnoreCase(String query, Pageable pageable);
}
