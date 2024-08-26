package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
	
	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		Livros teste  = new Livros();
		
		System.out.println(gato);
//		int a = 2;
//		int b = 3;
//		System.out.println("Hello Word" + (a+b));
	}

}

class Livros{
	private String nome;
	private String npag;
}
