
class A{
	void m1(){
		System.out.println("m1 -A");
	}
	void m2() {
		System.out.println("m2-A");
		m1();
		this.m1();
	}
}
public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m2();
		
	}

}
