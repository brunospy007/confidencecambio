package br.com.confidencecambio.javabasico.model;

import java.util.Optional;

import org.junit.Test;

import br.com.confidencecambio.javabasico.enumeration.TipoPessoaEnum;
import br.com.confidencecambio.javabasico.exception.ConfidenceCambioException;
import br.com.confidencecambio.javabasico.factory.PessoaFactory;

public class PessoaTest {

	@Test
	public void getPessoaTest() {
		try {
			final String nome = "Bruno de Oliveira Ribeiro dos Santos";
			Optional<Object> pessoa = PessoaFactory.getInstance(nome, TipoPessoaEnum.CLIENTE);
			
			if (pessoa.isPresent()) {
				Cliente cliente = (Cliente) pessoa.get();
				
				String primeiroNome = cliente.getPrimeiroNome();
				String ultimoNome = cliente.getUltimoNome();
				String nomeMaiusculo = cliente.getNomeEmMaiusculo();
				String nomeAbreviado = cliente.getNomeAbreviado();
				
				System.out.println(primeiroNome);
				System.out.println(ultimoNome);
				System.out.println(nomeMaiusculo);
				System.out.println(nomeAbreviado);
			}
			
		} catch (ConfidenceCambioException e) {
			e.printStackTrace();
		}
	}
	
}
