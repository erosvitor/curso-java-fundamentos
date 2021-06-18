import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServidorArquivos {

  public static void main(String[] args) {

    String diretorioBase = "/home/erosvitor";
    String diretorioDocs = diretorioBase + "/docs";

    Path pathDiretorioDocs = Paths.get(diretorioDocs);
    try {
      Files.createDirectory(pathDiretorioDocs);
      
      Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/financeira"));
      Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/administrativa"));

      Files.createDirectories(Paths.get(diretorioDocs + "/publico/fotos"));
      Files.createDirectories(Paths.get(diretorioDocs + "/publico/manuais"));
      
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }
 
    Path path = Paths.get(diretorioDocs + "/gerencia/responsaveis.txt");
    try (BufferedWriter arquivoResponsaveis = Files.newBufferedWriter(path)) {
      arquivoResponsaveis.write("Fulano da Silva\n");
      arquivoResponsaveis.write("Beltrano Gomes\n");
      arquivoResponsaveis.write("Siclano Cunha\n");
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    path = Paths.get(diretorioDocs + "/publico/descricao.txt");
    try (BufferedWriter arquivoDescricao = Files.newBufferedWriter(path)) {
      arquivoDescricao.write("Diretório 'fotos'\n");
      arquivoDescricao.write("Destinado ao armazenamento de fotos de eventos, comemorações e feiras\n");
      arquivoDescricao.write("\n");
      arquivoDescricao.write("Diretório 'manuais'\n");
      arquivoDescricao.write("Destinado ao armazenamento de manuais dos produtos comercializados pela empresa.\n");
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

  }

}
