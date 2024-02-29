package com.example.BankingApplication.service;

import com.example.BankingApplication.dto.SBIbankrequest;
import com.example.BankingApplication.model.SBIbanking;
import com.example.BankingApplication.repo.bankingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
public class Bankingservice {
    @Autowired
    private bankingrepo repo;
    public Mono<SBIbanking> saveAccount(Mono<SBIbanking> sbirequest) {
        return sbirequest.flatMap(repo::save);
    }
}
