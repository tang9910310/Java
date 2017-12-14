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
		System.out.println("�ڬO�@�Ӫ���" + getLenA () + "�e��" + getLenB () + "���x�ΡA�P����" + getPerimeter() + "�A���n���G" + getArea() + "�C");
	}
	public void erase() {
		System.out.println("�@�Ӫ���" + getLenA () + "�e��" + getLenB () + "���x�γQ�R���F�C");
	}
}