/*=====================================
	■■■ 연산자(Operator) ■■■
	- 비트 단위 연산자 [~]
=======================================*/

public class Test021
{
	public static void main(String[] args)
	{
		int a = 10, b= -10;

		System.out.printf("~a : %d\n", ~a);
		System.out.printf("~b : %d\n", ~b);

	}
}
//최종 결과
/*
~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .
*/

/*
a= 10 -> 00001010

            ↓ ~a

         11110101 -> -11
        +00001011 ->  11
     ----------------------
	     00000000 ->   0
		 



b= -10 -> 00001010  -> 10
		  
		  11110101  -> 2의 보수 (1의 보수 +1)
		  11110110   
          -------- = -10 


	00001010
+   11110110 
--------------
    00000000 


~b= 비트열 반전 = 00001001 =9

		 						*/