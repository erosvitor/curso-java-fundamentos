public class NumerosDivisiveisPorTres {

  public static void main(String[] args) {
    System.out.println("Números divisíveis por 3 entre 0 e 100");
    System.out.println("");
    
    for (int numero=0; numero <= 100; numero++) {
      if (numero % 3 == 0) {
        System.out.println(numero);
      }
    }

  }

}
