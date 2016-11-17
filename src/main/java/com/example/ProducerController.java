package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    @RequestMapping(value = "/check", method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public BeerResponse check(@RequestBody PersonToCheck personToCheck) {

        return null;
    }
}



