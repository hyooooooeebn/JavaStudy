/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

/*
○ Vector(벡터)

	자바의 자료 구조 기능을 제공하는 클래스들 중 가장 기본적인 클래스로
	배열과 비슷하지만, 배열과 달리 다른 종류의 데이터 형을 가진
	데이터 요소를 가질 수 있으면, 데이터가 가득차면 자동으로 저장 영역을
	확장시키게 된다

	또한, 객체 레퍼런스를 저장하기 때문에
	JDK 1.5 이전에는 자바 기본형 데이터는 저장할 수 없었으나
	JDK 1.5 이후부터는 오토박싱.오토언박싱 기능이 지원되면서
	기본 데이터형도 저장이 가능해졌다.

	벡터 클래스의 기본 구조는
	시퀀스 데이터 구조(순차적이다,,,)에 기반하며
	시퀀스 데이터 접근을 순차적인 인텍스 값에 대한 위치로 접근하게 된다.
	따라서 자료구조의 양 끝단에서만 접근이 가능한 큐나
	한쪽 끝에서만 접근이 가능한 스택과 달리
	시퀀스 개념의 인덱스 값을 이용하여 자료구조의 임의의 지점에서
	저장 및 접근이 가능하다,

	벡터의 시퀀스 구조는
	List 인터페이스를 통해 제공받기 때문에
	List 인터페이스의 모든 메소드를 사용할 수 있다.

	- void add(int index, E element)
	- void insertElemnetAt(E obj, int index)
	 주어진위치에 객체 저장
	 주어진 위치의 객체부터 오른쪽으로 하나씩 이동

	- void addElement(E obj)
	- boolean add(E e)
	 객체를 백터 끝에 추가

	- void removeElementAt(int index)
	- E remove(int index)
	 주어진 위치의 객체를 제거한다
	 제거후 주언진 위치 다음의객체부터 하나씩 왼쪽으로 이동
	 제거 후 ,,,

	- void removeElement(Object obj)
	- E remove(int index)
	 주어진 위치의 객체 제거
	 제거 후 주어진 위치 다음의 객테부터 하나씩 왼쪽으로 이동
	 E remoew(int tndex)메소드는 저장되었던 객체 반환

	- boolean removeElement(Object obj)
	- boolean remove(Object obj)
	 대상 객체 제거
	 제거 후 주어진 위치 다음의 객체부터 하나씩 왼쪽으로 이동
	 객체가 정상적으로 제거되면 true 반환

	- void removeAllElent()
	- void clear()
	 벡터의 모든 요소 제거

	- void setElementAt(E obj, int index)
	- E set(int index, E element)
	 벡터의 inde 위치에 주어진 객체 저장
	 주어진 위피제 저장되어 있던 객체 소멸 -> 덮어쓰기



	- Eumeration<E> elements()
	 벡터의 모든 요소 반환

	- int indexOf(Object o)
	 주어진 객체가 저장된 위치 반환
	 존재하지 않을 경우 음수 반환

	- int indexOf(Object o, int index)
	 주어진객테가 저장된 위치를 index위치부터 찾아서 반환
	 index 위치는 스캔을 시작한 위치

	- boolean contains(Object o)
	 벡터가 주어진 객제를 포함하고 있는지의 여부 반환

	- void ensureCapacity(int minCapacity)
	 벡터의 용량을 주어진 크기보다 크도록 조절

	- E firstElment()
	 벡터의 첫번째 요소 반환

	- E lastElement()
	 벡터의 마지막 요소 반환

	- void setSize(int newSize)
	 벡터의 크기 조절
	 만약 주어진 크기가 현재 크기보다 작다면 나머지는 버린다
	 반대로 주어진 크기가 현재 크기보다 크다면
	 빈 공간은 null로 채우게 된다(객체를 참조하지 않음을 의미)

	- int capacity()
	 현재 벡터의 용량 반환

	- int size()
	 현재 벡터에 저장된 객체의 갯수 반환

	- int trimTosize()
	 백터의 용략을 저장된 객체의 갯수에 맞도록 최소화
*/

import java.util.Vector;
import java.util.Iterator;

public class Test154
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String[] args)
	{
		int i;
		String str;

		Vector<Object> v = new Vector<Object>();

		for (i=0; i<colors.length; i++)
			v.add(colors[i]);

		//데이터 요소 추가
		v.addElement("하양");


		// firstElement()
		str = (String)v.firstElement();
		System.out.println("첫번째요소 : "+str);
		//--==>> 첫번째요소 : 검정


		// get() 
		str = (String)v.get(1); //두번째요소 접근
		System.out.println("두번째요소 : "+ str);
		//--==>> 두번째요소 : 노랑

		str = (String)v.get(0);
		System.out.println("첫번째요소 : "+ str);
		//--==>> 첫번째요소 : 검정


		//elementAt()
		str = (String)v.elementAt(1);
		System.out.println("두번째요소 : "+ str);
		//--==>> 두번째요소 : 노랑


		//lastElement()
		str = (String)v.lastElement();
		System.out.println("마지막요소 : " + str);
		//--==>> 마지막요소 : 연두
		//--==>> 마지막요소 : 하양  --추가 후 변경됨
		// ※벡터 자료구조에서 요소 추가 시(-> add()/ addElement())
		//	 인덱스 마지막의 위치레 추가되는 것을 확인할 수 있다.


		// 전체 요소 출력 ★CHECK★
		//『Iterator』를 통해 전체 요소에 순차적 접근
		// 『hasNext()』 : 다음 데이터 요소가 있는지의여부를 확인하여 반환
		// 『next()』	 : 다음 데이터 요소를 직접적으로 반환
		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> 검정 노랑 초록 파랑 빨강 연두 하양













		
	}
}