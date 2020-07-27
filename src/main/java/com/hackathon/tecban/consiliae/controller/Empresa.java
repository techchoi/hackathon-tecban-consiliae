package com.hackathon.tecban.consiliae.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.tecban.consiliae.dtos.Data;
import com.hackathon.tecban.consiliae.service.TransacoesServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/empresa")
public class Empresa {

	@Autowired
	private TransacoesServices transacoesServices;

	@PostMapping
	public Empresa listProfissional(@RequestBody Empresa empresa) throws URISyntaxException {
		return transacoesServices.cadastraEmpresaa(empresa);
	}
}
