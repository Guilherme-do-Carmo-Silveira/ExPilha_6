package controller;

import docarmo.pilhaint.pilha;

public class FatController {
	
	int valor;
	
	public FatController(int valor) {
		this.valor = valor;
	}
	public void run() {
		fat();
	}

	private void fat() {
		
		pilha p = new pilha();
		int resultado = 1;
		int multiplica;
		int  valorfixo = valor;
		
		while(valor >= 1) {
			
			p.push(valor);
			valor --;
		}
		
		int tamanho = p.size();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				multiplica = p.pop();
				resultado = resultado * multiplica;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(valor == 0) {
			System.out.println("O fatorial de 0 eh: " + resultado);
		}else {
			System.out.println("O fatorial de " + valorfixo + "4 eh: " + ((long) resultado));
		}
	}
	
}
