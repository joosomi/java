package first_project;

public class Person {
	private String name;
	private int age;
	//메소드 오버 라이딩:
	//부모 클래스에서 정의한 메소드를 자식 클래스에서 다시 정의하는 것
	
	public void test() {
		System.out.println("test");
	}
	
	//메소드(함수) 오버 로딩
	public Person () {
		System.out.println("사람 클래스의 인스턴스 생성됨");
	}
	
	public Person(String name, int age) {
		System.out.println("사람 클래스의 인스턴스 생성됨2");
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sleep() {
		System.out.println("10시에 쿨쿨 잠을 잔다.");
	}
	
}
	//생성자
//	public Person(String name, int age) {
//		System.out.println("welcome");
//		this.name=name; 
//		this.age=age;
//	}


	//메소드
//	public void myname() {
//		System.out.println("my name is " + name);
//	}

	



