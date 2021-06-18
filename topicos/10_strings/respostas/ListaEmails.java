package c10_strings.exercicios;

public class ListaEmails {

  public static void main(String[] args) {
    System.out.println("Lista de emails para mala direta");
    System.out.println();
    
    String dados[] = {
        "Beltrano da Silva;beltrano@gmail.com", 
        "Siclano Goncalves;siclano@yahoo.com.br", 
        "Fulano Pereira Alves;fulanoalves@gmail.com", 
        "Alvarenga Pedroso;pedroso@hotmail.com"
    };
    
    String emails[] = new String[dados.length];
    
    int posicaoDoCorte;
    for (int i=0; i < dados.length; i++) {
      posicaoDoCorte = dados[i].indexOf(";") + 1;
      emails[i] = dados[i].substring(posicaoDoCorte);
    }
    
    for (int i=0; i < emails.length; i++) {
      System.out.println(emails[i]);
    }
  }

}
