 /*===================================
	 ■■■ 클래스와 인스턴스 ■■■
	 - 클래스와 인스턴스 활용
======================================*/

/*
	학생별로 국어점수, 영어점수, 수학점수를 입력받아
	총점, 평균을 계산하는 프로그램 구현
	단, 클래스의 개념을 활용
	또한 이 과정에서 배열 사용

	프로그램을 구성하는 클래스
	1. Record -속성만 존재하는 클래스

	2. Sungjuk 
		-인원 수를 입력받아, 입력받은 인원 수 만큼
		 총첨, 평균을 산출하는 클래스 설계
		 *속성 : 인원수,  record 형태의 배열
		 *기능 : 인원 수 입력, 상세 데이터 입력, 총점 평균 연산, 결과 출력

	3. Test097 
		-main() 메소드가 존재하는 외부 클래스로 설계

실행예)
인원 수 입력(1~100) : 102
인원 수 입력(1~100) : 3

1번째 학생의 이름 입력 : 
국어 점수 :
영어 점수 :
수학 점수 :

2번째 학생의 이름 입력 : 
국어 점수 :
영어 점수 :
수학 점수 :

3번째 학생의 이름 입력 : 
국어 점수 :
영어 점수 :
수학 점수 :

서승균	90	80	70	240 xx.xx 2
채지윤	82	72  62	xxx xx.xx 3	
이찬호						  1

계속하려면 아무 키나 누르세요...


	*/

//import java.util.Scanner;

public class Test097
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();
		ob.set();
		ob.input();
		ob.print();

	}
}