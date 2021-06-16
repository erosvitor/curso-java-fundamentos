package c10_strings.exemplos;

public class Strings {

  public static void main(String[] args) {
    
    // Declarando uma string
    String str1;

    // Preenchendo uma string
    str1 = "Linguagem Java";

    // Obtendo o tamanho da string
    int tamanho = str1.length();
    System.out.println(tamanho);

    // Obtendo uma substring
    String substring;
    substring = str1.substring(0, 5);
    System.out.println(substring);

    // Substituindo uma substring por outra substring
    str1 = str1.replace("Java", "JAVA");
    System.out.println(str1);

    // Substituindo todas substring por outra substring
    String str2 = "red;green;blue";
    str2 = str2.replaceAll(";", ",");
    System.out.println(str2);

    // Removendo substring
    // NÃO É POSSÍVEL NATIVAMENTE. Utiliza-se o 'replace'

    // Comparando strings
    String str3 = "Java";
    String str4 = "Javascript";
    if (str3.equals(str4)) {
      System.out.println("São iguais");
    } else {
      System.out.println("Não são iguais");
    }  

    // Verificando se a string é vazia
    String str5 = "";
    if (str5.isEmpty()) {  // 'isEmpty' foi adicionada na versão 1.6
      System.out.println("É vazia");
    } else {
      System.out.println("Não é vazia");
    }
    
    // Verificando se uma string esta em branco
    String str6 = " ";
    if (str6.isBlank()) {  // 'isBlank' foi adicionada na versão 11
      System.out.println("Esta em branco");
    } else {
      System.out.println("Não está em branco");
    }
    
  }

}
