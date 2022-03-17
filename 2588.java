// source code
//백준 2588번
import java.util.*; //Scanner Class 불러오기.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
        
		sc.close(); // Scanner 닫기
 
		System.out.println(a*(b%10)); //일의 자리 수 구하기
		System.out.println(a*(b%100/10)); //십의 자리 수 구하기
		System.out.println(a*(b/100)); //백의 자리 수 구하기
		System.out.println(a*b); 

	}

}
