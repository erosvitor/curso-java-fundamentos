package c06_estruturasdecisao.exemplos;

public class EstruturaIF {

  public static void main(String[] args) {

    // Avaliando apenas o resultado positivo
    // ----------------------------------------------------------------------------------------------------
    short idade1 = 18;
    if (idade1 >= 18) {
      System.out.println("Maior de idade");
    }

    // Avaliando o resultado positivo e negativo
    // ----------------------------------------------------------------------------------------------------
    short idade2 = 17;
    if (idade2 >= 18) {
      System.out.println("Maior de idade");
    } else {
      System.out.println("Menor de idade");
    }

    // Avaliando mais de uma situação
    // ----------------------------------------------------------------------------------------------------
    short idade3 = 15;
    if (idade3 >= 18) {
      System.out.println("Maior de idade");
    } else if (idade3 >= 16) {
      System.out.println("Menor de idade e pode votar");
    } else {
      System.out.println("Menor de idade e não pode votar");
    }

  }

}
