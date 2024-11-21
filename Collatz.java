// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		int j = 0;
		int sum = 2;
		int count = 1;
		for (int i = 0; i < seed; i++){
			j++;
			System.out.print(j + " "); 
			while (sum > 1) { 
				if (j % 2 == 0 ) {
				j = j / 2;
		 	    System.out.print(j + " "); 
				sum = j;	
				count ++;
		 }else if (seed % 2 != 0){
			j = (j * 3) + 1;
			System.out.print(j + " ");
			sum = j;	
				count ++;
		 }
			}
			System.out.print("count " + count); 
			System.out.println(" ");
			
			//break;
		 }
		}
	}



