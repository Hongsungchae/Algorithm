import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] cWord = new char[5][15];
		int max = 0;	// 입력받는 문자열 중 가장 긴 문자열의 길이

		for(int i=0; i<5; i++) {
			String str = scan.next();
			max = Math.max(max, str.length());	// 가장 긴 문자열 체크
			for(int j=0; j<str.length(); j++)
				cWord[i][j] = str.charAt(j);
		}

		for(int i=0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(cWord[j][i] == '\0')	// char 배열의 초깃값 = '\0'
					continue;
				System.out.print(cWord[j][i]);
			}
		}
		scan.close();
	}
}