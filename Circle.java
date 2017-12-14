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
		System.out.println("�ڬO�@�ӥb�|��" + getLenA () + "����ΡA�P����" + getPerimeter() + "�A���n���G" + getArea() + "�C");
	}
	public void erase() {
		System.out.println("�@�ӥb�|��" + getLenA () + "����γQ�R���F�C");
	}
}