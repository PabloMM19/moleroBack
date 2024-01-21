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

import net.angular.doctormolero.entity.VisitaEntity;
import net.angular.doctormolero.service.VisitaService;

//@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/visita")
public class VisitaApi {
    @Autowired
    VisitaService oVisitaService;

    @GetMapping("/{id}")
    public ResponseEntity<VisitaEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oVisitaService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody VisitaEntity oVisitaEntity) {
        return ResponseEntity.ok(oVisitaService.create(oVisitaEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VisitaEntity> update(@RequestBody VisitaEntity oVisitaEntity) {
        return ResponseEntity.ok(oVisitaService.update(oVisitaEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oVisitaService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<VisitaEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oVisitaService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oVisitaService.populate(amount));
    }
}
