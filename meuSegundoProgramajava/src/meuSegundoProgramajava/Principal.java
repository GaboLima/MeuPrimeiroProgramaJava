package meuSegundoProgramajava;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//saldações
		System.out.println("Hello Friend \nwhats your name?");

		//printando a variavel
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ola %s! \n", nome);
		System.out.printf("Seja bem vindo!!!");
	}

}
