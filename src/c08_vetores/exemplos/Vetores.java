package c08_vetores.exemplos;

import java.util.Arrays;

public class Vetores {

  public static void main(String[] args) {

    // Declarando um vetor para números inteiros
    short numeros[] = new short[5];

    // Atribuindo dados ao vetor
    numeros[0] = 1;
    numeros[1] = 1;
    numeros[2] = 2;
    numeros[3] = 3;
    numeros[4] = 5;

    // Atribuindo dados ao vetor na declaração
    short pares[] = { 0, 2, 4, 6, 8 };

    // Mostrando os dados contidos no vetor
    for (short i = 0; i < 5; i++) {
      System.out.println(pares[i]);
    }

    // Utilizando o tamanho do vetor
    for (short i = 0; i < pares.length; i++) {
      System.out.println(pares[i]);
    }

    // Armazenando textos em vetores
    String frutas[] = new String[5];
    frutas[0] = "Uva";
    frutas[1] = "Maçã";
    frutas[2] = "Abacaxi";
    frutas[3] = "Manga";
    frutas[4] = "Banana";

    // Ordenando um vetor de textos
    Arrays.sort(frutas);
    for (short i = 0; i < frutas.length; i++) {
      System.out.println(frutas[i]);
    }

  }

}
