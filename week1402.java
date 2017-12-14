import java.io.*;
public class week1402 {
  public static int countBasic = 0;
  public static int countMananger = 0;
  public static int countSupervisor = 0;
  public static void occupation(String name[],String sex[],String phone[],String address[], int year[], int n) throws IOException {
    int i;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    
    for (i = 0;i < n ;i++ ) {
      System.out.print("請輸入姓名：");
      name[i] = buf.readLine();
      System.out.print("請輸入性別(男/女)：");
      sex[i] = buf.readLine();
      System.out.print("請輸入電話：");
      phone[i] = buf.readLine();
      System.out.print("請輸入住址：");
      address[i] = buf.readLine();
      System.out.print("請輸入年資：");
      year[i] = Integer.parseInt(buf.readLine());
    }
  }
  public static void show (Employee employee[], int n) {
    int i;
    for (i = 0;i < n ;i++ ) {
      System.out.print("第" + (i + 1) + "位");
      employee[i].showProfile();
    }
  }
  public static void main(String[] args) throws IOException {
    String name[] = new String[20];
    String sex[] = new String[20];
    String phone[] = new String[20];
    String address[] = new String[20];
    int year[] = new int[20];
    int selection, n, i;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    
    week1402 myEmployee = new week1402();
    System.out.println("請輸入員工數(至少一位高級主管，二位二級主管，三位員工，至少六人)。");
    do {
      System.out.print("請輸入高級主管人數(至少一位高級主管)：");
      countMananger = Integer.parseInt(buf.readLine());
    } while (countMananger < 1);
    Employee mananger[] = new Managers[countMananger];
    occupation(name, sex, phone, address, year, countMananger);
    for (i = 0;i < countMananger; i++) {
      mananger[i] = new Managers(name[i], sex[i], phone[i], address[i], year[i]);
    }
    do {
      System.out.print("請輸入二級主管人數(至少二位二級主管)：");
      countSupervisor = Integer.parseInt(buf.readLine());
    } while (countSupervisor < 2);
    Employee supervisor[] = new Supervisors[countSupervisor];
    occupation(name, sex, phone, address, year, countSupervisor);
    for (i = 0;i < countSupervisor; i++) {
      supervisor[i] = new Supervisors(name[i], sex[i], phone[i], address[i], year[i]);
    }
    do {
      System.out.print("請輸入員工人數(至少三位員工)：");
      countBasic = Integer.parseInt(buf.readLine());
    } while (countBasic < 3);
    Employee basic[] = new Basic_Employee[countBasic];
    occupation(name, sex, phone, address, year, countBasic);
    for (i = 0;i < countBasic; i++) {
      basic[i] = new Basic_Employee(name[i], sex[i], phone[i], address[i], year[i]);
    }
    System.out.println("\n高級主管，共" + countMananger + "人。");
    myEmployee.show(mananger, countMananger);
    System.out.println("\n二級主管，共" + countSupervisor + "人。");
    myEmployee.show(supervisor, countSupervisor);
    System.out.println("\n一般員工，共" + countBasic + "人。");
    myEmployee.show(basic, countBasic);
  }
}