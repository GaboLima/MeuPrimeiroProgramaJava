package meuSegundoProgramajava;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Friend \nwhats your name?");

		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ola %s! \n", nome);
	}

}
