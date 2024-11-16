public class TimeCalc {
    public static void main(String[] args) {
        int time = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
       int totalMinutes = (time * 60) + minutes + minutesToAdd;
       int totalHour = totalMinutes / 60;
       int newHour = totalHour % 24;
       int newMinutes = totalMinutes - (totalHour * 60);
    //   System.out.println(totalMinutes);
       // System.out.println(totalHour);
     //   System.out.println(newHour);
      //  System.out.println(newMinutes);
      if (newHour == 0 && newMinutes < 10) {
        System.out.println("0" + newHour + ":0" + newMinutes);
      } else {
      if (newMinutes < 10) {
        System.out.println(newHour + ":0" + newMinutes);
    } else {
         if (newHour < 10) {
        System.out.println("0" + newHour + ":" + newMinutes);
    } else {
       System.out.println(newHour + ":" + newMinutes);
      
    }
       }
    } 
}
}