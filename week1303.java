import java.io.*;
import java.util.*;
import java.text.*;
public class week1303 {
  public static int count = 2;
  public static void main(String[] args) throws IOException {
    int i = 0;
    String password1;
    String account[] = new String[5];
    String password[] = new String[5];
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Date date = new Date();
    SimpleDateFormat week = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
    String today = week.format(date);
    Game_account game[] = new Game_account[5];
    account[0] = "qwe";
    account[1] = "zxc";
    password[0] = "rty";
    password[1] = "vbn";
    game[0] =  new Game_account(account[0], password[0]);
    game[1] =  new Game_account(account[1], password[1]);
    do {
      System.out.print("請輸入你的帳號：");
      account[count] = buf.readLine();
      for (i = 0;i < count ;i++ ) {
        if (account[count].equals(account[i])) {
          break;
        }
      }
    } while (i != count);
    do {
     System.out.print("請輸入你的密碼：");
     password[count] = buf.readLine();
     System.out.print("請再次輸入你的密碼：");
     password1 = buf.readLine();
     for (i = 0;i < count ;i++ ) {
       if (password[count].equals(password[i])) {
         break;
       }
     }
    } while ((!password1.equals(password[count])) || (i != count));
    game[count] = new Game_account(account[count], password[count], today);
    game[count].showProfile();
  }
}