package c12_data_hora.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Parcelamento {

  public static void main(String[] args) {
    System.out.println("Parcelamento"); 
    System.out.println();
    
    Scanner leitura = new Scanner(System.in);

    LocalDate dataAtual = LocalDate.now();

    System.out.print("Digite o valor da compra: ");
    float valorCompra = leitura.nextFloat();
    
    System.out.println("Deseja parcelar em quantas vezes (2-5)?");
    int numeroParcelas = leitura.nextInt();
    
    float valorParcelado = valorCompra / numeroParcelas;
    
    for (int i=0; i < numeroParcelas; i++) {
      dataAtual = dataAtual.plusDays(30);
      
      System.out.printf("Parcela %d: %.2f\n ", (i+1), valorParcelado);
      System.out.println("Pagamento em: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    leitura.close();
  }

}
