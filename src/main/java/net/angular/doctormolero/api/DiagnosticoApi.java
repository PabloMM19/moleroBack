package net.angular.doctormolero.api;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.angular.doctormolero.entity.DiagnosticoEntity;
import net.angular.doctormolero.service.DiagnosticoService;

//@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/diagnostico")
public class DiagnosticoApi {
    @Autowired
    DiagnosticoService oDiagnosticoService;

    @GetMapping("/{id}")
    public ResponseEntity<DiagnosticoEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oDiagnosticoService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody DiagnosticoEntity oDiagnosticoEntity) {
        return ResponseEntity.ok(oDiagnosticoService.create(oDiagnosticoEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiagnosticoEntity> update(@RequestBody DiagnosticoEntity oDiagnosticoEntity) {
        return ResponseEntity.ok(oDiagnosticoService.update(oDiagnosticoEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oDiagnosticoService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<DiagnosticoEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oDiagnosticoService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oDiagnosticoService.populate(amount));
    }
}
