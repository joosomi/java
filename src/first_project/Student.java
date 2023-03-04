package first_project;

public class Student extends Person {
	private String studentID;
	
	public Student() {
		//Person 생성자 실행되고 있음.
		//super();
		//매개변수가 있는 것을 실행시키고 싶을 때
		//super("홍길동", 99);
		//아무것도 쓰지 않으면 기본 생성자 실행
		
	//	this.name= "성춘향"; //name이 protected로 설정되어 있다면 접근 가능
	//	this.age=99; //age가 private로 설정되어 있다면 접근이 불가능
		System.out.println("Student 생성자 실행됨");
	}

	//메소드 오버 라이딩
	public void test() {
		System.out.println("student test");
	}

	public void sleep() {
		System.out.println("11시에 쿨쿨 잠을 잔다.");
		setName(""); //초기화
	}
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
}
