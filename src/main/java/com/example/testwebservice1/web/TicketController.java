package com.example.testwebservice1.web;


import com.example.testwebservice1.dao.CashtickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TicketController {


    @Autowired
    private CashtickRepository cashtickRepository;


    @GetMapping("/cashtick")

    public List<Object[]> getAllcashticket(){

      return   cashtickRepository.yourCustomQuery();

    }
}
