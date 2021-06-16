package c09_matrizes.exercicios;

public class ReajusteSalarial {

  public static void main(String[] args) {
    System.out.println("Reajuste Salarial");
    System.out.println("");
    
    double dadosFuncionarios[][] = {
        {1001,1,5400.00},
        {1002,1,5500.00},
        {1003,2,4250.00},
        {1004,2,4400.00},
        {1005,2,4180.00},
        {1006,3,2700.00}
      };
    
    for (int i=0; i < dadosFuncionarios.length; i++) {
      if (dadosFuncionarios[i][1] == 1) {
        dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.10;
      } else if (dadosFuncionarios[i][1] == 2) {
        dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.08;
      } else if (dadosFuncionarios[i][1] == 3) {
        dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.06;
      }
    }
    
    for (int i=0; i < dadosFuncionarios.length; i++) {
      System.out.printf("Código funcionário: %.0f, salário reajustado: %.2f\n", dadosFuncionarios[i][0], dadosFuncionarios[i][2]);
    }
  }

}
