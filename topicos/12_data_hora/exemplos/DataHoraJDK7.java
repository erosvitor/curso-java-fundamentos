package c12_data_hora.exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataHoraJDK7 {

  public static void main(String[] args) {

    // Exibindo a data atual
    //--------------------------------------------------------------------------------
    Date data1 = new Date();
    System.out.println(data1);
    
    
    // Formatando a data atual
    //--------------------------------------------------------------------------------
    SimpleDateFormat formatoBrasil = new SimpleDateFormat("dd/MM/yyyy");
    Date data2 = new Date();
    System.out.println(formatoBrasil.format(data2));

    
    // Formatando a data atual com as horas
    //--------------------------------------------------------------------------------
    SimpleDateFormat formatoBrasil2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    Date data3 = new Date();
    System.out.println(formatoBrasil2.format(data3));

    
    // Criando uma data específica
    //--------------------------------------------------------------------------------
    String dataEspecificaStr = "01/01/1995";
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date dataEspecifica = sdf.parse(dataEspecificaStr);
      System.out.println(dataEspecifica);
    } catch (ParseException e) {
    }

    
    // Manipulando uma data
    //--------------------------------------------------------------------------------
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getTime());
    
    calendar.add(Calendar.DAY_OF_MONTH, 3);
    System.out.println(calendar.getTime());
    
    calendar.add(Calendar.MONTH, 2);
    System.out.println(calendar.getTime());
    

    // Extraindo dados de uma data
    //--------------------------------------------------------------------------------
    Calendar calendar2 = Calendar.getInstance();
    int diaDaSemana = calendar2.get(Calendar.DAY_OF_WEEK);
    int diaDoMes = calendar2.get(Calendar.DAY_OF_MONTH) + 1;
    int mes = calendar2.get(Calendar.MONTH);
    int ano = calendar2.get(Calendar.YEAR);
 
    System.out.printf("Dia da semana: %d, dia: %d, mês: %d, ano: %d", diaDaSemana, diaDoMes, mes, ano);
    
  }

}
