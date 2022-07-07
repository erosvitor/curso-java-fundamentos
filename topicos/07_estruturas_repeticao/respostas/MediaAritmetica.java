import java.util.Scanner;

public class MediaAritmetica {

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Média Aritmética");
    System.out.println("");
        
    int qtde = 1;
    float nota = 0.0f;
    float somaDasNotas = 0.0f;
    while (qtde <= 4) {
      System.out.print("Digite a nota " + qtde + ": ");
      nota = leitura.nextFloat();
      somaDasNotas += nota;
      qtde++;
    }
    
    float media = somaDasNotas / 4;    
    System.out.print("A média aritmética é: " + media);
    
    leitura.close();
  }

}
