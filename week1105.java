import java.io.*;
public class week1105{
  public static void show(Engineer engineer[], int n) {
    for (int i = 0;i < n ;i++ ) {
      engineer[i].showProfile();
    }
  }
  public static void main(String[] args) throws IOException {
    int year = 0, salary = 0, i;
    String name, telephone, skill;
    Engineer engineer[] = new Engineer[2];
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    for (i = 0;i < 2 ;i++ ) {
      System.out.print("請輸入工程師姓名：");
      name = buf.readLine();
      System.out.print("請輸入工程師手機：");
      telephone = buf.readLine();
      System.out.print("請輸入工程師年資：");
      year = Integer.parseInt(buf.readLine());
      System.out.print("請輸入工程師薪水：");
      salary = Integer.parseInt(buf.readLine());
      System.out.print("請輸入工程師專長：");
      skill = buf.readLine();
      engineer[i] = new Engineer(name, telephone, year, salary, skill);
    }
    show(engineer, 2);
  }
}