 class a
{
	private int data=5;
	void display()
	{
		int b=30;
		class b
		{
			void print()
			{
               System.out.println(b);
			}
		}
		b b1=new b();
		b1.print();
	}
}
class javainnerclass
{
	public static void main(String[] args) {
		a a1=new a();
		a1.display();
	}
}