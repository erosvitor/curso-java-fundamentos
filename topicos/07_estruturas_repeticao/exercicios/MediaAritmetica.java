package c07_estruturasrepeticao.exercicios;

import java.util.Scanner;

public class MediaAritmetica {

  public static void main(String[] args) {
    System.out.println("Média Aritmética");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    int qtde = 1;
    float nota = 0.0f;
    float somaDasNotas = 0.0f;
    while (qtde <= 4) {
      System.out.print("Digite a nota " + qtde + ": ");
      nota = leitura.nextFloat();
      somaDasNotas += nota;
      qtde++;
    }
    
    float media = somaDasNotas / 4;    
    System.out.print("A média aritmética é: " + media);
    
    leitura.close();
  }

}
