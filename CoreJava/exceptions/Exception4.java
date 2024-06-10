package exceptions;

class Exception4 {
	
	public static void main(String args[]) {
		
		try {
			int c = 12 / 0;
			
			try {
				System.out.println("11.Division");
				int b = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println("14."+e);
			}
			
			try {
				int a[] = new int[3];
				a[6] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("21.array index problem");
			} finally {
				System.out.println("23.always will execute finally block 	");
			}
			System.out.println("25.remaing try  statements");
		} catch(Exception e) {
			System.out.println("27.handeled");
		}
		System.out.println("29.normal execution..");
	}
}