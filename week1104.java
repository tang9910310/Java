import java.io.*;
public class week1104{
  public static void show(Employee employee[], int n) {
    for (int i = 0;i < n ;i++ ) {
      employee[i].showProfile();
    }
  }
  public static void main(String[] args) throws IOException {
    int year = 0, i;
    String name, telephone;
    Employee employee[] = new Employee[2];
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    for (i = 0;i < 2 ;i++ ) {
      System.out.print("請輸入員工姓名：");
      name = buf.readLine();
      System.out.print("請輸入員工手機：");
      telephone = buf.readLine();
      System.out.print("請輸入員工年資：");
      year = Integer.parseInt(buf.readLine());
      employee[i] = new Employee(name, telephone, year);
    }
    show(employee, 2);
  }
}