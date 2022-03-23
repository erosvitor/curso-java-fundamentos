import java.util.Scanner;

public class ParOuImpar {

  public static void main(String[] args) {
    System.out.println("Verificar se um número é par ou ímpar");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro maior que zero: ");
    int numero = leitura.nextInt();
    
    if (numero % 2 == 0) {
      System.out.println("O número é PAR");
    } else {
      System.out.println("O número é ÍMPAR");
    }
    
    leitura.close();
  }

}
