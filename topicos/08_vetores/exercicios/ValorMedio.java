package c08_vetores.exercicios;

import java.util.Scanner;

public class ValorMedio {

  public static void main(String[] args) {
    System.out.println("Valor Médio");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    int valores[] = new int[5];
    
    for (int i=0; i < valores.length; i++) {
      System.out.println("Digite o valor " + (i+1));
      valores[i] = leitura.nextInt();
    }

    int totalValores = 0;
    for (int i=0; i < valores.length; i++) {
      totalValores += valores[i];
    }
    
    float valorMedio = totalValores / valores.length;
    System.out.println("O valor médio é " + valorMedio);
    
    leitura.close();
  }

}
