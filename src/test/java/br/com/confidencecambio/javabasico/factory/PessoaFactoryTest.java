package br.com.confidencecambio.javabasico.factory;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import br.com.confidencecambio.javabasico.enumeration.TipoPessoaEnum;
import br.com.confidencecambio.javabasico.exception.ConfidenceCambioException;
import br.com.confidencecambio.javabasico.model.Cliente;

public class PessoaFactoryTest {

	@Test
	public void getPessoaTest() {
		try {
			final String nome = "Bruno Santos";
			Optional<Object> pessoa = PessoaFactory.getInstance(nome, TipoPessoaEnum.CLIENTE);
			
			if (pessoa.isPresent()) {
				Cliente cliente = (Cliente )pessoa.get();
				Assert.assertNotNull(cliente);
			}
			
		} catch (ConfidenceCambioException e) {
			e.printStackTrace();
		}
	}

}
