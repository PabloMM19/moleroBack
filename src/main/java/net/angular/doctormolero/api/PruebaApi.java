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

import net.angular.doctormolero.entity.PruebaEntity;
import net.angular.doctormolero.service.PruebaService;

//@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/prueba")
public class PruebaApi {
    @Autowired
    PruebaService oPruebaService;

    @GetMapping("/{id}")
    public ResponseEntity<PruebaEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oPruebaService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody PruebaEntity oPruebaEntity) {
        return ResponseEntity.ok(oPruebaService.create(oPruebaEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PruebaEntity> update(@RequestBody PruebaEntity oPruebaEntity) {
        return ResponseEntity.ok(oPruebaService.update(oPruebaEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oPruebaService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<PruebaEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oPruebaService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oPruebaService.populate(amount));
    }
}
