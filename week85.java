import java.io.*;
import java.util.*;
import java.text.*;
public class week85{
  public static void MyId(String id[])throws IOException{
    int n = 0,m = 0,k = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入您的帳號 : ");
    id[2] = buf.readLine();
    while (k != 1) {
      if (id[2].equals(id[1])||id[2].equals(id[0])) {
        System.out.print("您的帳號已有其他人申請，請重新輸入 : ");
        id[2] = buf.readLine();
        continue;
      }
      else if (id[2].length() > 12||id[2].length() < 8) {
        System.out.print("您的帳號輸入字元數 : " + id[2].length() +"，不符規定，請重新輸入(個數8~12) : ");
        id[2] = buf.readLine();
        continue;
      }
      else if (id[2].charAt(0) < 'A'||id[2].charAt(0) > 'Z') {
        System.out.print("您的帳號開頭不為大寫，請重新輸入 : ");
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
          System.out.print("您的帳號 : " + id[2] +"，只有英文沒有數字，必須為英數混合，請重新輸入 : ");
          id[2] = buf.readLine();
          m = 0;
          continue;
        }
        else if (m == 0) {
          System.out.print("您的帳號 : " + id[2] + "，只有數字沒有英文，必須為英數混合，請重新輸入 : ");
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
    System.out.print("輸入您的密碼 : ");
    a = buf.readLine();
    while (k != 1) {
      if (a.equals(id[2])) {
        System.out.print("您的密碼與帳號相同，請重新輸入 : ");
        a = buf.readLine();
        continue;
      }
      else if (a.length() < 8||a.length() > 12) {
        System.out.print("您的密碼輸入字元數 : " + a.length() + "，不符規定，請重新輸入(個數8~12) : ");
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
          System.out.print("您的密碼 : " + a +"，只有英文沒有數字，必須為英數混合，請重新輸入 : ");
          a = buf.readLine();
          m = 0;
          continue;
        }
        else if (m == 0) {
          System.out.print("您的密碼 : " + a + "，只有數字沒有英文，必須為英數混合，請重新輸入 : ");
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
    System.out.print("輸入您的信箱 : ");
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
            System.out.print("您輸入的信箱 : " + email + "，不具有此信箱，請重新輸入 : ");
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
        System.out.print("您輸入的信箱 : " + email + "，不具有此信箱，請重新輸入(包含@且不在前後) : ");
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
    System.out.print("你好，歡迎來自");
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
    System.out.print("的你，你的註冊時間是" + today);
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