public class JurosCalculado {

  public static void main(String[] args) {
    float capital = 1000.00f;
    float taxa = 10f;
    int periodo = 1;
    
    System.out.printf("O juros calculado sobre o capital de R$ %.2f, durante %d mês, com uma taxa de %.0f%%, foi de R$ %.2f", capital, periodo, taxa, 100.00);
  }

}
