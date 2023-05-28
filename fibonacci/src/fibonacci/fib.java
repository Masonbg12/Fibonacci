// PLAYING WITH THE RECURSIVE FIBONACCI ALGORITHM

package fibonacci;

import java.util.*;

public class fib {
	
	// recursive method returns the last number of the fibonacci sequence
	public static long fibo(int n, int r1, int r2) {
		// if the index is 0 then first fibonacci number is returned
		if (n == 0)
			return r1;
		// if statement is hot for any other index in the sequence
		else if (n == 1)
			return r2;
		// move down the fibonacci sequence until n is reduced to 1
		else
			return fibo(n - 1, r2, r2 + r1);
	}
	
	// main driver method
	public static void main(String[] args) {
		// declaration section
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter Fibonacci number: ");
		n = s.nextInt();
		
		// outputting the result of fibo
		System.out.println("Fibonacci Result: " + fibo(n, 0, 1));
	}
}
