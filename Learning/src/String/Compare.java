package String;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.regex.Pattern;

public class Compare {
	 public static void main(String[] args) {
	ArrayList<String> some = new ArrayList<>();
	some.add("someone@epam.com");
	some.add("Jan 2019");
	some.add("numbertwo@mail.ru");
	some.add("12/05/1990");
	some.add("John Doe@ya.com");
	some.add("firstlast@third");
	some.add("somename@gmail.abracodabra");
	some.add("blahblah@blahblahblah.blahblah");
	some.add("someone@epam.COM");
	some.add("someone@epam2.COM");
	some.add("numbertwo@MAIL.ru");
	some.add("numberwhynottwo@mail.ru");
	
	 System.out.println("<1>");
     Pattern pattern1 = Pattern.compile("\\S{4,20}[@][A-Za-z]{2,6}[.][A-Za-z]{2,4}");
     ArrayList<String> some1 = new ArrayList<>();
     for (String s : some) {
         if(pattern1.matcher(s).matches() ){
             some1.add(s);
             System.out.println(s);
         }
         
     }
     System.out.println("<new array>");
     System.out.println(some1);
     String poz0 = some1.get(0);
     String poz2 = some1.get(2);
     
     
     System.out.println("<2>");
     System.out.println("Comparing 1 equals " + poz0 + " and " + poz2 
             + " : " + poz0.equals(poz2));
     
     System.out.println("Comparing 2 equalsIgnoreCase " + poz0 + " and " + poz2 
             + " : " + poz0.equalsIgnoreCase(poz2)); 
     
     System.out.println("Comparing 3 Objects.equals " + poz0 + " and " + poz2 
             + " : " + Objects.equals( poz0,  poz2)); 
     
     System.out.println("Comparing 4 == " + poz0 + " and " + poz2 
             + " : ");
     System.out.println( poz0 == poz2);
     
     System.out.println("Comparing 5 compareTo " + poz0 + " and " + poz2 
             + " : " + poz0.compareTo(poz2)); 
     
     System.out.println("<3>");
    
    
     
//     ArrayList<String> musicalInstruments = new ArrayList<>();
//     MusicalInstrument(String,String);
//     musicalInstruments.add(new MusicalInstrument("Trumpet","brass"));
// 		musicalInstruments.add(new MusicalInstrument("Tuba","brass"));
// 		musicalInstruments.add(new MusicalInstrument("Timpani","percussion"));
// 		musicalInstruments.add(new MusicalInstrument("Piano","keyboard"));
// 	}
// 
// 		System.out.println("Musical instruments in the collection sorted by name:");
// 		Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getName()));
// 		musicalInstruments.stream().forEach(System.out::println);
// 		
// 		System.out.println("Musical instruments in the collection sorted by type:");
// 		Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getType()));
// 		musicalInstruments.stream().forEach(instrument->System.out.println(instrument));
// 	
    
     System.out.println("<4>");
    
     for (int i = 0; i<some1.size(); i++)
     {
    	 for (int j = 0; j<some1.size(); j++) {
     System.out.println((some1.get(j)).compareTo(some1.get(i)));
    	}
     }
	 }
}

