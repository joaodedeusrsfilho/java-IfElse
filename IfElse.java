package com.junior.curso_java_basico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a sua idade:");
		int idade = ler.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Nao e maior de idade");
		}

		System.out.println("Entre com o valor do produto");
		double valor = ler.nextDouble();

		if (valor <= 10) {
			System.out.println("esta barato pode comprar");

		} else if (valor > 10 && valor < 15) {
			System.out.println("voce pode pedir desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		} else {
			System.out.println("esta muito caro");
		}
	}

}
