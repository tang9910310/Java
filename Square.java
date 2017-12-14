public class Square extends Shape {
	public Square () {
    	this(0, 0, 0);
    }
    public Square (int lenA, int lenB, int lenC) {
    	super(lenA, lenB, lenC);
    }
	public double getPerimeter () {
		double perimeter = (getLenA () + getLenB ())* 2;
		return perimeter;
	}
    public double getArea () {
		double area = getLenA () * getLenB ();
		return area;
	}
	public void draw() {
		System.out.println("我是一個長為" + getLenA () + "寬為" + getLenB () + "的矩形，周長為" + getPerimeter() + "，面積為：" + getArea() + "。");
	}
	public void erase() {
		System.out.println("一個長為" + getLenA () + "寬為" + getLenB () + "的矩形被刪除了。");
	}
}