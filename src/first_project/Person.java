package first_project;

public class Person {
	
	public String name;
	public int age;
	
	//생성자
//	public Person(String name, int age) {
//		System.out.println("welcome");
//		this.name=name; 
//		this.age=age;
//	}
	
	//getter & setter
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
	
	//메소드
	public void myname() {
		System.out.println("my name is " + name);
	}

}
