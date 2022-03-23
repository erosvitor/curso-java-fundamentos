public class RelatorioEstatistico {

  public static void main(String[] args) {
    System.out.println("Relatório Estatístico");
    System.out.println("");
    
    double dados[][] = { {1450.40, 1},
                         {2630.00, 2},
                         {970.00, 2},
                         {1790.30, 1},
                         {2150.10, 3},
                         {1080.00, 2},
                         {1920.60, 2},
                         {2530.80, 3}};
    
    double totalSalarios = 0.0;
    double totalNumeroFilhos = 0.0;
    double maiorSalario = 0.0;
    
    for (int i=0; i < dados.length; i++) {
      totalSalarios += dados[i][0];
      totalNumeroFilhos += dados[i][1];
      if (dados[i][0] > maiorSalario) {
        maiorSalario = dados[i][0];
      }
    }
    
    double salarioMedio = totalSalarios / dados.length;
    System.out.println("O salário médio é de: " + salarioMedio);
    
    double mediaQtdeFilhos = totalNumeroFilhos / dados.length;
    System.out.println("A quantidade média de filhos é: " + mediaQtdeFilhos);

    System.out.println("O maior salário é: " + maiorSalario);
  }

}
