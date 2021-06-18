package c07_estruturasrepeticao.exercicios;

public class NumerosImpares {

  public static void main(String[] args) {
    System.out.println("Números ímpares entre 0 e 100");
    System.out.println("");
    
    int numero = 0;
    while (numero <= 100) {
      if (numero % 2 != 0) {
        System.out.println(numero);
      }
      numero++;
    }
  }

}
