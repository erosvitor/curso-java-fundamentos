public class TemperaturaMinMax {

  public static void main(String[] args) {
    System.out.println("Temperatura mínima e máxima");
    System.out.println("");
    
    float temperaturas[] = {27.8f, 26.9f, 24.7f, 26.9f, 25.8f, 27.6f, 23.0f, 21.2f, 29.1f, 25.4f};
    
    float tempMinima = 999.9f;
    float tempMaxima = 0.0f;
    
    for (int i=0; i < temperaturas.length; i++) {
      if (temperaturas[i] < tempMinima) {
        tempMinima = temperaturas[i];
      }
      if (temperaturas[i] > tempMaxima) {
        tempMaxima = temperaturas[i];
      }
    }
    
    System.out.println("Temperatura mínima: " + tempMinima);
    System.out.println("Temperatura máxima: " + tempMaxima);
  }

}
