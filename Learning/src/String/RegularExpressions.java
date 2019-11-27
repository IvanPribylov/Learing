package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	  public static void main(String[] args) {
		  ArrayList<String> spisok = new ArrayList<String>();
	        
		    spisok.add("1.png");
	        spisok.add("2.png");
	        spisok.add("3png");
	        spisok.add("4.png.jpg");
	        spisok.add("five.png");
	        spisok.add("six.jpg");
	        spisok.add("Seven_7.jpg");
	        spisok.add("$8.jpg");
	        spisok.add("nine.jpg");

		
      
        
        System.out.println("<1>");
        Pattern pattern1 = Pattern.compile(".*[1-3].*");
        ArrayList<String> spisok1 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern1.matcher(s).matches() ){
                spisok1.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok1.size());
        System.out.println("<2>");
        Pattern pattern2 = Pattern.compile("[fn].*");
        ArrayList<String> spisok2 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern2.matcher(s).matches() ){
                spisok2.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok2.size());
       
        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
        
        System.out.println("<3>");
        Pattern pattern3 = Pattern.compile("[\\d].*");
        ArrayList<String> spisok3 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern3.matcher(s).matches() ){
                spisok3.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok3.size());
       
        System.out.println("<4>");
        Pattern pattern4 = Pattern.compile(".*[$].*");
        ArrayList<String> spisok4 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern4.matcher(s).matches() ){
                spisok4.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok4.size());
        
        System.out.println("<5>");
        Pattern pattern5 = Pattern.compile("[A-Z].*");
        ArrayList<String> spisok5 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern5.matcher(s).matches() ){
                spisok5.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok5.size());
              
        System.out.println("<6>");
        Pattern pattern6 = Pattern.compile(".{6,8}");
        ArrayList<String> spisok6 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern6.matcher(s).matches() ){
                spisok6.add(s);
                System.out.println(s);
            }
        }
              System.out.println(spisok6.size());
        
        System.out.println("<7>");
        Pattern pattern7 = Pattern.compile(".*[.][p][n][g]");
        ArrayList<String> spisok7 = new ArrayList<>();
        for (String s : spisok) {
            if(pattern7.matcher(s).matches() ){
                spisok7.add(s);
                System.out.println(s);
            }
        }
        System.out.println(spisok7.size());
}
}