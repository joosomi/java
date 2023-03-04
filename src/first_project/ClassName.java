package first_project;

import test.TestClass;//다른 패키지이기 때문에 import 해줘야 한다. 

public class ClassName extends TestClass {
	public int number;
	public static String name;
	
	public void test() {
		//n n2
		
		this.n = 3; //n : protected 접근 제어자
		// 다른 패키지여도 상속, 자식 클래스라면 n에 접근할 수 있다.
		this.n2 = 4; //n2: default 접근 제어자
		//default: 같은 패키지에서만 접근 가능, 자식 클래스에서 접근 불가.
	}
}
