/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- 반복문(while) 실습
===============================================================*/

/*
○ 반복문의 개요

   주어진 조건이 『참』인 경우
   일정 영역의 문장들을 반복 수행하다가
   조건식이 거짓이 되는 순간이 오면,
   반복 수행을 중단하는 문장이다.

   이러한 반복문에는 『while』, 『do-while』, 『for』문 등이 있으며
   반복분의 제어를 위해 『break』,『countiune』문을
   사용하는 경우가 있다.


○ while 문
  
   조건식을 먼저 비교하여
   조건식의 처리 결과가 참인 경우 특정 영역을 반복 수행하는 문장으로
   반복 횟수가 정해져 있지 않은 경우나
   반복 횟수가 많은 경우 주로 사용한다.
   while문은 조건이 맞지 않은 결루
   반복은 커녕 단 한 번도 실행되지 않을 수 있다. 


○ while 문의 형식 및 구조
  
   while(조건)
   {
		실행문;
   }										
																		*/


public class Test039
{
	public static void main(String[] args)
	{
		/*
		int n=0;
		while (n<=10)
		{
			System.out.println("n = " + n);
			n++;
		}
		*/

		/*
		int n=0;
		while (n<=10)
		{
			n++;
			System.out.println("n = " + n);
		}
		*/
	

		/*
		int n=0;
		while (n++ <=10)
		{	
			System.out.println("n = " + n);
		}
		*/


		/*
		int n=0;
		while (n++ <=10)
		{	
			System.out.println("n = " + ++n);
		}
		*/

		/* 1부터 100까지의 합을 계산하여
		   결과를 출력하는 프로그램을 작성한다.
		   단, WHILE 반복문을 사용한다.

		   //실행 예)
		   	1부터 100까지의 합 : 5050		
		

		※ 문제인식 및 분석
			1. 출력 구문이 반복문의 영역 밖에 위치해야 한다.
			2. 1부터 1씩 증가할 변수와 누적합을 담을 변수
			   두 개의 변수가 필요하다.
																*/



		int n=1;
		int sum=0;					//'누적합'은 0으로 초기화하는 것이 일반적.
									//'누적곱'은 1로 초기화하는 것이 일반적.
		
		while(n <= 100)
		{
		  //int sum = 0;			//여기서 사용하면 sum을 출력못함 & 계속 초기화함
			sum += n;
			n++;
		}

		System.out.printf("1부터 100까지의 합 : %d\n",sum);




	}
}