/*===============================================
	  ■■■ 정렬(sort) 알고리즘 ■■■
	  - 버블 정렬(Bubble Sort)
=================================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙에 맞게 순서대로 나열

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
    -> 보기 좋게,,, 검색하기 위함

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬,,,


   실행 예)
   Source Data : 52 42 12 62 60
   Sorted Data : 12 42 52 60 62
   계속하려면 아무 키나 누르세요,,,
*/

	

public class Test104
{
	public static void main(String[] args)
	{
		/*
		42 52 12 62 60			0	1
		== --
		42 52 12 62 60			1	2
		   == --
		42 12 52 62 60			2	3
								3	4				
	-------------------------------------1회전		//최댓값 고정
								0	1	
								1	2
								2	3
	-------------------------------------2회전
								0	1
								1	2
	-------------------------------------3회전
								0	1
	-------------------------------------4회전
*/

		int[] a ={52, 42, 12, 62, 60};

		int i,j;

		for (i =1; i<a.length; i++)			// 뒤에서 비교 대상을 하나씩 줄여주는 역할	1 2 3 4
		{
			for (j = 0 ; j< a.length-i ; j++)   // 0123
			{
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

				}
			} 
		} 

		for (int n :a)
		
			System.out.print(n + " ");
		System.out.println();




	}
}