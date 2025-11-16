/*
Feedback:
Great work!
Yam
*/




// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int n = Integer.parseInt(args[0]);
	   String mode = args[1];
	   int i=1;
	   while (i<=n){
		int j=i;
		int counter = 0;
		if (i==1){
			counter++;
			if (mode.equals("v"))
				System.out.print(j + " ");
			if (j%2 == 0)
			j = j/2;
		else 
		j=j*3+1;
		}
		while (j != 1) {
			counter++;
			if (mode.equals("v"))
				System.out.print(j + " ");
			if (j%2 == 0)
			j = j/2;
		else 
		j=j*3+1;
	}
	counter++;
	i++;
		if (mode.equals("v")){
			System.out.print(j+ " (" + counter + ")");
			System.out.println();
		}
	   }
	System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}

