package com.hackathon.tecban.consiliae.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hackathon.tecban.consiliae.controller.Empresa;
import com.hackathon.tecban.consiliae.dtos.Data;

@Service
public class TransacoesServices {
	
	
	public Data getTransacoes() throws URISyntaxException {
		
		 RestTemplate restTemplate = new RestTemplate();
	     
		    final String baseUrl = "https://rs2.tecban-sandbox.o3bank.co.uk/open-banking/v3.1/aisp/transactions";
		    URI uri = new URI(baseUrl);
		 
//		    ResponseEntity<Data> result = restTemplate.getForEntity(uri, Data.class);
		    

		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		    headers.set("x-fapi-financial-id", "c3c937c4-ab71-427f-9b59-4099b7c680ab");
		    headers.set("x-fapi-interaction-id", "9d18a4c7-5f0e-46cc-9eac-e6cd393edbb0");
		    headers.set("Authorization", "Bearer 97640ca3-bb05-48ea-9d19-003c83367a45");

		    HttpEntity<String> entity = new HttpEntity<>("body", headers);

		    ResponseEntity<Data> result = restTemplate.exchange(uri, HttpMethod.GET, entity, Data.class);
		    
		  
		    return result.getBody();

	}
	
	
	
	public RetornaConsiliacao retornaConciliacao () {
		return retornaConciliacao();
	}
	
	
	public Empresa cadastraEmpresaa(Empresa empresa) {
		return empresa;
	}
	

	

}
