package br.com.confidencecambio.javabasico.factory;

import java.util.Optional;

import br.com.confidencecambio.javabasico.enumeration.TipoPessoaEnum;
import br.com.confidencecambio.javabasico.exception.ConfidenceCambioException;
import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.model.Robo;

/**
 * Tem a função de fabricar instancias do cliente, do gerente e do robo aplicando as validações 
 * pertinentes. 
 * @author bruno
 */
public class PessoaFactory {
	
	
	public static Optional<Object> getInstance(String nome, TipoPessoaEnum tipoPessoa) throws ConfidenceCambioException {
		if (nome.isBlank()) 
			throw new ConfidenceCambioException("Nome nao pode ser nulo");
		
		if (Character.toString(nome.charAt(0)).equals(" ") 
				||Character.toString(nome.charAt(nome.length() - 1)).equals(" ") ) 
				throw new ConfidenceCambioException("Nome nao pode conter espacos extras no inicio e no fim");
		
		switch(tipoPessoa) {
			case GERENTE: return Optional.of(new Gerente(nome));
			case CLIENTE: return Optional.of(new Cliente(nome));
			case ROBO: return Optional.of(new Robo(nome));
		}	
			
		return Optional.empty();
	}
}
