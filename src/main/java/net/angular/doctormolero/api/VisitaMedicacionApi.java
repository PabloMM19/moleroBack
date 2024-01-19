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

import net.angular.doctormolero.entity.VisitaMedicacionEntity;
import net.angular.doctormolero.service.VisitaMedicacionService;

//@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/visitamedicacion")
public class VisitaMedicacionApi {
    @Autowired
    VisitaMedicacionService oVisitaMedicacionService;

    @GetMapping("/{id}")
    public ResponseEntity<VisitaMedicacionEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oVisitaMedicacionService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody VisitaMedicacionEntity oVisitaMedicacionEntity) {
        return ResponseEntity.ok(oVisitaMedicacionService.create(oVisitaMedicacionEntity));
    }

    @PutMapping("")
    public ResponseEntity<VisitaMedicacionEntity> update(@RequestBody VisitaMedicacionEntity oVisitaMedicacionEntity) {
        return ResponseEntity.ok(oVisitaMedicacionService.update(oVisitaMedicacionEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oVisitaMedicacionService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<VisitaMedicacionEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oVisitaMedicacionService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oVisitaMedicacionService.populate(amount));
    }
}
