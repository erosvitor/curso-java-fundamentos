import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SepararEnderecosIP {

  public static void main(String[] args) {
    
    Path pathEnderecosIP = Paths.get("/home/erosvitor/enderecosip.txt");
    Path pathEnderecosClassA = Paths.get("/home/erosvitor/enderecos-classe-a.txt");
    Path pathEnderecosClassB = Paths.get("/home/erosvitor/enderecos-classe-b.txt");
    Path pathEnderecosClassC = Paths.get("/home/erosvitor/enderecos-classe-c.txt");
    
    try (
        BufferedReader readerEnderecosIP = Files.newBufferedReader(pathEnderecosIP);
        BufferedWriter writerEnderecosClasseA = Files.newBufferedWriter(pathEnderecosClassA);
        BufferedWriter writerEnderecosClasseB = Files.newBufferedWriter(pathEnderecosClassB);
        BufferedWriter writerEnderecosClasseC = Files.newBufferedWriter(pathEnderecosClassC)
    ) {
      String endereco;
      int posicaoCorte;
      String primeiroOctetoStr;
      int primeiroOcteto;
      while ( (endereco = readerEnderecosIP.readLine()) != null) {
        posicaoCorte = endereco.indexOf('.');
        primeiroOctetoStr = endereco.substring(0, posicaoCorte);
        primeiroOcteto = Integer.parseInt(primeiroOctetoStr);
        
        if (primeiroOcteto <= 126) {
          writerEnderecosClasseA.write(endereco + "\n");
        } else if (primeiroOcteto <= 191) {
          writerEnderecosClasseB.write(endereco + "\n");
        } else {
          writerEnderecosClasseC.write(endereco + "\n");
        }   
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

