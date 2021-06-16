package c12_data_hora.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraJDK8 {

  public static void main(String[] args) {

    // Exibindo a data atual
    //--------------------------------------------------------------------------------
    LocalDateTime data1 = LocalDateTime.now();
    System.out.println(data1);
    
    
    // Formatando a data atual
    //--------------------------------------------------------------------------------
    LocalDateTime data2 = LocalDateTime.now();
    System.out.println(data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    
    
    // Formatando a data atual com as horas
    //--------------------------------------------------------------------------------
    LocalDateTime data3 = LocalDateTime.now();
    System.out.println(data3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
    
    
    // Criando uma data específica
    //--------------------------------------------------------------------------------
    String dataEspecificaStr = "01/01/1995";
    LocalDate dataEspecifica = LocalDate.parse(dataEspecificaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println(dataEspecifica);
    
    
    // Manipulando uma data
    //--------------------------------------------------------------------------------
    LocalDate data4  = LocalDate.now();
    
    data4 = data4.plusDays(3);
    System.out.println(data4);
    
    data4 = data4.plusMonths(2);
    System.out.println(data4);
    
    
    // Extraindo dados de uma data
    //--------------------------------------------------------------------------------
    LocalDate data5 = LocalDate.now();
    int diaDaSemana = data5.getDayOfWeek().getValue();
    int diaDoMes = data5.getDayOfMonth();
    int mes = data5.getMonthValue();
    int ano = data5.getYear();
 
    System.out.printf("Dia da semana: %d, dia: %d, mês: %d, ano: %d", diaDaSemana, diaDoMes, mes, ano);

  }

}
