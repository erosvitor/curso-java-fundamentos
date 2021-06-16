package c11_caracteres.exercicios;

import java.util.Scanner;

public class TelefoneFormatado {

  public static void main(String[] args) {
    System.out.println("Número Telefone Formatado");
    System.out.println();
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Digite um número de telefone: ");
    String telefone = leitura.nextLine();
    
    StringBuilder telefoneSemFormatacao = new StringBuilder();
    for (int i=0; i < telefone.length(); i++) {
      if (Character.isDigit(telefone.charAt(i))) {
        telefoneSemFormatacao.append(telefone.charAt(i));
      }
    }
    
    StringBuilder telefoneComFormatacao = new StringBuilder();
    telefoneComFormatacao.append("(");
    telefoneComFormatacao.append(telefoneSemFormatacao.toString().substring(0,2));
    telefoneComFormatacao.append(")");
    
    telefoneComFormatacao.append(" ");
    
    telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(2, 7));
    telefoneComFormatacao.append("-");
    telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(7, 11));

    System.out.println(telefoneComFormatacao.toString());
    
    leitura.close();
  }

}
