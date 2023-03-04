package first_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MarchFour {

//	public static void main(String[] args) {
//		ClassName test = new ClassName();
//		test.number = 2;
//		
//		ClassName test1 = new ClassName();
//		test1.number = 3;
//		
//		test.number = 4;
//		
//		ClassName test3 = new ClassName();
//		test3.number = 3;
//		
//		test.name = "홍길동";
//		test1.name="성춘향";
//		
//		//일반 객체는 무조건 객체를 탙고 들어가야만 했다. 
//		//static멤버는 그냥 클래스이름을 타고 들어갈 수 있다.
//		//왜냐면 클래스당 하나 생성되기 때문에
//		//ClassName.name = ""
//		
//		System.out.println(test.name);
//		System.out.println(test1.name);
//	}
	
	
	// 클래스 실습 upupgrade
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		ArrayList<Rectangle> rect = new ArrayList<>();//여러개의 Rectangle 개체들
//		
//		while(true) {
//			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
//			int width = scanner.nextInt();
//			
//			int height = scanner.nextInt();
//			
//			if(width ==0 && height ==0) {
//				break;
//				
//			}
//			
//			Rectangle rectangle1= new Rectangle(width);
//			rectangle1.setHeight(height);
//			rect.add(rectangle1);
//			
//		}
//		
//		for(Rectangle rectangle: rect) {
//			System.out.println("가로의 길이는: " +rectangle.getWidth());
//			System.out.println("세로의 길이는: " + rectangle.getHeight());
//			System.out.println("넓이는: " + rectangle.area());
//			System.out.println("--------------");
//		}
//		
//		Rectangle rectangle2 = new Rectangle(0);
//		System.out.println("Rectangle 인스턴스 개수는:"+( rectangle2.getCount() -1));
//		
//		
//	}
//}
	//클래스 상속 
	public static void main(String[] args) {
			Person p = new Person("홍길동",99);
			
			Student s = new Student();
		
			s.setName("성춘향");
			System.out.println(s.getName()); //성춘향
			p.sleep();
			s.sleep();
			
			Dog d = new Dog();
			Cat c = new Cat();
			d.makeSound();
			c.makeSound();
		}
}
	


