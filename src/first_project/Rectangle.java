package first_project;

public class Rectangle {
	private int width;
	private int height;
	public static int count = 0;
	
	//생성자
	public Rectangle(int width) {
		this.width = width;	
		count++;
	}
	
	
	//getter & setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Rectangle.count = count;
	}


	//메소드
	public int area() {
		return width*height;
		
	}

	
}
