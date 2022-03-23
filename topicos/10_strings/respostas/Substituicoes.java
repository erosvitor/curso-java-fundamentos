public class Substituicoes {

  public static void main(String[] args) {
    String texto = "0001;Siclano Pereira Alves;10-05-2000;(41)998885453;siclano@gmail.com;";
    
    texto = texto.replace("(", "");
    texto = texto.replace(")", "");
    
    texto = texto.replaceAll("-", "/");
    
    texto = texto.toUpperCase();
    
    System.out.println(texto);
  }

}
