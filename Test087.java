/*============================
	 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
==============================*/

/*	배열의 배열을 활용하여
	다음과 같은 데이터를  요소로 취하는 배열을 구성하고
	그 결과를 출력하는 프로그램을 구현한다.

	실행 예 )
	
	A B	C D E
	F G H I J 
	K L M N O
	P Q R S T 
	U V W X Y
															*/

public class Test087
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char n='A';

		for (int i =0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
			}
		}


		for (int i=0;i<arr.length ;i++ )
		{
				for (int j=0;j<arr[i].length ;j++ )
				
				System.out.printf("%3c",arr[i][j]);
				
			System.out.println();
		}
	}
}
//최종결과
/*  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
계속하려면 아무 키나 누르십시오 . . .

*/
//2021-07-29 오후 9:13