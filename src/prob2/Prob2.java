package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		System.out.print("금액: ");
        Scanner sc = new Scanner(System.in);
        int gold = sc.nextInt();
        divider(gold);

	}
    public static void divider(int gold){
        int[] list = {50000, 10000, 5000, 1000, 500, 100, 50, 10 , 1};
        int quotient;
        for (int i:list) {
            quotient = gold / i;
            gold -= i*quotient;
            System.out.println(Integer.toString(i)+"원 권: "+Integer.toString(quotient)+"매");
        }
    }

}

