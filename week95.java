import java.io.*;
public class week95{
  public static void Select()throws IOException{
    int i = 0, n = 0, m = 0;
    String account, password;
    String ids[][] = new String[10][3];
    int moneys[] = new int[10];
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("(1)�n�J (2)�ӽбb�� (3)���}�{�� : ");
    int selection = Integer.parseInt(buf.readLine());
    while (selection != 3) {
      switch (selection) {
        case 1:
          // show(ids,moneys,i);
          System.out.print("�z���b�� : ");
          account = buf.readLine();
          do {
            for (n = 0;n<ids.length ;n++ ) {
              if (account.equals(ids[n][1])) {
                m = n;
                break;
              }
            }
            if (n == ids.length) {
              System.out.println("�b�������T�A�Э��s��J�C");
              System.out.print("�z���b�� : ");
              account = buf.readLine();
            }
          } while (!account.equals(ids[m][1]));
          System.out.print("�z���K�X : ");
          password = buf.readLine();
          while (!password.equals(ids[m][2])) {
            System.out.println("�K�X�����T�A�Э��s��J�C");
            System.out.print("�z���K�X : ");
            password = buf.readLine();
          }
          i = MyMoney(ids,moneys,m,i);
          break;
        case 2:
          System.out.print("�п�J�z���m�W : ");
          user.set_name(buf.readLine());
          System.out.print("�п�J�z���b�� : ");
          user.set_account(buf.readLine());
          for (n = 0;n < i;n++ ) {
            if (user.get_account().equals(ids[n][1])) {
              System.out.print("�z���b���w�Q�H�ӽйL�A�п�J��L�b���G");
              user.set_account(buf.readLine());
              n = -1;
            }
          }
          System.out.print("�п�J�z���K�X : ");
          user.set_password(buf.readLine());
          for (n = 0;n < i ;n++ ) {
            if (user.get_password().equals(ids[n][2])) {
              System.out.print("�z���K�X�w�Q�H�ӽйL�A�п�J��L�K�X�G");
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
          System.out.println("�z��~��J���O : " + selection + "�A�Э��s��J(1~3)");
          break;
      }
      System.out.print("(1)�n�J (2)�ӽбb�� (3)���}�{�� : ");
      selection = Integer.parseInt(buf.readLine());
    }
    System.out.println("�P�±z���ϥΡA�w��U�����{�C");
  }
  public static int MyMoney(String ids[][], int moneys[], int m,int i)throws IOException{
    int n = i, selection;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(ids[m][0] + "�A�w��z���ϥΡA�бq�H�U��ܱz�Q�n���A�ȶ���");
    do{
      System.out.print("(1)�s�� (2)���� (3)�d�߾l�B (4)���} : ");
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
          System.out.println("�z��~��J���O : " + selection + "�A�Э��s��J(1~4)");
          break;
      }
      if (i == n-1) {
        selection = 4;
      }
    } while (selection != 4);
    System.out.println("�P�±z���ϥΡA�w��U�����{�C");
    return i;
  }
  public static void selection1(int moneys[],int m)throws IOException{
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�п�J�z�Q�n�s�������B : ");
    user.set_money(Integer.parseInt(buf.readLine()));
    moneys[m] = moneys[m] + user.get_money();
    System.out.println("�z�s���l�B : " + moneys[m]);
  }
  public static int selection2(String ids[][], int moneys[], int m, int i)throws IOException{
    Account user = new Account();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�п�J�z�Q�n���X�����B : ");
    user.set_money(Integer.parseInt(buf.readLine()));
    if (moneys[m] >= user.get_money()) {
      moneys[m] = moneys[m] - user.get_money();
      System.out.println("�z�l�U�Ȧs�����B : " + moneys[m]);
    }
    else {
      System.out.println("�z�ثe�Ȧs�����B : " + moneys[m] + "�A���X�G�z���ݨD�C");
      i = Alternative(ids,moneys,m,i); 
    }
    return i;
  }
  public static void selection3(int moneys[],int m){
    System.out.println("�z�ثe���l�B : "+ moneys[m]);
  }
  public static int Alternative(String ids[][], int moneys[], int m, int i)throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�{�b���z�@�Ӿ��|����W�X�z�s�ڪ����B�A�O�_�����d��(Y/N) : ");
    String alternative = buf.readLine();
    if (alternative.equals("Y")) {
      System.out.println("�z�~�M�Q�o�줣�ݩ�z���F��A�O�ӨS�������[���B�ͩO�I");
      System.out.println("�{�b�N����g�@�G�s���k�s�C");
      moneys[m] = 0;
      System.out.println(ids[m][0] + "�A�z�l�U�Ȧs�����B : " + moneys[m]);
    }
    else if (alternative.equals("N")) {
      System.out.println("�z�O�Ӹ}���a���B�ͩO�I");
      System.out.println("���S�����y�A�Q�n���F��N�ۤv�h���a�I");
      System.out.println(ids[m][0] + "�A�z�l�U�Ȧs�����B : " + moneys[m]);
    }
    else {
      System.out.println("�z��~��J���O�G" + alternative + "�A�O�ӷQ�D�Ԥu�{�v���B�ͩO�I");
      System.out.println("�{�b�N���׷��g�@�G�M���b���C");
      for (int n = m;n < i-1 ;n++ ) {
        ids[n][0] = ids[n+1][0];
        ids[n][1] = ids[n+1][1];
        ids[n][2] = ids[n+1][2];
        moneys[n] = moneys[n+1];
      }
      i = i - 1;
      System.out.println("�z���b���w�Q�R���A�Y�Q�ϥΥ��{���A�Э��s�ӽСC");
    }
    return i;
  }
  public static void show(String ids[][], int moneys[], int i){
    for (int n = 0;n < i ;n++ ) {
      System.out.println("ids[" + n + "][name]�G" + ids[n][0]);
      System.out.println("ids[" + n + "][account]�G" + ids[n][1]);
      System.out.println("ids[" + n + "][password]�G" + ids[n][2]);
      System.out.println("moneys[" + n + "]�G" + moneys[n]);
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
        System.out.print("�z��~��J���O : " + str + "�A�b���������n���Ʀr�A�Э��s��J : ");
        str = buf.readLine();
      }
      else if (str.length() > 12||str.length() < 8) {
        System.out.print("�z��~��J�����׬O : " + str.length() + "�A�b�����ץ����b8~12�����A�Э��s��J : ");
        str = buf.readLine();
        n = 0;
      }
      else if (str.charAt(0) < 'A'||str.charAt(0) > 'Z') {
        System.out.print("�z��~��J���O : " + str + "�A�b�����Ĥ@�Ӧr�����O�j�g�^��A�Э��s��J : ");
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