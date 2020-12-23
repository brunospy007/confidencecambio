package br.com.confidencecambio.javabasico.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner; 

@RunWith(SpringRunner.class)
@SpringBootTest
public class IMCServiceTest {
	
	@Autowired
	private IMCService iMCService;

	@Test
	public void calcularIMCTest() {
		final BigDecimal altura = new BigDecimal(1.8);
		final BigDecimal peso = new BigDecimal(58);
		
		BigDecimal imc = iMCService.calcularIMC(altura, peso);
		Assert.assertNotNull(imc);
	}
	
}
