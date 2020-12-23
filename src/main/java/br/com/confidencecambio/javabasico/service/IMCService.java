package br.com.confidencecambio.javabasico.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class IMCService {
	
	public BigDecimal calcularIMC(BigDecimal altura, BigDecimal peso) {
		return peso.divide(altura.multiply(altura), 2, RoundingMode.HALF_EVEN);
	}

}
