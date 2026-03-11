package src;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = scanner.nextLine();
		System.out.printf("Bem vindo,  %s\n", nome);
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Qual a sua profissão? ");
		String profissao = scanner.nextLine();
		
		System.out.println(" Bem vindo,"+nome+"!\n");
		System.out.println("Você é "+profissao+" e tem "+idade+" anos.");
		
		scanner.close();
	}
}