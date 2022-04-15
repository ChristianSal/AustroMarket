package com.proyecto.AustroMarket.Controller;

import com.proyecto.AustroMarket.Model.Detail;
import com.proyecto.AustroMarket.Model.Product;
import com.proyecto.AustroMarket.Model.Qualification;
import com.proyecto.AustroMarket.Repository.ProductRepository;
import com.proyecto.AustroMarket.Repository.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/austrom/qualification")
public class QualificationController {

    @Autowired
    private QualificationRepository qualificationRepository;


    @PostMapping
    public ResponseEntity<?> create (@RequestBody Qualification qualification){
        //ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
        qualificationRepository.save(qualification);
        return ResponseEntity.status(HttpStatus.CREATED).body(qualification);
    }

    @GetMapping
    public List<Qualification> getQualification(){
        return qualificationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Qualification> getDetailById(@PathVariable(value="id")Long qualificationId) {
        return qualificationRepository.findById(qualificationId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Qualification qualificationDetail, @PathVariable(value = "id") Long qualificationId) {
        Optional<Qualification> qualification = qualificationRepository.findById(qualificationId);
        double a = 0;

        if (!qualification.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        try {
            if (qualificationDetail.getQualification()>0) {
                qualification.get().setQualification(qualificationDetail.getQualification());
            }
        } catch (Exception e) {

        }

        return ResponseEntity.status(HttpStatus.CREATED).body(qualificationRepository.save(qualification.get()));
    }
}
