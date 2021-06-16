package c04_saidadados.exemplos;

public class SaidaDados {

  public static void main(String[] args) {

    // Mostrando um texto fixo
    System.out.println("Comandos Saida de Dados");

    // Mostrando o conteúdo de uma variável
    float PI = 3.14159265f;
    System.out.println(PI);

    // Mesclando texto fixo com conteúdo de variável
    System.out.println("O valor da constante PI é " + PI);

    // Mostrando dados sem pular linha
    System.out.print("Observe que");
    System.out.print(" tudo será ");
    System.out.print("mostrado na mesma linha");
    System.out.print("\n");

    // Formatando a saída dos dados
    String linguagem = "Java";
    short anoLancamento = 1995;
    System.out.printf("A linguagem %s foi lançada em %d", linguagem, anoLancamento);
    
  }

}
