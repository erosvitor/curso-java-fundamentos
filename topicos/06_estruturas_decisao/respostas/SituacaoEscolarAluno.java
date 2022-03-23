import java.util.Scanner;

public class SituacaoEscolarAluno {

  public static void main(String[] args) {
    System.out.println("Verificar a situção escolar de um aluno");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite a nota do primeiro bimestre: ");
    float nota1 = leitura.nextInt();

    System.out.print("Digite a nota do segundo bimestre: ");
    float nota2 = leitura.nextInt();

    System.out.print("Digite a nota do terceiro bimestre: ");
    float nota3 = leitura.nextInt();

    System.out.print("Digite a nota do quarto bimestre: ");
    float nota4 = leitura.nextInt();

    float media = (nota1+nota2+nota3+nota4) / 4;
    
    if (media >= 70.0) {
      System.out.println("O aluno esta aprovado");
    } else if (media < 40.0) {
      System.out.println("O aluno esta reprovado");
    } else {
      System.out.println("O aluno esta em recuperação");
    }
    
    leitura.close();
  }

}
