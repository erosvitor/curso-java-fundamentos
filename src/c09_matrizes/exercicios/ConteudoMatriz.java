package c09_matrizes.exercicios;

import java.util.Scanner;

public class ConteudoMatriz {

  public static void main(String[] args) {
    System.out.println("Mostra conteúdo de uma matriz");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    int matriz[][] = new int[2][2];
    
    for (int i=0; i < matriz.length; i++) {
      for (int j=0; j < matriz[i].length; j++) {
        System.out.printf("Digite o elemento para a posição %d,%d da matriz: ", i, j);
        matriz[i][j] = leitura.nextInt();
      }
    }

    for (int i=0; i < matriz.length; i++) {
      for (int j=0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println("");
    }

    leitura.close();
  }

}
