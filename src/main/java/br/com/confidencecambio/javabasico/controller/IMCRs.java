package br.com.confidencecambio.javabasico.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.IMCService;

@RestController
public class IMCRs {

	@Autowired
	private IMCService iMCService;

	@GetMapping("/calcula-imc")
	public ResponseEntity<BigDecimal> olaMundo(@RequestParam(required=true) BigDecimal altura, 
										   @RequestParam(required=true) BigDecimal peso) {
		return new ResponseEntity<BigDecimal>(iMCService.calcularIMC(altura, peso), HttpStatus.OK);
	}

}
