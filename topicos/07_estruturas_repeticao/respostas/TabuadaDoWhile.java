import java.util.Scanner;

public class TabuadaDoWhile {

  public static void main(String[] args) {
    System.out.println("Tabuada de um número");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro entre 1 e 10: ");
    int numero = leitura.nextInt();
    
    int i = 1;
    do {
      System.out.printf("%d x %d = %d\n", numero, i, numero*i);
      i++;
    } while (i <= 10);
    
    leitura.close();
  }

}
