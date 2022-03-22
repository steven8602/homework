// 16. 입력 받은 정수를 비트 반전한 결과를 출력하시오.

package homework;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    int a;

	    Scanner sc = new Scanner(System.in);

	    a=sc.nextInt();

	    sc.close();

	   
	    System.out.format("%d\n", ~a);

	   }

	} 

