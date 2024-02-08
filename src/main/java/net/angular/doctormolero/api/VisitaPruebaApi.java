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

import net.angular.doctormolero.entity.VisitaPruebaEntity;
import net.angular.doctormolero.service.VisitaPruebaService;

//@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/visitaprueba")
public class VisitaPruebaApi {
    @Autowired
    VisitaPruebaService oVisitaPruebaService;

    @GetMapping("/{id}")
    public ResponseEntity<VisitaPruebaEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oVisitaPruebaService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody VisitaPruebaEntity oVisitaPruebaEntity) {
        return ResponseEntity.ok(oVisitaPruebaService.create(oVisitaPruebaEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VisitaPruebaEntity> update(@RequestBody VisitaPruebaEntity oVisitaPruebaEntity) {
        return ResponseEntity.ok(oVisitaPruebaService.update(oVisitaPruebaEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oVisitaPruebaService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<VisitaPruebaEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oVisitaPruebaService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oVisitaPruebaService.populate(amount));
    }
}
