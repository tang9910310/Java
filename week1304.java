import game.Game_account;
import java.io.*;
public class week1304 {
  static int count = 0;
  public static void main(String[] args) throws IOException {
    String account, password1, password2;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Game_account game[] = new Game_account[++count];
    System.out.print("�п�J�A���b���G");
    account = buf.readLine();
    do {
      System.out.print("�п�J�A���K�X�G");
      password1 = buf.readLine();
      System.out.print("�ЦA����J�A���K�X�G");
      password2 = buf.readLine();
    } while (!password1.equals(password2));
    game[--count] = new Game_account(account, password1);
    game[count].showProfile();
  }
}