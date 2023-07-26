package studyjava;

public class Number {
	public static String isXylemPhloem(int n){
		int temp = n; int count1 = 0; int count2 = 0;
		int sum1 = 0; int sum2 = 0;
		while(n>0) {
			n = n/10;
			count1++;
		}
		while(temp>0) {
			int last = temp%10;
			count2++;
			if(count2 == 1 || count2 == count1) {
				sum1 += last;
			}
			else {
				sum2 += last;
			}
			temp = temp/10;
		}
		if(sum1 == sum2) {
			return "It is Xylem No.";
		}
		else {
			return "It is Phloem No.";
		}
	}

	public static void main(String[] args) {
		
		System.out.println(isXylemPhloem(13338));

	}

}
