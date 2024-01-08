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

import net.angular.doctormolero.entity.MedidaEntity;
import net.angular.doctormolero.service.MedidaService;

@RestController
@RequestMapping("/medida")
public class MedidaApi {
    @Autowired
    MedidaService oMedidaService;

    @GetMapping("/{id}")
    public ResponseEntity<MedidaEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oMedidaService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody MedidaEntity oMedidaEntity) {
        return ResponseEntity.ok(oMedidaService.create(oMedidaEntity));
    }

    @PutMapping("")
    public ResponseEntity<MedidaEntity> update(@RequestBody MedidaEntity oMedidaEntity) {
        return ResponseEntity.ok(oMedidaService.update(oMedidaEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oMedidaService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<MedidaEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oMedidaService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oMedidaService.populate(amount));
    }
    
}
