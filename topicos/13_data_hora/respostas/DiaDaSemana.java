import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {

  public static void main(String[] args) {
    System.out.println("Dia da semana que o usuário nasceu");
    System.out.println();
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite a sua data de nascimento: ");
    String dataNascimentStr = leitura.nextLine();
    
    LocalDate dataNascimento = LocalDate.parse(dataNascimentStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    int diaSemana = dataNascimento.getDayOfWeek().getValue();
    
    String nomeDiaSemana = null;
    switch (diaSemana) {
      case 1:
        nomeDiaSemana = "Segunda-feira"; break;
      case 2:
        nomeDiaSemana = "Terça-feira"; break;
      case 3:
        nomeDiaSemana = "Quarta-feira"; break;
      case 4:
        nomeDiaSemana = "Quinta-feira"; break;
      case 5:
        nomeDiaSemana = "Sexta-feira"; break;
      case 6:
        nomeDiaSemana = "Sábado"; break;
      case 7:
        nomeDiaSemana = "Domingo"; break;
    }
    
    if (diaSemana <= 5) {
      System.out.println("Você nasceu numa " + nomeDiaSemana);
    } else {
      System.out.println("Você nasceu num " + nomeDiaSemana);
    }
    
    leitura.close();
  }

}
