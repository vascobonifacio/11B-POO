package poo11B;

import java.util.Scanner;

public class piramide {
	   public static void main(String[] args) {
		int n;
		int i;
		int j;
		int k;

		System.out.print("N=");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //n=3
		
		for (j = 1; j <= n; j++) {
			for (k = 1; k <= n-j; k++) System.out.print (" ");
			for (i = 1; i <= j; i++) System.out.print (i);
			for (i = j-1; i > 0; i--) System.out.print (i);
			System.out.println ();
		}
	   }
}