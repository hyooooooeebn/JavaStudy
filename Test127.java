/*===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
===========================================*/

public class Test127
{
	public static void main(String[] args)
	{
		/*
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;		//--오토 박싱

		int ni = 300;
		Integer wrapNi = new Integer(ni);
		int ni2 = wrapNi;		//--오토 언박싱

		float fi = 300.3f;
		Float wrapFi = new Float(fi);	

		System.out.println(wrapBi.toString());
		System.out.println(wrapNi.toString());
		System.out.println(wrapFi.toString());
		//--==>> true
		//		 300
		//		 300.3
		
		System.out.println(wrapBi);
		System.out.println(wrapNi);
		System.out.println(wrapFi);
		*/



		//Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12


		ni = Integer.parseInt("0101",2);	//2진법
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :   5

		ni = Integer.parseInt("12",8);		//8진법
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  10

		ni = Integer.parseInt("A",16);		//16진법
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  10


		sn = Integer.toBinaryString(20);	//2진법 반환 메소드
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 10100

		sn = Integer.toHexString(31);		//16진법 반환 메소드
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 1f

		sn = Integer.toOctalString(31);		//8진수 반환 메소드
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 37


		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> 345



		

	}
}