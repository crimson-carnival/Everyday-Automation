import java.util.*;
public class BinaryToCharacters {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		boolean another = true;
		String binary;
		int decimal, count, length;
		char character;
		while(another) {
			decimal = 0;
			count = 0;
			System.out.print("Enter binary: ");
			binary = sc.next();
			length = binary.length();
			for(int i = length-1; i>=0; i--) {
				char c=binary.charAt(i);
				if(c=='1') decimal+=Math.pow(2,count);
				count++;
			}
			character = (char)decimal;
			System.out.println(decimal+" "+character);
			System.out.print("Continue? (y/n): ");
			another = (Character.toLowerCase(sc.next().charAt(0))) == 'y';
		}
	}
}
