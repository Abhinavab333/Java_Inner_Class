class a
{
	 private int data=30;
	 class b
	 {
	 	void print()
	 	{
	 		System.out.println(data);
	 	}
	 }
	 
}
class test
{
	public static void main(String args[])
	{
		a a1=new a();
		a.b in=a1.new b();
		in.print();
	}
}