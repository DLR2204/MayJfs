package exceptions;

class AgeNotValidException extends Exception {

	int age;

	public AgeNotValidException() {

	}

	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

}

public class Exception6 {

	public static void valid(int age) throws AgeNotValidException {

		if (age < 18) {
			throw new AgeNotValidException();
		} else
			System.out.println("you can go for voting....");
	}
	
	public static void main(String []args)  {
		
		try {
		valid(4);}
		catch(Exception e ) {
			System.out.println(e);
		}
	}

}