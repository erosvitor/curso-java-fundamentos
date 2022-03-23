import java.util.Scanner;

public class DiaDaSemanaPorExtenso {

  public static void main(String[] args) {
    System.out.println("Dia da semana por extenso");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite o dia da semana (1-7): ");
    int diaSemana = leitura.nextInt();
    
    switch (diaSemana) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia da semana inválido");
        break;
    }
    
    leitura.close();
  }

}
