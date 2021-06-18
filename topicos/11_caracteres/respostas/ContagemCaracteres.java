package c11_caracteres.exercicios;

import java.util.Scanner;

public class ContagemCaracteres {

  public static void main(String[] args) {
    System.out.println("Contagem de Caracteres");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite um texto qualquer: ");
    String texto = leitura.nextLine();
    
    int totalCaracteres = 0;
    char caractere;
    for (int i=0; i < texto.length(); i++) {
      caractere = texto.charAt(i);
      if (!Character.isWhitespace(caractere)) {
        totalCaracteres++;
      }
    }
    
    System.out.printf("O texto informado possui %d caracteres, excluindo os espaços em branco.", totalCaracteres);
    
    leitura.close();
  }

}
