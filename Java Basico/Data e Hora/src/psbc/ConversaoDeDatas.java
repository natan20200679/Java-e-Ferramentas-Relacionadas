package psbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoDeDatas {

    public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Data formatada: "+ sdf.format(data));

		//Converte Objetos
		System.out.println("Data convertida: "+ sdf.parse("02/08/1970"));

	}

}
