package first_project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("나이를 입력하세요.");
//	    int age = sc.nextInt();
//	    if (age <8) {
//	        System.out.println("유아");
//	    } else if (age < 14) {
//	        System.out.println("초등학생");
//	    } else if (age < 17) {
//	        System.out.println("중학");
//	    } else if (age < 20) {
//	        System.out.println("고등학생");
//	    } else {
//	        System.out.println("성인");
//	    }
//	    sc.close();
//	    } 
	
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//    System.out.println("이름을 입력하세요.");
//    String name = sc.next();
//    if (name.equals("홍길동")) {
//        System.out.println("남자");
//    } else if (name.equals("성춘향")) {
//        System.out.println("여자");
//    } else {
//        System.out.println("모르겠어요");
//    }
//    sc.close();
//    } 
	
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//    System.out.println("숫자를 입력하세요.");
//    int num = sc.nextInt();
//    
//    for(int i=0; i<=num ; i++) {
//    	
//    	System.out.print(i + " ");
//    }
//    sc.close();
//    } 
	
//	public static double sum(double num1, double num2) {
//		return num1 + num2;
//	}
//	
//	public static void evaluate(double num1, double num2) {
//		System.out.println("덧셈 결과: " + (num1 + num2));
//		System.out.println("뺄셈 결과: " + (num1 - num2));
//		System.out.println("나눗셈 결과: " + (num1 / num2));
//		System.out.println("곱셈 결과: " + (num1 * num2));
//	}
//	
//	public static int zero() {
//		return 0;
//	}
//	
//	public static void main(String[] args) {
//    System.out.println("숫자 두 개를 입력하세요.");
//	
//    Scanner sc = new Scanner(System.in);
//	
//    double num1 = sc.nextDouble();
//    double num2 = sc.nextDouble();
//    
//    evaluate(num1,num2);
//    
//    sc.close();
//    
//    System.out.println("덧셈 결과 : " + sum(num1, num2));
//    
//    int number = zero();
//    System.out.println("number"+ number);
//	
//	public static void printArray(int[] arr) {
//		for (int i=0; i< arr.length; i++) {
//			if(i==0) System.out.print('[');
//			if(i== arr.length-1) System.out.print(arr[i] + "]");
//			else System.out.print(arr[i] + ", ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr1 = {0,0,0}; //초기화
//		int[] arr2 = new int[3];
//		
//		//arr1 = [0,1,2]
//		for(int i=1; i<arr1.length; i++) {
//			arr1[i]=i;
//		}
//		
//		for (int i =0; i<arr1.length; i++) {
//			System.out.print(i + " ");
//		}
//		
//		for (int value : arr1) {
//			System.out.print(value + " ");
//		}
//		
//		printArray(arr1);
//		
//		System.out.println(Arrays.toString(arr1));
 //   } 
	
	public static void main(String[] args) {
		//0 1 2
		//3 4 5
//		int[][] arr1 = {{0,1,2}, {3,4,5}};
//		int[][] arr2 = new int [2][3];
//		
//		for(int[] arr: arr1) {
//			for(int value: arr) {
//				System.out.print(value + " ");
//			}
//			System.out.println("");
//		}
//		
//		int num = 0;
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				arr2[i][j] = num;
//				num++;
//			}
//		}
//		
//		for(int[] arr: arr2){
//			for(int value: arr) {
//				System.out.print(value + " ");
//			}
//			System.out.println("");
//		}
		
//		ArrayList<Integer> arr1 = new ArrayList<>();
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		
//		for(int i=1; i<6; i++) {
//			arr2.add(i);
//		}
//		
//		//arr1맨 뒤에 2추가
//		arr1.add(2); // 2
//		//0번째 인데스에 1추가
//		arr1.add(0,1); // 1 2 
//		//arr1 요소 뒤에 arr2 추가
//		arr1.addAll(arr2); // 1 2 1 2 3 4 5
//		//1번째 인덱스 요소 제거
//		arr1.remove(1);
//		//요소 모두 제거
//		arr1.clear();
//		
//		for (int value: arr1){
//			System.out.print(value + " ");
//		}
//		
//		//length => .size()사용
//		//arr1[i] => arr1.get(i) 사용
//		System.out.println("");
//		for (int i=0; i<arr1.size(); i++) {
//			System.out.print(arr1.get(i) + " ");
//		}
//		
//		//요소의 인덱스 반환 
//		System.out.println("");
//		System.out.println("index of 2 : "+arr1.indexOf(2));
		
		
		////객체 만들기
		Person person1 = new Person();
//		Person person2 = new Person("브래드", 20);
//		person1.myname();
//		person2.myname();
		
		person1.setName("루크");
		System.out.println(person1.getName());
		
	}}


