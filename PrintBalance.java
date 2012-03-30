import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{
	
	String language;
	String country;
	Locale currentLocale;
	static ResourceBundle messages;
	static String greetings;
	static String enter_name;
	static String meet;
	static String as_of;
	static String owe;
	static String farewell;
	static Date todayDate;
	static double oweNumber;
	static String todayDateString;
	static String oweNumberString;

	public PrintBalance(String language, String country) {
		this.language = language;
		this.country = country;
		
		currentLocale = new Locale(language, country);
		Locale.setDefault(currentLocale);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		greetings = messages.getString("greetings");
		enter_name = messages.getString("enter_name");
		meet = messages.getString("meet");
		as_of = messages.getString("as_of");
		owe = messages.getString("owe");
		farewell = messages.getString("farewell");
		
		todayDate = new Date();
		oweNumber = 9876543.21;
		
		todayDateString = DateFormat.getDateTimeInstance().format(todayDate);
		oweNumberString = NumberFormat.getCurrencyInstance().format(oweNumber);
	}
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		PrintBalance pb = new PrintBalance("fr", "FR");
		Scanner scanInput = new Scanner(System.in);
		
		//Greeting
		System.out.println(greetings);
		
		//Get User's Name
		System.out.println(enter_name);
		String name = scanInput.nextLine();
		System.out.println(meet + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(as_of + todayDateString);
		System.out.println(owe + oweNumberString);
		System.out.println(farewell);
	}
}



