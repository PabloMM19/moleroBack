package net.angular.doctormolero.api;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.angular.doctormolero.entity.PacienteEntity;
import net.angular.doctormolero.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteApi {
    @Autowired
    PacienteService oPacienteService;

    @GetMapping("/{id}")
    public ResponseEntity<PacienteEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oPacienteService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody PacienteEntity oPacienteEntity) {
        return ResponseEntity.ok(oPacienteService.create(oPacienteEntity));
    }

    @PutMapping("")
    public ResponseEntity<PacienteEntity> update(@RequestBody PacienteEntity oPacienteEntity) {
        return ResponseEntity.ok(oPacienteService.update(oPacienteEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oPacienteService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<PacienteEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oPacienteService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oPacienteService.populate(amount));
    }
}
