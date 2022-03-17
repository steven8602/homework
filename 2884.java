//source code
//백준 2884번
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 분(minute) 을 45 기준으로 45보다 작으면 시(hour)을 -1 해주고 아닐경우 입력받은 분(minute)에 -45 를 해주면 된다.
		//또한 시(hour)가 0보다 작아질 경우 시(hour) 을 23으로 수정해준다.
		
		
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
		sc.close(); // Scanner 닫기
		
		if(M < 45) {
			H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(minute) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
	}
  }
}
