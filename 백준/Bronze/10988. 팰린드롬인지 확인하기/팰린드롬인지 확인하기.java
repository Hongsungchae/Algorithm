import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 1;
		for(int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			if(c != str.charAt(str.length()-i-1)) {
				cnt = 0;
				break;
			}
		}
		System.out.println(cnt);
	}
	
}
