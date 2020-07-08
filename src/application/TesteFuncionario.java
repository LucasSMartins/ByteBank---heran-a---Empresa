package application;

import entities.Gerente;

public class TesteFuncionario {
	public static void main(String[] args) {

		Gerente lucas = new Gerente();
		
		lucas.setNome("Lucas Santos");
		lucas.setCpf("222.222.222-55");
		lucas.setSalario(2600.00);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getBonificacao());
		
	}
}
