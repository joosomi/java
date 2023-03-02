package first_project;

public class Rectangle {
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int width) {
		this.width = width;	
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
	
	//메소드
	public int area() {
		return width*height;
	}

	
}