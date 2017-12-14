public class Circle extends Shape {
	public Circle () {
    	this(0, 0, 0);
    }
    public Circle (int lenA, int lenB, int lenC) {
    	super(lenA, lenB, lenC);
    }
	public double getPerimeter () {
		double perimeter = getLenA () * 2 * 3.14;
		return perimeter;
	}
    public double getArea () {
		double area = getLenA () * getLenA () * 3.14;
		return area;
	}
	public void draw() {
		System.out.println("我是一個半徑為" + getLenA () + "的圓形，周長為" + getPerimeter() + "，面積為：" + getArea() + "。");
	}
	public void erase() {
		System.out.println("一個半徑為" + getLenA () + "的圓形被刪除了。");
	}
}