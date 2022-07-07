import java.util.Scanner;

public class LoginValido {

  public static void main(String[] args) {
    System.out.println("Login");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    String login = null;
    boolean loginValido = true;
    do {
      System.out.print("Digite o login: ");
      login = leitura.nextLine();
      
      if (login.isBlank()) {
        System.out.println("Login inválido, tente novamente.\n");
        loginValido = false;
      } else {
        System.out.println("Login válido.\n");
        loginValido = true;
      }
    } while (!loginValido);
    
    leitura.close();
  }

}
