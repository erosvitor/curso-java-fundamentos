package c10_strings.exercicios;

import java.util.Scanner;

public class PrimeiroNome {

  public static void main(String[] args) {
    System.out.println("Primeiro nome");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite seu nome completo: ");
    String nomeCompleto = leitura.nextLine();
    
    String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
    System.out.println("Seu primeiro nome é " + primeiroNome);
    
    leitura.close();
  }

}
