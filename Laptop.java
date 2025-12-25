package PackageInterface;

public interface Laptop {
	public void copy();
	public void keyboard();
	public void cut();
	
	default void security() {
		capture();
		System.out.println("Laptop security code");
	}
	
	static void paste()
	{
		capture();
		System.out.println("Laptop paste code");
	}
	 
	private static void capture()
	{
		System.out.println("Laptop capture code");
	}
}
