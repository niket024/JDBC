interface B
{
	void test();
}

class C implements B
{
	private C()
	{

	}

	@Override
	public void test()
	{
		System.out.println("test");

	}

	static B getObject()
	{
		return new C();
	}
}

public class A
{
	public static void main(String[] args)
	{
		B b1=C.getObject();
		b1.test();
	}
}
