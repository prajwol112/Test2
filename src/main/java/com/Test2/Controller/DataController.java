package com.Test2.Controller;

import com.Test2.Repositories.DataRepository;
import com.Test2.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }


    //EndPoint to get the first name of the person with age 11
    @GetMapping("/fetchFirstName")
    public ResponseEntity<String> getFirstName() {
        int requiredAge = 11; // hardcoding the requite age which is 11
        String firstname = dataRepository.findByAge(requiredAge).map(Data::getFirstName)
                .orElse("Not Found");
        return ResponseEntity.ok(firstname);

    }


    //EndPoint to get the id of the person with age 11
    @GetMapping("/fetchid")
    public ResponseEntity<Integer> getId() {
        int requiredAge = 11; // hardcoding the requite age which is 11
        int id = dataRepository.findByAge(requiredAge).map(Data::getId)
                .orElse(null);
        return ResponseEntity.ok(id);

    }


}
