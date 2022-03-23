import java.util.Scanner;

public class MenuLanchonete { 

  public static void main(String[] args) {
    System.out.println("Menu lanchonete");
    System.out.println();
    
    Scanner leitura = new Scanner(System.in);
    
    float totalPedido = 0.0f;
    
    int item = 0;
    do {
      System.out.println("1 – X-Salada (5,30)");
      System.out.println("2 – X-Bacon (6,00)");
      System.out.println("3 – X-Egg (6,70)");
      System.out.println("4 – Refrigerante (3,2)");
      System.out.println("5 – Finalizar pedido");
    
      System.out.print("Escolha um item do menu: ");
      item = leitura.nextInt();
    
      switch (item) {
        case 1:
          System.out.println("Você escolheu X-Salada");
          totalPedido += 5.30;
         break;
        case 2:
          System.out.println("Você escolheu X-Bacon");
          totalPedido += 6.00;
          break;
        case 3:
          System.out.println("Você escolheu X-Egg");
          totalPedido += 6.70;
          break;
        case 4:
          System.out.println("Você escolheu Refrigerante");
          totalPedido += 3.2;
          break;
        case 5:
          break;
        default:
          System.out.println("Item inexistente");
          break;
      }
    } while (item != 5);
    
    System.out.println("O total do seu pedido é: " + totalPedido);
    
    leitura.close();
  }

}
