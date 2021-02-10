/**
 * Este primeiro programa mostra ao aluno:
 * 1) Que um programa Java é construído dendo de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com un método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroPrograma.Java;
import java.util.Scanner;

/**
 * @author Gabriel Munhoz
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Saldação e Nome
		System.out.println("Olá amigo!\nQual é o seu nome?"); // Uso do println

		// Ler uma string do console usando a biblioteca Scanner.
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		// Exibir uma string usando printf.
		System.out.printf("Olá %s!\n", nome);
		entrada.close();
	}

}
