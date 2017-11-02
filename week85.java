import java.io.*;
import java.util.*;
import java.text.*;
public class week85{
  public static void MyId(String id[])throws IOException{
    int n = 0,m = 0,k = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�z���b�� : ");
    id[2] = buf.readLine();
    while (k != 1) {
      if (id[2].equals(id[1])||id[2].equals(id[0])) {
        System.out.print("�z���b���w����L�H�ӽСA�Э��s��J : ");
        id[2] = buf.readLine();
        continue;
      }
      else if (id[2].length() > 12||id[2].length() < 8) {
        System.out.print("�z���b����J�r���� : " + id[2].length() +"�A���ųW�w�A�Э��s��J(�Ӽ�8~12) : ");
        id[2] = buf.readLine();
        continue;
      }
      else if (id[2].charAt(0) < 'A'||id[2].charAt(0) > 'Z') {
        System.out.print("�z���b���}�Y�����j�g�A�Э��s��J : ");
        id[2] = buf.readLine();
        continue;
      }
      else{
        for (int i=0;i<id[2].length() ;i++ ) {
          if (id[2].charAt(i) >= '0'&&id[2].charAt(i) <= '9') {
            n++;
          }
          else if (id[2].charAt(i) >= 'A'&&id[2].charAt(i) <= 'z') {
            m++;
          }
        }
        if (n == 0) {
          System.out.print("�z���b�� : " + id[2] +"�A�u���^��S���Ʀr�A�������^�ƲV�X�A�Э��s��J : ");
          id[2] = buf.readLine();
          m = 0;
          continue;
        }
        else if (m == 0) {
          System.out.print("�z���b�� : " + id[2] + "�A�u���Ʀr�S���^��A�������^�ƲV�X�A�Э��s��J : ");
          id[2] = buf.readLine();
          n = 0;
          continue;
        }
        else{
          k = 1;
          break;
        }
      }
    }
  }
  public static void MyPassword(String id[])throws IOException{
    int n = 0,m = 0,k = 0;
    String a;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�z���K�X : ");
    a = buf.readLine();
    while (k != 1) {
      if (a.equals(id[2])) {
        System.out.print("�z���K�X�P�b���ۦP�A�Э��s��J : ");
        a = buf.readLine();
        continue;
      }
      else if (a.length() < 8||a.length() > 12) {
        System.out.print("�z���K�X��J�r���� : " + a.length() + "�A���ųW�w�A�Э��s��J(�Ӽ�8~12) : ");
        a = buf.readLine();
        continue;
      }
      else{
        for (int i=0;i<a.length() ;i++ ) {
          if (a.charAt(i) >= '0'&&a.charAt(i) <= '9') {
            n++;
          }
          else if (a.charAt(i) >= 'A'&&a.charAt(i) <= 'z') {
            m++;
          }
        }
        if (n == 0) {
          System.out.print("�z���K�X : " + a +"�A�u���^��S���Ʀr�A�������^�ƲV�X�A�Э��s��J : ");
          a = buf.readLine();
          m = 0;
          continue;
        }
        else if (m == 0) {
          System.out.print("�z���K�X : " + a + "�A�u���Ʀr�S���^��A�������^�ƲV�X�A�Э��s��J : ");
          a = buf.readLine();
          n = 0;
          continue;
        }
        else{
          k = 1;
          break;
        }
      }
    }
  }
  public static void MyEmail(String today)throws IOException{
    int n = 0,k = 0,d = 0;
    String email;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�z���H�c : ");
    email = buf.readLine();
    while (k != 1) {
      for (int i = 0;i<email.length() ;i++ ) {
        if (email.charAt(i) == 64&&i != 0&&i != email.length()) {
          for (int m=i;m<email.length() ;m++ ) {
            if (email.charAt(m) == '.') {
              if (m>i) {
                k = 1;
                break;
              }
            }
            else{
              d++;
            }
          }
          if (d == email.length() - i) {
            System.out.print("�z��J���H�c : " + email + "�A���㦳���H�c�A�Э��s��J : ");
            email = buf.readLine();
            d = 0;
            continue;
          }
        }
        else {
          n++;
        }
      }
      if (n == email.length()) {
        System.out.print("�z��J���H�c : " + email + "�A���㦳���H�c�A�Э��s��J(�]�t@�B���b�e��) : ");
        email = buf.readLine();
        n = 0;
        continue;
      }
    }
    for (int i = 0;i<email.length() ;i++ ) {
      if (email.charAt(i) != 64) {
        System.out.print(email.charAt(i));
      }
      else{
        break;
      }
    }
    System.out.print("�A�n�A�w��Ӧ�");
    for (int i = 0;i<email.length() ;i++ ) {
      if (email.charAt(i) == 64) {
        for (int m = i+1;m<email.length() ;m++ ) {
          if (email.charAt(m) != 46) {
            System.out.print(email.charAt(m));
          }
          else{
            break;
          }
        }
      }
    }
    System.out.print("���A�A�A�����U�ɶ��O" + today);
  }
  public static void main(String[] args)throws IOException{
    String id[] = new String [5];
    id[0] = "Qwe123rty456";
    id[1] = "Asd123fgh456";
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Date date = new Date();
    SimpleDateFormat week = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");
    String today = week.format(date);
    MyId(id);
    MyPassword(id);
    MyEmail(today);
  }
}