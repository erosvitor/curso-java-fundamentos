import java.util.Scanner;

public class PessoaMaisVelha {

  public static void main(String[] args) {
    System.out.println("Pessoa mais velha");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    String pessoas[][] = new String[3][2];
    
    for (int i=0; i < 3; i++) {
      System.out.print("Digite o nome da pessoa " + (i+1));
      pessoas[i][0] = leitura.nextLine();
      System.out.print("Digite a idade da pessoa " + (i+1));
      pessoas[i][1] = leitura.nextLine();
    }
    
    int idadePessoaMaisVelha = 0;
    String nomePessoaMaisVelha = null;
    for (int i=0; i < 3; i++) {
      if (Integer.parseInt(pessoas[i][1]) > idadePessoaMaisVelha) {
        idadePessoaMaisVelha = Integer.parseInt(pessoas[i][1]);
        nomePessoaMaisVelha = pessoas[i][0];
      }
    }
    
    System.out.println("A pessoa mais velha é a " + nomePessoaMaisVelha);
    
    leitura.close();
  }

}
