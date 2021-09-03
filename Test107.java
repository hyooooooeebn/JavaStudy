/*=============================
	���� Ŭ���� ���� ����
	  - ��� (Inheritance)
==============================*/

/*
�� ����̶�
   ���� �����ϰ��� �ϴ� Ŭ������
   �̹� ����Ǿ� �ִ� �ٸ� Ŭ������ ��ɰ� �ߺ��Ǵ� ���
   �̹� ����� Ŭ������ �Ϻκ��̳� ��ü ������ ������ �� �ֵ��� �ϴ� ����� �ǹ��Ѵ�.

   ��, ����� ��ü�� �� �� ���Ը��� ���ִ�
   �������� ���뼺�� Ȯ���ϰ�
   ��ü���� ���踦 ���������ν�
   ��ü ������ �� �ٸ� ū Ư¡�� ������������ ������ ��밡 �ȴ�.

   ����� ���� ���α׷��� Ŭ���� ������ ���������ν�
   �ߺ��� �ڵ���� ���ۼ��� �ʿ� ����
   �ݺ����̰� �������� �۾��� ó������ �ʱ� ������
   ���α׷����� �ۼ��ϴ� �ð��� ������ �� �ְ�
   ���������� �����ϰ� �� �� ������, 
   ���α׷����� ���̵� ª������ �ȴ�.

   ����, �̹� �ۼ��� ���α׷��ֵ��� �ռ� �׽�Ʈ�Ǿ��� ������
   ������ ���� �� �־� ���� �ۼ����� ���α׷����� ������ �� �ִ�.

�� ������ ��
   �ڹٴ� ��.��.��.��.�� �������� �ʱ⶧����
   �� �� �̻��� Ŭ�����κ��� ��ӹ��� �� ����.

���� Ŭ���� == �θ� Ŭ���� == ���� Ŭ���� == SuperŬ���� ->�����ִ� Ŭ���� 
���� Ŭ���� == �ڽ� Ŭ���� == �ڼ� Ŭ���� == Sub Ŭ���� -> �����޴� Ŭ���� (��� ����)

�� ��super��
	static���� ������� ���� �޼ҵ忡�� ���Ǹ�
	���� Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� ����Ų��.
	super�� ���� Ŭ������ �����ڸ� ȣ���ϰų�,
	���� Ŭ������ ��� ���� �Ǵ� �޼ҵ带 ȣ�� �� �� ����� �� �ִ�.

	���� Ŭ������ �����ڿ��� ���� Ŭ������ �����ڸ� ȣ���� ������
	���� Ŭ������ ������ ���� �������� �� ó������ ��ġ�� �� �ִ�.

*/

// �θ� Ŭ����
class SuperTest107
{
	protected double area;

	// �θ� Ŭ������ ������
	SuperTest107()
	{
		System.out.println("Super class...");		//�����ڴ� ��ӵ��� �ʴ´�...
	}

	void write(String title)
	{
		System.out.println(title + "-" + area);
	}

}

// �ڽ� Ŭ����
// �� �ڹٴ� ���� ��Ӹ� �����Ǹ�, ���� ����� ������� �ʴ´�.
public class Test107 extends SuperTest107
{
	/* <��ӵ� �κ�>
	protected double area;	//==super.area;

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
	*/

	//double area = 10.1234;

	
	// �ڽ� Ŭ���� ������
	Test107()
	{
		// �θ� Ŭ���� ������ ȣ��
		//SuperTest107();		// this() -> Test107() ==> this�� ������ �ȵǴ� ����!!!!!!
		//super();				//��CHECK��

		System.out.println("Sub class...");		//�ڽ� �����ڿ� �θ� �����ڰ� ����ִ�.
												//���� ���� super()�ۼ����ص� �ȴٴ� ��~!
												//��CHECK��

		//super();
		//--==>> �� ��ġ������ ���� �߻� ...
		// �������̱� ������ �� ���� ��ġ�ؾ��Ѵ�.	
	}

	public void circle()
	{
		int r =10;
		area = r*r* 3.141592;
		write("��");
	}

	public void rect()
	{
		int w=20, h=5;
		super.area = w*h;
		super.write("�簢��");
	} 
   

	public static void main(String[] args)
	{
		// Test107 Ŭ����(�ڽ�) ��� �ν��Ͻ� ����
		Test107 ob = new Test107();		//�ν��Ͻ� ���� �� ������ ȣ�� 

		ob.circle();
		//--==>> ��-314.1592

		ob.rect();
		//--==>> �簢��-100.0

	}
}