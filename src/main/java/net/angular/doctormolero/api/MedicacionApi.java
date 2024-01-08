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

import net.angular.doctormolero.entity.MedicacionEntity;
import net.angular.doctormolero.service.MedicacionService;

@RestController
@RequestMapping("/medicacion")
public class MedicacionApi {
    @Autowired
    MedicacionService oMedicacionService;

    @GetMapping("/{id}")
    public ResponseEntity<MedicacionEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oMedicacionService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(@RequestBody MedicacionEntity oMedicacionEntity) {
        return ResponseEntity.ok(oMedicacionService.create(oMedicacionEntity));
    }

    @PutMapping("")
    public ResponseEntity<MedicacionEntity> update(@RequestBody MedicacionEntity oMedicacionEntity) {
        return ResponseEntity.ok(oMedicacionService.update(oMedicacionEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oMedicacionService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<MedicacionEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oMedicacionService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oMedicacionService.populate(amount));
    }
}
