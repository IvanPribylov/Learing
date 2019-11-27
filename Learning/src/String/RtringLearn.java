package String;

class Vorobej {
    public static void main(String[] args) {
    	String captain = "Друзья, запомните этот день, когда вами чуть не был пойман Капитан Джек Воробей!";
    	//1
    	System.out.println("1");
    	int capt = captain.indexOf("Капитан");
    	System.out.println(captain.substring(capt));
  	   	    	    	String[] parts = captain.split(" ");
    	String lastWord = parts[parts.length - 1];
    	String lastWord1 = parts[parts.length - 2];
    	String lastWord2 = parts[parts.length - 3];
      	System.out.println(lastWord2 + " " + lastWord1 +" " + lastWord);

    	 //2
      	System.out.println("2");
    	
    	System.out.println(captain.replace("Друзья","Товарищи"));
    	//3
    	System.out.println("3");
    	System.out.println(captain.replaceAll(","," "));
    	//4
    	System.out.println("4");
    	boolean ask = captain.contains("Капитан");
    	    if(ask == false) {
    		 System.out.println("Слово \"Капитан\" не найдено");
    	}
         else {
        	
        	 StringBuffer vorobej = new StringBuffer(captain.replace("Капитан ",""));
        	 int jack = vorobej.indexOf("Джек");
    	     System.out.println(vorobej);
    	     captain.contains("Джек");
    	   //5
        	 System.out.println("5");
        	 String upperCaptain = "Капитан ".toUpperCase(); 
        	 System.out.println(vorobej.insert(jack,upperCaptain));
           //6
          System.out.println("6");
       	      System.out.println(vorobej.reverse());
    	
        }    	
    	
    }
}