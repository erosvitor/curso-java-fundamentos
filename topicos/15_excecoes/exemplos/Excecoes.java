/*
 * 
 * Exceções
 * 
 * Uma exceção é quando algo não esperado acontece durante a execução de um programa de computador. 
 * 
 */

package c13_excecoes.exemplos;

public class Excecoes {

  public static void main(String[] args) {
    
    // Divisão por ZERO
    //--------------------------------------------------------------------------------
    short n1 = 10;
    short n2 = 0;
    try {
      float result = n1 / n2;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.err.println("O denominador não pode ser ZERO.");
    }
    
    
    // Posição inválida no vetor
    //--------------------------------------------------------------------------------
    short numeros[] = {1, 1, 2, 3, 5, 8};
    try {
      for (short i=0; i<= numeros.length; i++) {
        System.out.println(numeros[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Posição inválida do vetor.");
    }
    
    
    // Capturando mais exceções
    //--------------------------------------------------------------------------------
    short numeros2[] = {1, 0};
    try {
      float result2 = numeros2[1] / numeros2[2];
      System.out.println(result2);
    } catch (ArithmeticException e) {
      System.err.println("O denominador não pode ser ZERO.");
    } catch (ArrayIndexOutOfBoundsException e2) {
      System.err.println("Posição inválida do vetor.");
    }
    
    
    // Agrupando exceções (A partir do Java 1.7)
    //--------------------------------------------------------------------------------
    short numeros3[] = {1, 0};
    try {
      float result3 = numeros3[1] / numeros3[2];
      System.out.println(result3);
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.err.println("Erro ao processar o cálculo.");
    }
    
  }

}
