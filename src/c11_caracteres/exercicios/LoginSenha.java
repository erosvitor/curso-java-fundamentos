package c11_caracteres.exercicios;

import java.util.Scanner;

public class LoginSenha {

  public static void main(String[] args) {
    System.out.println("Login e Senha");
    System.out.println("");
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite o login: ");
    String login = leitura.nextLine();
   
    System.out.print("Digite a senha: ");
    String senha = leitura.nextLine();
    
    if (login.equals(senha)) {
      System.out.println("Login e Senha não podem ser iguais.");
    } else if (login.length() < 5 || login.length() > 15) {
      System.out.println("O login deve ter entre 5 e 15 caracteres");   
    } else if (senha.length() < 5 || senha.length() > 15) {
      System.out.println("A senha deve ter entre 5 e 15 caracteres");
    } else {
      boolean temDigitoNumerico = false;
      boolean temLetraMaiuscula = false;
      char caractere;
      for (int i=0; i < senha.length(); i++) {
        caractere = senha.charAt(i);
        if (Character.isDigit(caractere)) {
          temDigitoNumerico = true;
          continue;
        }
        if (Character.isUpperCase(caractere)) {
          temLetraMaiuscula = true;
        }
      }
      if (temDigitoNumerico && temLetraMaiuscula) {
        System.out.println("Login e Senha válidos");
      } else {
        System.out.println("A senha deve ter pelo menos um dígito e pelo menos uma letra maiúsucla.");
      }
    }
    
    leitura.close();
  }

}
