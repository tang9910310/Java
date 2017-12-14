import java.io.*;
public class week1403 {
  public static void design(Shape shape[], int n) {
    int i;
    for (i = 0;i < n ;i++ ) {
      double d = Math.random();
      int r = (int)(d * 3) + 0;
      switch (r) {
        case 0:
          shape[i] = new Circle(i, i, i);
          break;
        case 1:
          shape[i] = new Square(i, (i + 1), i);
          break;
        case 2:
          shape[i] = new Traingle(i, (i + 1), (i + 2));
          break;
        default:
          break;
      }
    }
  }
  public static void showProfile(Shape shape[], int n) {
    int i;
    for (i = 0;i < n ;i++ ) {
      shape[i].draw();
    }
  }
  public static void main(String[] args) throws IOException {
    int n = 10;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    
    Shape shape[] = new Shape[n];
    design(shape, n);
    showProfile(shape, n);
  }
}