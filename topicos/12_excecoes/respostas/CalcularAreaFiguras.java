import java.util.Scanner;

public class CalcularAreaFiguras {
  
  private static Scanner leitura = new Scanner(System.in);
  
  private static void calcularAreaQuadrado() {
    System.out.println("");
    try {
      System.out.println("Digite o lado do quadrado: ");
      int lado = leitura.nextInt();
      int area = lado * lado;
      System.out.println("A área do quadrado é " + area);
      System.out.println("");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("O lado informado está incorreto");
      System.out.println("");
    }
  }
  
  private static void calcularAreaTriangulo() {
    System.out.println("");
    try {
      System.out.println("Digite a base do triângulo: ");
      int base = leitura.nextInt();
      System.out.println("Digite a altura do triângulo: ");
      int altura = leitura.nextInt();
      int area = (base * altura) / 2;
      System.out.println("A área do triângulo é " + area);
      System.out.println("");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("A base ou a altura está incorreta");
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    while (true) {
      System.out.println("1 - Calcular área quadrado");
      System.out.println("2 - Calcular área triângulo");
      System.out.println("3 - Finalizar");

      System.out.println("Digite a opção: ");
      String opcao = leitura.nextLine();
      if (opcao.equals("1")) {
        calcularAreaQuadrado();
      } else if (opcao.equals("2")) {
        calcularAreaTriangulo();
      } else if (opcao.equals("3")) {
        break;
      } else {
        System.out.println("Opção inválida! Tente novamente");
        System.out.println("");
      }
    }
    leitura.close();
  }

}
