import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int num = sc.nextInt();
		int total = 0;
		for(int i = 0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			total += a*b;
		}
		if(sum==total) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
	}
}
