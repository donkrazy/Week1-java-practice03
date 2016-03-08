package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		int length = str.length();
        char[] list = new char[length];
        for (int i = 0; i < length; i++) {
            list[i] = str.charAt(length-1-i);
        }
        return list;
	}
	
	public static void printCharArray(char[] array){
        System.out.print(array);
        System.out.println("\n");
    }
}
