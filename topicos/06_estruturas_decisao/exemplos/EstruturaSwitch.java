package c06_estruturasdecisao.exemplos;

public class EstruturaSwitch {

  public static void main(String[] args) {

    // Avaliando conteúdo de uma variável numérica
    // ----------------------------------------------------------------------------------------------------
    short itemCardapio = 2;
    switch (itemCardapio) {
      case 1:
        System.out.println("Escolheu o item 1");
        break;
      case 2:
        System.out.println("Escolheu o item 2");
        break;
      case 3:
        System.out.println("Escolheu o item 3");
        break;
      default:
        System.out.println("Item inexistente");
        break;
    }

    // Avaliando conteúdo de uma variável String
    String color = "blue";
    switch (color) {
      case "red":
        System.out.println("Vermelho");
        break;
      case "green":
        System.out.println("Verde");
        break;
      case "blue":
        System.out.println("Azul");
        break;
      default:
        System.out.println("Cor inválida");
        break;
    }

  }

}
