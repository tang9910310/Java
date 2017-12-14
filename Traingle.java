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
		System.out.println("�ڬO�@�ӤT�����" + getLenA () + "�A" + getLenB () + "�A" + getLenC () + "���T���ΡA�P����" + getPerimeter() + "�A���n���G" + getArea() + "�C");
	}
	public void erase() {
		System.out.println("�@�ӤT�����" + getLenA () + "�A" + getLenB () + "�A" + getLenC () + "���T���γQ�R���F�C");
	}
}