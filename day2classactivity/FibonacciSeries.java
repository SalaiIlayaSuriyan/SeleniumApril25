package day2classactivity;

public class FibonacciSeries {
	    public static void main(String[] args) {
	        int a = 0, b = 1, c, count = 8; 
	        
	        System.out.println("Fibonacci Series:");
	        System.out.print(a + " " + b);
	        
	        for (int i = 2; i < count; ++i) {
	            c = a + b;
	            System.out.print(", " + c);
	            a = b;
	            b = c;
	        }
	    }
	}

