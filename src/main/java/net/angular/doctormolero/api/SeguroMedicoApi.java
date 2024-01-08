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

import net.angular.doctormolero.entity.SeguroMedicoEntity;
import net.angular.doctormolero.service.SeguroMedicoService;

@RestController
@RequestMapping("/seguromedico")
public class SeguroMedicoApi {
    @Autowired
    SeguroMedicoService oSeguroMedicoService;

    @GetMapping("/{id}")
    public ResponseEntity<SeguroMedicoEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oSeguroMedicoService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody SeguroMedicoEntity oSeguroMedicoEntity) {
        return ResponseEntity.ok(oSeguroMedicoService.create(oSeguroMedicoEntity));
    }

    @PutMapping("")
    public ResponseEntity<SeguroMedicoEntity> update(@RequestBody SeguroMedicoEntity oSeguroMedicoEntity) {
        return ResponseEntity.ok(oSeguroMedicoService.update(oSeguroMedicoEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oSeguroMedicoService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<SeguroMedicoEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oSeguroMedicoService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oSeguroMedicoService.populate(amount));
    }

}
