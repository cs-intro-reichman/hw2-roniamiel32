
public class Cheers {
        public static void main(String[] args) {
          String Cheer = args[0]  ;
          int printCount = Integer.parseInt(args[1]);
          String specialLetters = "AaEeFfHhIiLlMmNnOoRrSsXx";
                for (int i = 0; i < Cheer.length(); i++) {
                 char currentLetter = Cheer.charAt(i);
                 currentLetter = Character.toUpperCase(currentLetter);
          String rule = specialLetters.indexOf(currentLetter) >= 0 ? "an" : "a";
          System.out.println("Give me " + rule + " " + currentLetter + ": " + currentLetter + "! ");                       
        }
          System.out.println("What does that spell?");
                 for (int i = 0; i < printCount; i++) {
          System.out.println(Cheer.toUpperCase()+ "!!!");
                }
        }   
    }
    




