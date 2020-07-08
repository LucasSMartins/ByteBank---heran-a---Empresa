package application;

import entities.ControleBonificacao;
import entities.EditorVideo;
import entities.Funcionario;
import entities.Gerente;

public class TesteReferencias {
 public static void main(String[] args) {
	
	 Gerente ge = new Gerente();
	 ge.setNome("Max");
	 ge.setSalario(5000.0);
	 
	 Funcionario f1 = new EditorVideo();
	 f1.setSalario(2000.0);
	 
	 EditorVideo ev = new EditorVideo();
	 ev.setSalario(2500.0);
	 
	 ControleBonificacao controle = new ControleBonificacao();
	 controle.registra(ge);
	controle.registra(f1);
	 controle.registra(ev);
	 
	 System.out.println(controle.getSoma());
	 
	 
}
}
