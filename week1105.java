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
      System.out.print("�п�J�u�{�v�m�W�G");
      name = buf.readLine();
      System.out.print("�п�J�u�{�v����G");
      telephone = buf.readLine();
      System.out.print("�п�J�u�{�v�~��G");
      year = Integer.parseInt(buf.readLine());
      System.out.print("�п�J�u�{�v�~���G");
      salary = Integer.parseInt(buf.readLine());
      System.out.print("�п�J�u�{�v�M���G");
      skill = buf.readLine();
      engineer[i] = new Engineer(name, telephone, year, salary, skill);
    }
    show(engineer, 2);
  }
}