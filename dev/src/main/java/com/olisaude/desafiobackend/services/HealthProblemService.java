package com.olisaude.desafiobackend.services;

import com.olisaude.desafiobackend.dtos.HealthProblemDTO;
import com.olisaude.desafiobackend.entities.Client;
import com.olisaude.desafiobackend.entities.HealthProblem;
import com.olisaude.desafiobackend.repositories.ClientRepository;
import com.olisaude.desafiobackend.repositories.HealthProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class HealthProblemService {

    @Autowired
    private HealthProblemRepository repository;

    @Autowired
    private ClientRepository clientRepository;


    @Transactional
    public HealthProblem saveHealthProblem(HealthProblemDTO healthProblemDTO){
        if (healthProblemDTO != null){
            HealthProblem healthProblem = new HealthProblem(healthProblemDTO);
            return repository.save(healthProblem);
        }else {
            throw new RuntimeException("Error to create Health Problem");
        }
    }

}