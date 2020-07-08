package application;

import entities.Autenticavel;
import entities.Cliente;
import entities.Gerente;
import entities.SistemaInterno;

public class TestaGerente {
	public static void main(String[] args) {

		
		Autenticavel referencia = new Cliente();
		referencia.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(referencia);
		
		Gerente g1 = new Gerente();
		g1.setNome("Max");
		g1.setCpf("123.456.789-10");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
		

	}
}
