import java.io.*;
import java.util.*;
class Sign{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}