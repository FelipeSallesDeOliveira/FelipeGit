package br.com.cotemig.bandsapi.controller;

import br.com.cotemig.bandsapi.model.Band;
import br.com.cotemig.bandsapi.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bands")
@CrossOrigin
public class BandController {

    @Autowired
    private BandRepository bandRepository;

    @GetMapping
    public ResponseEntity<List<Band>> getAllBands(){
        return ResponseEntity.ok(bandRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Band> getBandById(@PathVariable("id") Long  id) {
        var band = bandRepository.findById(id);
        if (band.isPresent()){
            return ResponseEntity.ok(band.get());
    }
    return ResponseEntity.notFound().build();
    }
}
