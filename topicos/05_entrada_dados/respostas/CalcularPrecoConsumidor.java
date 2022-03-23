import java.util.Scanner;

public class CalcularPrecoConsumidor {

  public static void main(String[] args) {
    System.out.println("Calcular preço consumidor");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    float porcentagemDistribuidor = 28f/100;
    float impostos = 45f/100;
    
    System.out.print("Informe o custo de fábrica: ");
    float custoFabrica = leitura.nextFloat();
    
    float precoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor);
    precoConsumidor = precoConsumidor + (precoConsumidor * impostos);
    System.out.println("O preço consumidor é de " + precoConsumidor);
    
    leitura.close();
  }

}
