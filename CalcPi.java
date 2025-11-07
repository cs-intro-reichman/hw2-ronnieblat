// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	     int n = Integer.parseInt(args[0]);
		int mechane=1;
		double sum = (double) 0;
		for (int i=1; i<=n; i++){
			if (i%2 == 1)
				sum = (double)(sum + (1.0/mechane));
			else
			sum = (double)(sum - (1.0/mechane));
			mechane = mechane+2;
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum*4);
	}
}
