import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListaEmails {

  public static void main(String[] args) {
    
    Path pathCustomers = Paths.get("/home/erosvitor/clientes.txt");
    Path pathListaEmails = Paths.get("/home/erosvitor/lista-emails.txt");
    
    try (
      BufferedReader readerCustomers = Files.newBufferedReader(pathCustomers);
      BufferedWriter writerListaEmails = Files.newBufferedWriter(pathListaEmails)
    )
    {
      String line;
      String data[];
      String email;
      while ( (line = readerCustomers.readLine()) != null) {
        data = line.split(",");
        email = data[2];
        // Remove possíveis espaços em branco
        email = email.strip();
        //  Remove aspas simples
        email = email.replace("'", "");
        writerListaEmails.write(email + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

