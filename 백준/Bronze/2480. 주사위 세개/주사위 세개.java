import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dice_1 = sc.nextInt();
		int dice_2 = sc.nextInt();
		int dice_3 = sc.nextInt();
		int max = Math.max(dice_1, dice_2);
		int max_1 = Math.max(max, dice_3);
		if(dice_1==dice_2&&dice_1==dice_3) {
			System.out.print(10000+dice_1*1000);
			
		}else if(dice_1==dice_2) {
			System.out.print(1000+dice_1*100);
		}
		else if(dice_1==dice_3) {
			System.out.print(1000+dice_1*100);
		}
		else if(dice_2==dice_3){
			System.out.print(1000+dice_2*100);
			
		}else {
			System.out.print(max_1*100);
		}
	}

}
