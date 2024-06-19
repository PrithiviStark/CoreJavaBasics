package javalearn.basics;

class TenException extends Exception{

}

public class ExceptionLearning {
	
	static void checkTen(int val) throws TenException {
		if(val==10){
			throw new TenException();
		}
		else {
			System.out.println("i am not 10");
		}
	}

	public static void main(String[] args) {
		try {
			checkTen(12);
			checkTen(10);
		} catch (TenException e) {
			e.printStackTrace();
		}
	}

}
