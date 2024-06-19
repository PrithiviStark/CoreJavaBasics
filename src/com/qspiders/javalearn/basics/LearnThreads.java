package javalearn.basics;


class PrithiviThread extends Thread{
	@Override
	public void run() {
		for(int a=0;a<5;a++) {
			System.out.println("demo threads------->");
		}
	}
}



public class LearnThreads {

	public static void main(String[] args) {
		System.out.println("Program starts");
		
		PrithiviThread news = new PrithiviThread();
		news.start();
		for(int a=0;a<5;a++) {
			System.out.println("main threads------->");
		}
		System.out.println("Program ends");
	}

}
