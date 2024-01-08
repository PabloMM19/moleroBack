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

import net.angular.doctormolero.entity.ProgenitorEntity;
import net.angular.doctormolero.service.ProgenitorService;

@RestController
@RequestMapping("/progenitor")
public class ProgenitorApi {
    @Autowired
    ProgenitorService oProgenitorService;

    @GetMapping("/{id}")
    public ResponseEntity<ProgenitorEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oProgenitorService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody ProgenitorEntity oProgenitorEntity) {
        return ResponseEntity.ok(oProgenitorService.create(oProgenitorEntity));
    }

    @PutMapping("")
    public ResponseEntity<ProgenitorEntity> update(@RequestBody ProgenitorEntity oProgenitorEntity) {
        return ResponseEntity.ok(oProgenitorService.update(oProgenitorEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oProgenitorService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<ProgenitorEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oProgenitorService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oProgenitorService.populate(amount));
    }

}
