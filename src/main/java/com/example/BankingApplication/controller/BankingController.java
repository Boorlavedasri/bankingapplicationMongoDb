package com.example.BankingApplication.controller;

import com.example.BankingApplication.dto.SBIbankrequest;
import com.example.BankingApplication.model.SBIbanking;
import com.example.BankingApplication.service.Bankingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/banking")
public class BankingController {
    @Autowired
    private Bankingservice service;

    @PostMapping("/createaccount")
    public Mono<SBIbanking> saveAccount(@RequestBody Mono<SBIbanking> sbirequest){
        return service.saveAccount(sbirequest);
    }
}
