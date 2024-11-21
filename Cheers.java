
public  class  Cheers {
    public static void main(String[]  args) {
      String cheer = args[0];
      int printCount = Integer.parseInt(args[1]);
      String specialLetters = "AEFHILMNORSX";
      for (int i = 0; i < cheer.length(); i++) {
      char currentLetter = cheer.charAt(i);
      char upperLetter = (currentLetter >= 'a' && currentLetter <= 'z') ? (char) (currentLetter - 32) : currentLetter;
      String rule = (specialLetters.indexOf(upperLetter) >= 0) ? "an " : "a  ";
      System.out.println("Give me " + rule + currentLetter + ": " + currentLetter + "!");
        }
      System.out.println("What does that spell?");
      for (int i = 0; i < printCount; i++) {
      for (int j = 0; j < cheer.length(); j++) {
      char currentLetter = cheer.charAt(j);
      char upperLetter = (currentLetter >= 'a' && currentLetter <= 'z') ? (char) (currentLetter - 32) : currentLetter;
      System.out.print(upperLetter);
      }
      System.out.println( "!!!");
                }
        }   
    }
    




