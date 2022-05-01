import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i <num; i++) {
			int person = sc.nextInt();
			int grade[] = new int[person];
			int sum = 0,b;
			for(int j = 0; j < person; j++) {
				b = sc.nextInt();
				grade[j] = b;
				sum+=b;
			}
			double cnt = 0;
			for(int j = 0; j < person; j++) {
				if((grade[j]>(sum/person))) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/person)*100);
		}

	}

}
