public abstract class Shape {
	private int lenA, lenB, lenC;
    public Shape () {
    	this(0, 0, 0);
    }
    public Shape (int lenA, int lenB, int lenC) {
    	setShape(lenA, lenB, lenC);
    }
    public Shape (Shape shape) {
    	setShape(shape.getLenA(), shape.getLenB(), shape.getLenC());
    }
    public void setShape(int lenA, int lenB, int lenC) {
    	setLenA(lenA);
    	setLenB(lenB);
    	setLenC(lenC);
    }
    private void setLenA (int num) {
    	lenA = ((num >= 1) ? num : 1);
    }
    private void setLenB (int num) {
    	lenB = ((num >= 1) ? num : 1);
    }
    private void setLenC (int num) {
    	lenC = ((num >= 1) ? num : 1);
    }
    public int getLenA () {
    	return lenA;
    }
    public int getLenB () {
    	return lenB;
    }
    public int getLenC () {
    	return lenC;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void draw();
    public abstract void erase();
}