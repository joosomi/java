package first_project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import test.Hello;

public class MarchSecond {

	public static void main(String[] args) {
	
	//배열 실습 
//		Scanner scanner = new Scanner(System.in);
//		//배열 생성
//		int[] arr = new int [5];
//		int sum = 0; //총합
//		
//		System.out.println("5개의 정수를 입력하세요.");
//		
//		for (int i=0; i<5; i++) {
//			arr[i] = scanner.nextInt();
//			sum += arr[i];
//		}
//		
//		double result = (double) sum / arr.length;
//		
//		System.out.println("평균은 "+ (double)sum/arr.length);
		// System.out.println(result)
		
		
	//ArrayList 실습
//		ArrayList<String> array = new ArrayList<>();
//		
//		while(true) {
//			System.out.println("문자를 입력해주세요.");
//			String str = scanner.nextLine();
//			if (str.equals("exit")) break;
//			array.add(str);
//		}
//		for(String str: array) {
//			System.out.println(str);
//		}
		
		
		
	//	예외 처리
//		int num1 = 5;
//		int num2 = 0;
//		
//		try {
//			System.out.println(num1/num2);
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} finally {
//			System.out.println("끝");
//		}
	
//		Scanner scanner = new Scanner(System.in);
//		
//		try {
//			int num = scanner.nextInt();
//			System.out.println(num);
//		} catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요.");
//		}
//		
//		scanner.close();
		
		//예외 처리 실습
//		
//		int[] arr = {1,2,3,4};
//		
//		try {
//			for(int i=0; i<10;i++) {
//				System.out.println(arr[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 범위를 벗어났습니다.");
//		}
		
		//클래스 실습
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
//		int width = scanner.nextInt();
//		int height = scanner.nextInt();
//		
//		Rectangle rectangle1= new Rectangle(width, height);
//		System.out.println(rectangle1.rect());
		
		
		//클래스 실습 Upgrade 
		Scanner scanner = new Scanner(System.in);
		
//		ArrayList<Rectangle> rect = new ArrayList<>();//여러개의 Rectangle 개체들
//		
//		while(true) {
//			System.out.println("사각형의 가로와 세로 길이를 띄어씌기를 기준으로 입력해주세요.");
//			int width = scanner.nextInt();
//			
//			int height = scanner.nextInt();
//			
//			if(width ==0 && height ==0) break;
//			
//			Rectangle rectangle1= new Rectangle(width);
//			rectangle1.setHeight(height);
//			rect.add(rectangle1);
//		}
//		
//		for(Rectangle rectangle: rect) {
//			System.out.println(rectangle.getWidth());
//			System.out.println(rectangle.getHeight());
//			System.out.println(rectangle.area());
//			System.out.println("--------------");
//		}
		
		
		//
		Number number1 =  new Number();
		Number number2 = new Number();
		
		number1.num1 = 1;
		number1.num2 = 1;
		
		System.out.println(number2.num1);
		System.out.println(number2.num2);
	}

}
