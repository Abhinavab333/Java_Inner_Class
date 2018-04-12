class ab
{
	static int data=20;
	static class bc
	{
		static void display()
		{
			System.out.println(data);
		}
	}
}
class NestedStaticClass
{
  public static void main(String args[])
  {
  	ab.bc.display();
  }
}