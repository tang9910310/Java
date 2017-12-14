import java.io.*;
public class week1402 {
  public static int countBasic = 0;
  public static int countMananger = 0;
  public static int countSupervisor = 0;
  public static void occupation(String name[],String sex[],String phone[],String address[], int year[], int n) throws IOException {
    int i;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    
    for (i = 0;i < n ;i++ ) {
      System.out.print("�п�J�m�W�G");
      name[i] = buf.readLine();
      System.out.print("�п�J�ʧO(�k/�k)�G");
      sex[i] = buf.readLine();
      System.out.print("�п�J�q�ܡG");
      phone[i] = buf.readLine();
      System.out.print("�п�J��}�G");
      address[i] = buf.readLine();
      System.out.print("�п�J�~��G");
      year[i] = Integer.parseInt(buf.readLine());
    }
  }
  public static void show (Employee employee[], int n) {
    int i;
    for (i = 0;i < n ;i++ ) {
      System.out.print("��" + (i + 1) + "��");
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
    System.out.println("�п�J���u��(�ܤ֤@�찪�ťD�ޡA�G��G�ťD�ޡA�T����u�A�ܤ֤��H)�C");
    do {
      System.out.print("�п�J���ťD�ޤH��(�ܤ֤@�찪�ťD��)�G");
      countMananger = Integer.parseInt(buf.readLine());
    } while (countMananger < 1);
    Employee mananger[] = new Managers[countMananger];
    occupation(name, sex, phone, address, year, countMananger);
    for (i = 0;i < countMananger; i++) {
      mananger[i] = new Managers(name[i], sex[i], phone[i], address[i], year[i]);
    }
    do {
      System.out.print("�п�J�G�ťD�ޤH��(�ܤ֤G��G�ťD��)�G");
      countSupervisor = Integer.parseInt(buf.readLine());
    } while (countSupervisor < 2);
    Employee supervisor[] = new Supervisors[countSupervisor];
    occupation(name, sex, phone, address, year, countSupervisor);
    for (i = 0;i < countSupervisor; i++) {
      supervisor[i] = new Supervisors(name[i], sex[i], phone[i], address[i], year[i]);
    }
    do {
      System.out.print("�п�J���u�H��(�ܤ֤T����u)�G");
      countBasic = Integer.parseInt(buf.readLine());
    } while (countBasic < 3);
    Employee basic[] = new Basic_Employee[countBasic];
    occupation(name, sex, phone, address, year, countBasic);
    for (i = 0;i < countBasic; i++) {
      basic[i] = new Basic_Employee(name[i], sex[i], phone[i], address[i], year[i]);
    }
    System.out.println("\n���ťD�ޡA�@" + countMananger + "�H�C");
    myEmployee.show(mananger, countMananger);
    System.out.println("\n�G�ťD�ޡA�@" + countSupervisor + "�H�C");
    myEmployee.show(supervisor, countSupervisor);
    System.out.println("\n�@����u�A�@" + countBasic + "�H�C");
    myEmployee.show(basic, countBasic);
  }
}