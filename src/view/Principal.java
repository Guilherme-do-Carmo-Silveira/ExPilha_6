package view;

import javax.swing.JOptionPane;

import controller.FatController;
import docarmo.pilhaint.pilha;

public class Principal {

	public static void main(String[] args) {
		
		pilha p = new pilha();
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor até 10"));
		
		while(valor > 10 || valor < 0) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Valor invalido, por favor digite um valora até 10"));
		}
		
		FatController fat = new FatController(valor);
		fat.run();

	}
}
