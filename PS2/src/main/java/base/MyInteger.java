package base;

public class MyInteger {

	private static int iValue;
	
	MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue %2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if (iValue %2 != 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		for(int i=2; i<iValue;i++) {
			if(iValue%i==0)
				return false;
		}
		return true;
	}
	
	public boolean isEven(MyInteger num) {
		return num.isEven();
	}
	
	public boolean isOdd(MyInteger num) {
		return num.isOdd();
	}
	
	public boolean isPrime(MyInteger num) {
		return num.isPrime();
	}
	
	public boolean equals(int num) {
		return (iValue == num);
	}
	
	public boolean equals(MyInteger num) {
		return (iValue == num.iValue);
	}

	public static boolean isEven(int i) {
		if (iValue %2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int i) {
		if (iValue %2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int i) {
		for(int i1=2; i1<iValue;i1++) {
			if(iValue%i1==0)
				return false;
		}
		return true;
	}

	
}


	class MyIntegerEncapsulation {
		public static void main(String[] args) {
			MyInteger encap = new MyInteger(3);
			System.out.println("The number is " + encap.getiValue());
			System.out.println("Is the number even? " + encap.isEven());
			System.out.println("Is the number odd? " + encap.isOdd());
			System.out.println("Is the number prime? " + encap.isPrime());
			
			
			MyInteger encap2 = new MyInteger(32);
			System.out.println("The second number is " + encap2.getiValue());
			System.out.print("Is the second number even? " + encap2.isEven());
			System.out.println("Is the second number odd? " + encap2.isOdd());
			System.out.println("Is the second number prime?  " + encap2.isPrime());
			System.out.println("Is the second number equal to the first number? " + encap2.equals(encap));
		}
	}
