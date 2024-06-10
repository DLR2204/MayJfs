package exceptions;

import java.io.FileNotFoundException;

public class Throws {

	public static void add(int a,int b) throws ArithmeticException,FileNotFoundException {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		add(1,0);
	}
}
