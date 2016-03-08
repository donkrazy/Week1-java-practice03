package prob1;

public class MainApp {
	
	public static void main(String[] args) {
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		execute(data);
	}

	public static void execute(int[] data){
		int i = 0;
		int sum = 0;
		for (int item:data) {
			if(item%3==0){
				i++;
				sum += item;
			}

		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+Integer.toString(i));
		System.out.println("주어진 배열에서 3의 배수의 합=>"+Integer.toString(sum));
	}



}