import java.io.*;
public class week95{
  public static void Select()throws IOException{
    int i = 0, n = 0, m = 0;
    String account, password;
    String ids[][] = new String[10][3];
    int moneys[] = new int[10];
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("(1)登入 (2)申請帳號 (3)離開程式 : ");
    int selection = Integer.parseInt(buf.readLine());
    while (selection != 3) {
      switch (selection) {
        case 1:
          // show(ids,moneys,i);
          System.out.print("您的帳號 : ");
          account = buf.readLine();
          do {
            for (n = 0;n<ids.length ;n++ ) {
              if (account.equals(ids[n][1])) {
                m = n;
                break;
              }
            }
            if (n == ids.length) {
              System.out.println("帳號不正確，請重新輸入。");
              System.out.print("您的帳號 : ");
              account = buf.readLine();
            }
          } while (!account.equals(ids[m][1]));
          System.out.print("您的密碼 : ");
          password = buf.readLine();
          while (!password.equals(ids[m][2])) {
            System.out.println("密碼不正確，請重新輸入。");
            System.out.print("您的密碼 : ");
            password = buf.readLine();
          }
          i = MyMoney(ids,moneys,m,i);
          break;
        case 2:
          System.out.print("請輸入您的姓名 : ");
          user.set_name(buf.readLine());
          System.out.print("請輸入您的帳號 : ");
          user.set_account(buf.readLine());
          for (n = 0;n < i;n++ ) {
            if (user.get_account().equals(ids[n][1])) {
              System.out.print("您的帳號已被人申請過，請輸入其他帳號：");
              user.set_account(buf.readLine());
              n = -1;
            }
          }
          System.out.print("請輸入您的密碼 : ");
          user.set_password(buf.readLine());
          for (n = 0;n < i ;n++ ) {
            if (user.get_password().equals(ids[n][2])) {
              System.out.print("您的密碼已被人申請過，請輸入其他密碼：");
              user.set_password(buf.readLine());
              n = -1;
            }
          }
          ids[i][0] = user.get_name();
          ids[i][1] = user.get_account();
          ids[i][2] = user.get_password();
          moneys[i] = 0;
          i++;
          break;
        case 3:
          break;
        default:
          System.out.println("您剛才輸入的是 : " + selection + "，請重新輸入(1~3)");
          break;
      }
      System.out.print("(1)登入 (2)申請帳號 (3)離開程式 : ");
      selection = Integer.parseInt(buf.readLine());
    }
    System.out.println("感謝您的使用，歡迎下次光臨。");
  }
  public static int MyMoney(String ids[][], int moneys[], int m,int i)throws IOException{
    int n = i, selection;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(ids[m][0] + "，歡迎您的使用，請從以下選擇您想要的服務項目");
    do{
      System.out.print("(1)存款 (2)提款 (3)查詢餘額 (4)離開 : ");
      selection = Integer.parseInt(buf.readLine());
      switch (selection) {
        case 1:
          selection1(moneys,m);
          break;
        case 2:
          i = selection2(ids,moneys,m,i);
          break;
        case 3:
          selection3(moneys,m);
          break;
        case 4:
          break;
        default:
          System.out.println("您剛才輸入的是 : " + selection + "，請重新輸入(1~4)");
          break;
      }
      if (i == n-1) {
        selection = 4;
      }
    } while (selection != 4);
    System.out.println("感謝您的使用，歡迎下次光臨。");
    return i;
  }
  public static void selection1(int moneys[],int m)throws IOException{
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入您想要存取的金額 : ");
    user.set_money(Integer.parseInt(buf.readLine()));
    moneys[m] = moneys[m] + user.get_money();
    System.out.println("您新的餘額 : " + moneys[m]);
  }
  public static int selection2(String ids[][], int moneys[], int m, int i)throws IOException{
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入您想要取出的金額 : ");
    user.set_money(Integer.parseInt(buf.readLine()));
    if (moneys[m] >= user.get_money()) {
      moneys[m] = moneys[m] - user.get_money();
      System.out.println("您餘下僅存的金額 : " + moneys[m]);
    }
    else {
      System.out.println("您目前僅存的金額 : " + moneys[m] + "，不合乎您的需求。");
      i = Alternative(ids,moneys,m,i); 
    }
    return i;
  }
  public static void selection3(int moneys[],int m){
    System.out.println("您目前的餘額 : "+ moneys[m]);
  }
  public static int Alternative(String ids[][], int moneys[], int m, int i)throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("現在給您一個機會領取超出您存款的金額，是否成為卡奴(Y/N) : ");
    String alternative = buf.readLine();
    if (alternative.equals("Y")) {
      System.out.println("您居然想得到不屬於您的東西，是個沒有金錢觀的朋友呢！");
      System.out.println("現在將實行懲罰：存款歸零。");
      moneys[m] = 0;
      System.out.println(ids[m][0] + "，您餘下僅存的金額 : " + moneys[m]);
    }
    else if (alternative.equals("N")) {
      System.out.println("您是個腳踏實地的朋友呢！");
      System.out.println("但沒有獎勵，想要的東西就自己去拿吧！");
      System.out.println(ids[m][0] + "，您餘下僅存的金額 : " + moneys[m]);
    }
    else {
      System.out.println("您剛才輸入的是：" + alternative + "，是個想挑戰工程師的朋友呢！");
      System.out.println("現在將實行終極懲罰：清除帳號。");
      for (int n = m;n < i-1 ;n++ ) {
        ids[n][0] = ids[n+1][0];
        ids[n][1] = ids[n+1][1];
        ids[n][2] = ids[n+1][2];
        moneys[n] = moneys[n+1];
      }
      i = i - 1;
      System.out.println("您的帳號已被刪除，若想使用本程式，請重新申請。");
    }
    return i;
  }
  public static void show(String ids[][], int moneys[], int i){
    for (int n = 0;n < i ;n++ ) {
      System.out.println("ids[" + n + "][name]：" + ids[n][0]);
      System.out.println("ids[" + n + "][account]：" + ids[n][1]);
      System.out.println("ids[" + n + "][password]：" + ids[n][2]);
      System.out.println("moneys[" + n + "]：" + moneys[n]);
    }
  }
  public static void main(String[] args)throws IOException{
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Select();
  }
}
class Account{
  private String name, account, password;
  private int money;
  public void set_name(String str){
    name = str;
  }
  public void set_account(String str)throws IOException{
    int i,n = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    while (str.length() > 12||str.length() < 8||str.charAt(0) < 'A'||str.charAt(0) > 'Z'||n == 0) {
      n = 0;
      for (i = 0;i < str.length();i++ ) {
        if (str.charAt(i) >= '0'&&str.charAt(i) <= '9') {
          n++;
        }
      }
      if (n == 0) {
        System.out.print("您剛才輸入的是 : " + str + "，帳號中必須要有數字，請重新輸入 : ");
        str = buf.readLine();
      }
      else if (str.length() > 12||str.length() < 8) {
        System.out.print("您剛才輸入的長度是 : " + str.length() + "，帳號長度必須在8~12之間，請重新輸入 : ");
        str = buf.readLine();
        n = 0;
      }
      else if (str.charAt(0) < 'A'||str.charAt(0) > 'Z') {
        System.out.print("您剛才輸入的是 : " + str + "，帳號的第一個字必須是大寫英文，請重新輸入 : ");
        str = buf.readLine();
        n = 0;
      }
      else {
        break;
      }
    }
    account = str;
  }
  public void set_password(String str){
    password = str;
  }
  public void set_money(int num){
    if (num > 0) {
      money = num;
    }
    else{
      money = 0;
    }
  }
  public String get_name(){
    return name;
  }
  public String get_account(){
    return account;
  }
  public String get_password(){
    return password;
  }
  public int get_money(){
    return money;
  }
}