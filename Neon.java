package studyjava;

public class Neon {
	public static boolean isNeon(int n) {
		int sum = 0;
		int square = n * n;
		while(square>0) {
			int last = square%10;
			sum = sum + last;
			square = square/10;
		}
		if(n == sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isNeon(9));

	}

}
