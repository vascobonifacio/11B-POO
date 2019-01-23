package com.cfc.samples;


import java.util.Scanner;
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double weight;
//		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
//

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + " tall and " + weight + " heavy." );
	
	}
}
