package com.conjuntoresidencialjava.controller;

import com.conjuntoresidencialjava.entity.TiposDocumento;
import com.conjuntoresidencialjava.util.service.TiposDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-documento")
public class TiposDocumentoController {

    @Autowired
    private TiposDocumentoService tiposDocumentoService;

    @GetMapping
    public ResponseEntity<List<TiposDocumento>> getAllTiposDocumento() {
        return ResponseEntity.ok(tiposDocumentoService.findAll());
    }

    @PostMapping
    public ResponseEntity<TiposDocumento> createTiposDocumento(@RequestBody TiposDocumento tiposDocumento) {
        return ResponseEntity.ok(tiposDocumentoService.save(tiposDocumento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTiposDocumento(@PathVariable Integer id) {
        tiposDocumentoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
