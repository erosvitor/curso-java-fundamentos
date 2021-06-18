package c06_estruturasdecisao.exercicios;

import java.util.Scanner;

public class MenuLanchonete {

  public static void main(String[] args) {
    System.out.println("Menu lanchonete");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.println("1 – X-Salada");
    System.out.println("2 – X-Bacon");
    System.out.println("3 – X-Egg");
    System.out.println("4 – Refrigerante");
    System.out.println("5 – Finalizar pedido");
    
    System.out.print("Escolha um item do menu: ");
    int item = leitura.nextInt();
    
    switch (item) {
      case 1:
        System.out.println("Você escolheu X-Salada");
        break;
      case 2:
        System.out.println("Você escolheu X-Bacon");
        break;
      case 3:
        System.out.println("Você escolheu X-Egg");
        break;
      case 4:
        System.out.println("Você escolheu Refrigerante");
        break;
      case 5:
        System.out.println("Você escolheu finalizar pedido");
        break;
      default:
        System.out.println("Item inexistente");
        break;
    }
    
    leitura.close();
  }

}
