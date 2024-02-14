package net.angular.doctormolero.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.angular.doctormolero.entity.CalendarioEntity;
import net.angular.doctormolero.service.CalendarioService;

@RestController
@RequestMapping("/calendario")
public class CalendarioApi {
    @Autowired
    CalendarioService oCalendarioService;

    @GetMapping("/{id}")
    public ResponseEntity<CalendarioEntity> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(oCalendarioService.get(id));
    }

    @PostMapping("")
    public ResponseEntity<Long> create(CalendarioEntity oCalendarioEntity) {
        return ResponseEntity.ok(oCalendarioService.create(oCalendarioEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CalendarioEntity> update(CalendarioEntity oCalendarioEntity) {
        return ResponseEntity.ok(oCalendarioService.update(oCalendarioEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oCalendarioService.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<CalendarioEntity>> getPage(Pageable oPageable) {
        return ResponseEntity.ok(oCalendarioService.getPage(oPageable));
    }

    @PostMapping("/populate/{amount}")
    public ResponseEntity<Long> populate(@PathVariable("amount") Integer amount) {
        return ResponseEntity.ok(oCalendarioService.populate(amount));
    }
    
}
