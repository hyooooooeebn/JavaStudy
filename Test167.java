/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

//Map -> Hashtable , HashMap

/*
 java.util.map 인터페이스는
 키를 값에 매핑하며,
 동일한 키를 등록할 수 없고, 유일해여 하며(고유)
 각 키는 한 개의 값만을 매핑해야 한다.
 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

○ HashMap<K, V>클래스
	
	- Hashtable 클래스와 마찬가지로 Map 인터페이스에서 상속받은
	  HashMap 클래스의 기능은 Hashtable 과 동일하지만
	  Synchronozation이 없기 때문에 동시성 문제가 없다면
	  (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	  HashMap을 사용하는 것이 성능을 향상시킬 수 있다.

	- 또한 HashMap은 Hashtable클래스와는 달리 null을 허용한다.
*/

import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		//HashMap 자료구조 인스턴스 생성
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();
		

		//HashMap 자료구조에 요소 추가
		map.put("드라마","빈센조");
		map.put("영화","그래비티");
		map.put("만화", "도라에몽");

		//더미 확인
		System.out.println(map);
		//--==>> {드라마=빈센조, 영화=그래비티, 만화=도라에몽}

		//null 입력 시도
		map.put(null,null);
		map.put("소설",null);
		map.put(null,"생각하는사람");
		//--위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//	마지막 null을 key로 매핑된 "생각하는 사람"이
		//	최초의 null을 key로 매핑하는 null을 덮어쓰는 상황이 발생하게 된다.
		//	즉, HashMap은 null을 하나의 고유한 key값으로 간주한다.
		
		// 더미 확인
		System.out.println(map);
		//--==>> {null=생각하는사람, 소설=null, 드라마=빈센조, 영화=그래비티, 만화=도라에몽}
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
		String[] temp;

		for (String str ;((str=br.readLine())!= null) ; )
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
				continue;
			}

			map.put(temp[0].trim(),temp[1].trim());
			System.out.println(map);
		}






	}
}