package javalearn.basics;

import java.util.*;

public class Arithmatic {

	public static void main(String[] args) {
		int a =8;
		int sum=0;
		
		String s="boopathy";
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		sum=numbers.stream().filter(x -> x%2 != 0).mapToInt(Integer ::intValue).sum();
		
		
		System.out.println(a%2 +" "+a/2);
		System.out.println(sum);
		System.out.println((s.toString().length()));
	}

}
