// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	     int n = Integer.parseInt(args[0]);
		int mechane=1;
		double sum = (double) 0;
		for (int i=1; i<=n; i++){
			double fraction = 1.0/mechane;
			if (i%2 == 1)
				sum = sum+fraction;
			else
			sum = sum-fraction;
			mechane = mechane+2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum*4);
	}
}
