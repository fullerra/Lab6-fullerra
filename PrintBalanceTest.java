import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;


public class PrintBalanceTest {

	@Test
	public void testJUnit() {
		assertTrue("blah", true);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishGreetings() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("Hello World", pb.greetings);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishEnterName() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("Please enter your name", pb.enter_name);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishMeet() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("I am pleased to meet you ", pb.meet);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishAsOf() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("As of : ", pb.as_of);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishOwe() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("You owe the school ", pb.owe);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishFarewell() {
		PrintBalance pb = new PrintBalance("en", "US");
		assertEquals("Good Bye", pb.farewell);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishTodayDateFormat() {
		PrintBalance pb = new PrintBalance("en", "US");
		setLocale("en", "US");
		String todayDate = DateFormat.getDateTimeInstance().format(new Date());
		assertEquals(todayDate, pb.todayDateString);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEnglishOweNumberFormat() {
		PrintBalance pb = new PrintBalance("en", "US");
		setLocale("en", "US");
		String owe = NumberFormat.getCurrencyInstance().format(9876543.21);
		assertEquals(owe, pb.oweNumberString);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchGreetings() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("Bonjour tout le monde", pb.greetings);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchEnterName() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("S'il vous plaît entrer votre nom", pb.enter_name);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchMeet() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("Je suis heureux de vous rencontrer ", pb.meet);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchAsOf() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("comme d' : ", pb.as_of);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchOwe() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("Vous devez l'école ", pb.owe);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchFarewell() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		assertEquals("au revoir", pb.farewell);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchTodayDateFormat() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		setLocale("fr", "FR");
		String todayDate = DateFormat.getDateTimeInstance().format(new Date());
		assertEquals(todayDate, pb.todayDateString);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFrenchOweNumberFormat() {
		PrintBalance pb = new PrintBalance("fr", "FR");
		setLocale("fr", "FR");
		String owe = NumberFormat.getCurrencyInstance().format(9876543.21);
		assertEquals(owe, pb.oweNumberString);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanGreetings() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("Hallo Welt", pb.greetings);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanEnterName() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("Bitte geben Sie Ihren Namen", pb.enter_name);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanMeet() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("Ich freue mich, Sie kennen zu lernen ", pb.meet);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanAsOf() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("ab : ", pb.as_of);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanOwe() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("Sie schulden die Schule ", pb.owe);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanFarewell() {
		PrintBalance pb = new PrintBalance("de", "DE");
		assertEquals("Auf Wiedersehen", pb.farewell);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanTodayDateFormat() {
		PrintBalance pb = new PrintBalance("de", "DE");
		setLocale("de", "DE");
		String todayDate = DateFormat.getDateTimeInstance().format(new Date());
		assertEquals(todayDate, pb.todayDateString);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGermanOweNumberFormat() {
		PrintBalance pb = new PrintBalance("de", "DE");
		setLocale("de", "DE");
		String owe = NumberFormat.getCurrencyInstance().format(9876543.21);
		assertEquals(owe, pb.oweNumberString);
	}
	
	public void setLocale(String language, String country) {
		Locale currentLocale = new Locale(language, country);
		Locale.setDefault(currentLocale);
	}

}
