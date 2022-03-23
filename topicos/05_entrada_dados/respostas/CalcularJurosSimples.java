import java.util.Scanner;

public class CalcularJurosSimples {

  public static void main(String[] args) {
    System.out.println("Calcular Juros Simples");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite o capital: ");
    float capital = leitura.nextFloat();
    
    System.out.print("Digite a taxa de juros (mensal): ");
    float taxa = leitura.nextFloat();
    
    System.out.print("Digite o período (em meses): ");
    int periodo = leitura.nextInt();
    
    float juros = capital * (taxa/100) * periodo;
    System.out.println("O juros calculado foi de " + juros);
    
    leitura.close();
  }

}
