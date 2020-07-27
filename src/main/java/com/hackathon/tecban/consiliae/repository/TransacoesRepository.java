package com.hackathon.tecban.consiliae.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.tecban.consiliae.model.Montante;

public interface TransacoesRepository extends  MongoRepository<Montante,String> {

}
