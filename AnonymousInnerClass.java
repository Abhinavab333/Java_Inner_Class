abstract class a
{
abstract void print();
}
interface i{
	void eat();
}
class AnonymousInnerClass
{
	public static void main(String args[])
	{
		a a1=new a()
		{
			void print()
			{
				System.out.println("abhinav");
			}
		};
		a1.print();
		i a2=new i()
		{
			public void eat()
			{
				System.out.println("Vishwakarma");
			}
		};
		a2.eat();

	}
}