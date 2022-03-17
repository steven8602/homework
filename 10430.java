// source code
import java.util.Scanner;

//백준 10430번
public class Example02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B%C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);

	}

}
