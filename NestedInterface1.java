class i {
	
	interface j
	{
		void print();
	}
	
}
class NestedInterface1 implements i.j
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		i.j a1=new NestedInterface1();
		a1.print();
	}
}