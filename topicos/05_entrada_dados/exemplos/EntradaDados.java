package c05_entradadados.exemplos;

import java.util.Scanner;

public class EntradaDados {

  public static void main(String[] args) {

    // Recebendo um texto
    // --------------------------------------------------------------------------------
    String nome;
    System.out.println("Qual é o seu nome?");

    Scanner lerNome = new Scanner(System.in);
    nome = lerNome.nextLine();
    lerNome.close();

    System.out.println("Olá " + nome);

    // Recebendo um número inteiro
    // --------------------------------------------------------------------------------
    int idade;
    System.out.println("Qual é a sua idade?");

    Scanner lerNumero = new Scanner(System.in);
    idade = lerNumero.nextInt();
    lerNumero.close();

    System.out.println("Você tem " + idade + " anos");

    // Recebendo um número decimal
    // --------------------------------------------------------------------------------
    float altura;
    System.out.println("Qual é a sua altura?");

    Scanner lerDecimal = new Scanner(System.in);
    altura = lerDecimal.nextFloat();
    lerDecimal.close();

    System.out.println("Sua altura é " + altura);
    
  }

}
