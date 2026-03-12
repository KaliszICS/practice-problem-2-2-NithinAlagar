public class PracticeProblem {

	public static void main(String args[]) {
	

	}


public static boolean isEven(int num) { 
	boolean bool = num%2 == 0;
	return bool;
	}
public static boolean isOdd(int num1) {
	boolean bool = num1%2 != 0;
	return bool;
	}

public static boolean isPositive(int num) { 
	return 0 < num;

	
	}
public static boolean isNegative(int num) { 
	return 0 > num;
}

public static int combinedLength(String a, String b) { 
	return a.length() + b.length();
}	


}