/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/

// ○ 과제
/*사용자로부터 임의의 연도를 입력받아
입력받은 연도가 ,,, 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램 구현
단, 입력은 BufferedReader를 활용하고
처리과정은 if 조건문을 활용하여 수행할 수 있도록 한다.

//실행 예)
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르세요...

임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르세요...


임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르세요...
															*/


//※ 2월 28일까지 있는 해 -> 평년
//   2월 29일까지 있는 해 -> 윤년

//   윤년의 판별 조건
//	 연도가 4의 배수이면서 100의 배수가 아니거나 
//	 400의 배수이면 윤년  

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;				//연도 변수 선언
		String strResult;		//결과값 변수 선언	


		// ○ 연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year =Integer.parseInt(br.readLine());
     //-----                   -------------
	 // 정수 =                      문자열
	 //		   -----------------------------
	 // 정수 =             정수

		//윤년과 평년 조건문
		if(year%4==0 && year%100!=0 || year%400 == 0)
			strResult = "윤년";
		else strResult = "평년";


		// ○ 결과 출력
		System.out.printf("%d년 -> %s\n",year,strResult);

	}
}

//최종결과
/*
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르십시오 . . .


임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .
*/