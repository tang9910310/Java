public class Traingle extends Shape {
	public Traingle () {
    	this(0, 0, 0);
    }
    public Traingle (int lenA, int lenB, int lenC) {
    	super(lenA, lenB, lenC);
    }
	public double getPerimeter () {
		double perimeter = getLenA () + getLenB () + getLenC ();
		return perimeter;
	}
    public double getArea () {
    	double length = (getLenA () + getLenB () + getLenC ())/2;
		double area = Math.sqrt(length * (length - getLenA ()) * (length - getLenB ()) * (length - getLenC ()));
		return area;
	}
	public void draw() {
		System.out.println("我是一個三邊長為" + getLenA () + "，" + getLenB () + "，" + getLenC () + "的三角形，周長為" + getPerimeter() + "，面積為：" + getArea() + "。");
	}
	public void erase() {
		System.out.println("一個三邊長為" + getLenA () + "，" + getLenB () + "，" + getLenC () + "的三角形被刪除了。");
	}
}