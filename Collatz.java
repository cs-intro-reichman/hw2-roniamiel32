public class Collatz {
    public static void main(String args[]) {
        int seedN = Integer.parseInt(args[0]);
        String mode = args[1];
        
        for (int seed = 1; seed <= seedN; seed++) {
            String sequence = "";  
            int current = seed;
            int count = 1;
            
            sequence += current; 
            
            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = (current * 3) + 1;
                }
                sequence += " " + current;  
                count++;
            }
            
            
            if (mode.equals("v")) {
                System.out.println(sequence + " (" + count + ")");
            } else if (mode.equals("c")) {
                System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
            }
        }
    }
}
