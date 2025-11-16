//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String s = args [0];
            int times = Integer.parseInt(args[1]);
            String upper = s.toUpperCase();
            String sOut = "";
            String letters = "AEFHILMNORSX";
            int i=0;
            while (i<s.length()){
                char c = upper.charAt(i);
                sOut = sOut + c;
                i++;
                if (letters.indexOf(c) != -1)
                        System.out.println("Give me an " + c + ": " + c + "!");
                else
                System.out.println("Give me a  " + c + ": " + c + "!");
            }
            System.out.println("What does that spell?");
            while (times>0){
                System.out.println(sOut + "!!!");
                times = times-1;
            }
        }
}
