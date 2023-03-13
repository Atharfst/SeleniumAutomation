package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		Test obj=new Test();
			obj.assertEqual("message ....");
			obj.assertEqual();
	}
	
	public void assertEqual() {
		System.out.println("Assert metthod");
	}
	
	
	public void assertEqual(String mess) {
		System.out.println("Assert method " + mess);
	}

}
