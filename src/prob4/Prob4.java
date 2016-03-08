package prob4;
import java.util.Scanner;

public class Prob4 {

    public static void main(String[] args) {
        System.out.println("5개의 숫자를 입력하세요");
        Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        /* 키보드에서 배열 크기만큼 입력 받아 배열에 정장하는 코드 */
        for (int i = 0; i < 5; i++) {
            int a = in.nextInt();
            intArray[i] = a;
            sum += a;
        }
        System.out.println("평균은 " + Double.toString(sum/5) + "입니다.");

    }

}
