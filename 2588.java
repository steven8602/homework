// source code
import java.util.*; //Scanner Class 불러오기.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
		
		int a = sc.nextInt(); // 첫번 째 수 입력 받기
		int b = sc.nextInt(); //두번 째 수 입력 받기
        
		sc.close(); // Scanner 닫기
 
		System.out.println(a*(b%10)); //***중 첫째 짜리 수 구하기
		System.out.println(a*(b%100/10)); //***중 둘 짜리 수 구하기
		System.out.println(a*(b/100)); //***중 셋째 짜리 수 구하기
		System.out.println(a*b);  

	}

}
