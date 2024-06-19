package javalearn.basics;

public class ArrayBiuld {

	public static void main(String[] args) {
		
		int[] shirtSizes= {38,40,42,44};
		int[] pantSizes= new int[4];
		pantSizes[0]=38;
		pantSizes[1]=40;
		pantSizes[2]=42;
		int myShirtSize=shirtSizes[1];

		System.out.println("Size :"+pantSizes.length);
		System.out.println("My Shirt Size :"+myShirtSize);
		System.out.println("My Empty Pant Size :"+pantSizes[3]);
		System.out.println("My Invalid Pant Size :"+pantSizes[pantSizes.length-1]);
		System.out.println("My Invalid Shirt Size :"+shirtSizes.length);
	}

}
