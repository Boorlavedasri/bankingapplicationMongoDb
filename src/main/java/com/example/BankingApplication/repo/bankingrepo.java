package com.example.BankingApplication.repo;

import com.example.BankingApplication.model.SBIbanking;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface bankingrepo extends ReactiveMongoRepository<SBIbanking,String > {
}
