package c02_variaveis_tiposdados.exemplos;

public class VariaveisTiposDados {

  public static void main(String[] args) {

    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 3000000000l;
    float f = 3.14159265f;
    double d = 5000000.50;
    char c = 'j';
    boolean bl = true;

    // A partir do Java 1.7 é possível usar o literal '_' para separar os dígitos em variáveis numéricas.
    short s2 = 32_767;
    int i2 = 2_147_483_647;
    long l2 = 3_000_000_000l;
    float f2 = 3.1415_9265f;
    double d2 = 5_000_000.50;
    
  }

}
