import java.io.*;
public class week1005{
  public static void function(Dog dog[], int n) throws IOException{
    int selection = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    do {
      System.out.print("�п�ܥH�U�\��G1 ��ܩҦ��d����T�A2 ��̦ܳ~���d����T");
      System.out.print("�A3 �ק��d����ơA4 ���}�{���G");
      selection = Integer.parseInt(buf.readLine());
      switch (selection) {
        case 1:
          selection1(dog,n);
          break;
        case 2:
          selection2(dog,n);
          break;
        case 3:
          selection3(dog,n);
          break;
        case 4:
          break;
        default:
          System.out.println("�z��~��J���O�G" + selection + "�A�{���z�n��ܸ�T�A�U���п�J(1~4)");
          selection1(dog,n);
          break;
      }
    } while (selection != 4);
    System.out.println("�{������");
  } 
  public static void selection1(Dog dog[], int n) {
    for (int i = 0;i < n ;i++ ) {
      System.out.print("�z����" + (i + 1) + "��");
      dog[i].showInformation();
    }
  }
  public static void selection2(Dog dog[], int n) {
    int max = 0,maxn = 0;
    for (int i = 0;i < n;i++ ) {
      if (max <= dog[i].getAge()) {
        max = dog[i].getAge();
        maxn = i;
      }
    }
    dog[maxn].showInformation();
  }
  public static void selection3(Dog dog[], int n) throws IOException {
    int i, modify;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("���ק諸�d���G");
    i = Integer.parseInt(buf.readLine());
    System.out.print("1�G�ק�W�١A2�G�ק��d���~�ءA3�G�ק��d���~�֡G");
    modify = Integer.parseInt(buf.readLine());
    i = ((i <= n) ? i : n);
    switch (modify) {
      case 1:
        modification1(dog,i,n);
        break;
      case 2:
        modification2(dog,i,n);
        break;
      case 3:
        modification3(dog,i,n);
        break;
      default:
        System.out.println("�z��~��J���O�G" + modify + "�A�]�w���ק�~�֡A�U���п�J(1~3)");
        modification3(dog,i,n);
        break;
    }
    for (int k = 0;k < 14;k++ ) {
      System.out.print("*");
    }
    System.out.print("�s���");
    for (int k = 0;k < 14;k++ ) {
      System.out.print("*");
    }
    System.out.println();
    selection1(dog,n);
  }
  public static void modification1(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��W�١G" + dog[i - 1].getName() + "�A���קאּ�G");
    dog[i - 1].setName(buf.readLine());
  }
  public static void modification2(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��~�ءG" + dog[i - 1].getVariety() + "�A���קאּ�G");
    dog[i - 1].setVariety(buf.readLine());
  }
  public static void modification3(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��~�֡G" + dog[i - 1].getAge() + "�A���קאּ�G");
    dog[i - 1].setAge(Integer.parseInt(buf.readLine()));
  }
  public static void main(String[] args) throws IOException {
    int age = 0, i = 0, n = 0;
    String name, variety;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�п�J�d���ƶq�G");
    n = Integer.parseInt(buf.readLine());
    Dog dog[] = new Dog[n];
    for (i = 0;i < n ;i++ ) {
      System.out.print("�п�J��" + (i + 1) + "���d���W�١G");
      name = buf.readLine();
      System.out.print("�п�J��" + (i + 1) + "���d���~�ءG");
      variety = buf.readLine();
      System.out.print("�п�J��" + (i + 1) + "���d���~���G");
      age = Integer.parseInt(buf.readLine());
      dog[i] = new Dog(name, variety, age);
    }
    function(dog,n);
  }
}