package Components;


public class Circle {
	
	private int xKoordinate;
	private int yKoordinate;
	
	public Circle(int x, int y) {
		this.xKoordinate = x;
		this.yKoordinate = y;
	}
	
	public int get_x() {
		return this.xKoordinate;
	}
	public int get_y() {
		return this.yKoordinate;
	}
	public void set_x(int x) {
		this.xKoordinate = x;
	}
	public void set_y(int y) {
		this.yKoordinate = y;
	}
	
}
