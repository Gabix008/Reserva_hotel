package br.edu.ifg;

import java.util.Random;

public class Pix {
	private double valor;
    private String chavePix = emitirCodigo(valor);

	public Pix() {
		super();
	}


	public static String emitirCodigo(double valor) {
		
		    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        int tamanhoChave = 20;
	     
	        StringBuilder chavePix = new StringBuilder();

	        Random random = new Random();

	        for (int i = 0; i < tamanhoChave; i++) {
	        	char caractere = caracteres.charAt(random.nextInt(caracteres.length()));
	            chavePix.append(caractere);
	        }
	        chavePix.append(String.valueOf(valor));

	        return chavePix.toString();
	     
	}
	
	public double getValor() {
		return valor;
    
	} 
	public void setValor(double valor) {
		this.valor = valor;
	}
}
