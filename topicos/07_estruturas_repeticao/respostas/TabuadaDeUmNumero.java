import java.util.Scanner;

public class TabuadaDeUmNumero {

  public static void main(String[] args) {
    System.out.println("Tabuada de um número");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro entre 1 e 10: ");
    int numero = leitura.nextInt();
    
    for (int i=1; i<=10; i++) {
      System.out.printf("%d x %d = %d\n", numero, i, numero*i);
    }
    
    leitura.close();
  }

}
