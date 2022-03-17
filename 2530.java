// source code
import java.util.Scanner;

//백준 2530번 
//뇌가 이해하길 포기했어요.
public class Example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 	
		
		int D = sc.nextInt(); 
		
		sc.close(); // Scanner 닫기

		//1분은 60초이기에 D분에 60을 나눠서 나온 몫과 나머지를 각 분, 초에 합산
		B += D / 60;
		C += D % 60;
	
		System.out.println(A +" "+ B +" "+ C);
		
	}

}
