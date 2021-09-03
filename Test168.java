/*====================================
   ■■ 자바의 기본 입출력(I/O) ■■
=======================================*/
/*
 ○ 자바의 기본 입출력 개요
  
	- 자바에서의 모든 데이터 입출력은 『스트림(Stream)』이라는 개념에 의해
	이루어지는데 『스트림』이라는 단어의 사전적 의미는
	"흐르는 물"의 개념이며, 이는 연속된 일련의 데이터를 일컫는다.

	- 데이터 입출력 시 모든 데이터를 현대외 관계없이 일련의 흐름으로 
	전송을 하는 것이 스트림 입출력 모델의 기본 개념이다.

	- 기본적으로 스트림에는 바이드 기반 스트림과 문자 기반 스트림이 있다.

 ○ 바이트 스트림 입출력
	
	InputStream 클래스와 OutputStream 클래스, 그리고 이들의 하위 클래스를
	통해서 제공되는 바이트 스크림을 위한 표준 입출력으로
	8바이트 크기를 갖는 바이트들의 스트림이 입출력된다.

○ 문자 스트림 입출력

	Reader 클래스와 Writer클래스, 그리고 이들의 하위 츨래스에 의해
	구현되었으며 8비트 크기를 갖는 바이트들의 스트림이 아닌
	16비트 크기를 갖는 유니코드 문자들의 스트림이라는 점에서 차이가 난다.


 ※ 스트림의 특징
	
	- 스트림은 FIFO구조이다. 먼저 들어간 것이 먼저 나오는 형태로
	스트림의 데이터는 순차저으로 츨러가며 순차적 접근 밖에는 허용되지 않는다.

	- 스트림은 단방향이다.
	자바에서 스트림은 읽기 쓰기가 동시에 이루어지지 않는다.
	따라서 읽기 쓰기가 필요하다면 읽는 스트림과 쓰는 스트림을
	하나씩 열어서 사용해야 한다.

	- 스트림은 지연될 수 있다.
	스트림에 넣어진 데이터는처리되기 전에는 스트림에 사용하는 스레드는
	지연 상태에 빠진다.
	네트워크 상에서는 데이터가 모두 전송되기 전까지 스레드는 지연(blocking) 상태가 된다.
*/

import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		System.out.println("문자열 입력(종료:Ctrl+z)");

		//read() : InputStream 클래스의 대표적 메소드 -> 바이트 스트림
		while ( (data = System.in.read()) !=-1)	//입력값이 null이 아니라면,,,
		{
			ch =(char)data;
			//System.out.print(ch);  ==> 출력이 바이트 스트림이 아니다... 따라서 한글 오류
			//--==>> 
			/*
			abcd
			abcd
			1234
			1234
			가나다라			//  한글은 2바이트씩 잡아서 출력해서 문제가 난다
			°¡³ª´?¶?
			*/
		

		// write() : OutputStream 클래스의 대표적 메소드 -> 바이트 스트림
		System.out.write(ch);
		//--==>>
		/*
		1234
		1234
		abcd
		abcd
		가나다라
		가나다라
		*/
			
		}
	}
}