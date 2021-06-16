package c08_vetores.exercicios;

public class NumerosDivisiveisPorTres {

  public static void main(String[] args) {
    System.out.println("Números divisíveis por três");
    System.out.println("");
    
    int numeros[] = {8, 6, 27, 13, 36, 9};
    
    for (int i=0; i < numeros.length; i++) {
      if (numeros[i] % 3 == 0) {
        System.out.println(numeros[i]);
      }
    }
  }

}
