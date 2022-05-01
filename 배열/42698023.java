import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		int num = sc.nextInt();
		String str;
		for(int i = 0; i < num; i++) {
			str = sc.next();
				for(int j = 0; j < str.length(); j++) {
					if(str.charAt(j) == 'O') {
						cnt++;
					
					sum+=cnt;
					}else {
				cnt = 0;
			}
					
		}
				System.out.println(sum);
				sum = 0;
				cnt = 0;
	}
	}

}
