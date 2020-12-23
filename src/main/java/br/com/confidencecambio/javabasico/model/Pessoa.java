package br.com.confidencecambio.javabasico.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe abstrata da qual são derivadas cliente, gerente e robo. Está classe tem a implementação 
 * default dos métodos que manipulam o atributo nome.
 * @author bruno
 *
 */
public abstract class Pessoa {
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	private String nome;
	
	public String getPrimeiroNome() {
		return nome.split(" ")[0];
	}
	
	public String getUltimoNome() {
		String[] nomes = nome.split(" ");
		return nomes[nomes.length - 1];
	}

	public String getNomeEmMaiusculo() {
		return this.nome.toUpperCase();
	}
	
	public String getNomeAbreviado() {
		List<String> values = Arrays.asList(nome.split(" "));
		String primeiroNome = values.get(0);
		String ultimoNome = values.get(values.size() - 1);

		values = values.stream().skip(1)
				.map(v -> " " + v.charAt(0) + ". ").collect(Collectors.toList());
		values.remove(values.size() - 1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(primeiroNome);
		values.forEach(sb::append);
		sb.append(ultimoNome);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
