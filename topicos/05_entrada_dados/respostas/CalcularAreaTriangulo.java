import java.util.Scanner;

public class CalcularAreaTriangulo {

  public static void main(String[] args) {
    System.out.println("Calcular área de um triângulo");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite a base do triângulo: ");
    int base = leitura.nextInt();

    System.out.print("Digite a altura do triângulo: ");
    int altura = leitura.nextInt();

    float area = (base * altura) / 2;
    System.out.println("A área do triângulo é: " + area);
 
    leitura.close();
  }

}
