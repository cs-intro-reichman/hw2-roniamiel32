public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];  
        int currentNumber = 2;
        int count = 1;
        int startingNumber = 0;
        for (int i = 0; i < seed; i++) {
            startingNumber = i + 1;  
            if (mode.equals("v")) {
                System.out.print(startingNumber + " ");
                while (currentNumber > 1) {
                    if (startingNumber % 2 == 0) {
                        startingNumber = startingNumber / 2;  
                        System.out.print(startingNumber + " ");
                        currentNumber = startingNumber;
                        count++;
                    } else {
                        startingNumber = (startingNumber * 3) + 1;  
                        System.out.print(startingNumber + " ");
                        currentNumber = startingNumber;
                        count++;
                    }
                }
                System.out.print("(" + count + ")");
                System.out.println();
            } else {    
                i = seed + 1;
            }
            count = 1;
            currentNumber = 2;
        }
        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}
