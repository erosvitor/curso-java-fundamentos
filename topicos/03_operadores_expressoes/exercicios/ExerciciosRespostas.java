package c03_operadores_expressoes.exercicios;

public class ExerciciosRespostas {

  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    int c = (a - b) * (++a);
    System.out.println(c);
    
    int i = 15;
    int j = 3;
    int k = i++ * j + (i / 3);
    System.out.println(k);
    
    int x = 5;
    int y = 3;
    x++;
    --y;
    int z = (x + y) * (++x + y); 
    System.out.println(z);
    
    int m = 10;
    int n = 2;
    n += 2;
    int p = (m + n) + (--m * n++);
    System.out.println(p);
  }

}
