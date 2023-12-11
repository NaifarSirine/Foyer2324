package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.Foyer.IFoyerService;
import tn.esprit.spring.Services.Universite.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("universite")
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService service;

    @PostMapping("addOrUpdate")
    Universite addOrUpdate(@RequestBody Universite u) {
        return service.addOrUpdate(u);
    }

    @GetMapping("findAll")
    List<Universite> findAll() {
        return service.findAll();
    }

    @GetMapping("findById")
    Universite findById(@RequestParam long id) {
        return service.findById(id);
    }

    @DeleteMapping("delete")
    void delete(@RequestBody Universite u) {
        service.delete(u);
    }

    @DeleteMapping("deleteById")
    void deleteById(@RequestParam long id) {
        service.deleteById(id);
    }


}
