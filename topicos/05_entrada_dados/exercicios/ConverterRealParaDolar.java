package c05_entradadados.exercicios;

import java.util.Scanner;

public class ConverterRealParaDolar {

  public static void main(String[] args) {
    System.out.println("Converter reais para dólares");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);

    float cotacaoDolar = 3.35f;
    
    System.out.print("Digite um valor em reais: ");
    int reais = leitura.nextInt();
    
    float dolares = reais * cotacaoDolar;
    System.out.printf("%d reais equivalem a %f dolares\n", reais, dolares);
    
    leitura.close();
  }

}
