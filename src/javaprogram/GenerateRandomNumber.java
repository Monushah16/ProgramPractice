package javaprogram;

import java.util.*;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		int counter;
		
		Random rNum = new Random();
		
		System.out.println("Random Number generated Below ");
		
		for( counter =1; counter<10; counter++) {
			System.out.println(rNum.nextInt(100));
		}
		
	}

}
