import java.io.*;
import java.util.*;
import java.text.*;
public class week84{
  public static void functions(String today,String menu[],int price[])throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�п�ܥ\��(1.��ѭn�Y���� 2.����Ƨ� 3.�C�X�@�P��� 4.���}�{��)�G");
    int selection = Integer.parseInt(buf.readLine());
    switch (selection) {
      case 1:
        selection1(today,menu,price);
        break;
      case 2:
        selection2(today,menu,price);
        break;
      case 3:
        selection3(today,menu,price);
        break;
      case 4:
        System.out.println("�{������");
        break;
      default:
        System.out.println("�z��~��J���O : " + selection + "�A�U���п�ܥ\��W����(1~4)�C");
        break;
    }
  }
  public static void selection1(String today,String menu[],int price[]){
    int m;
    double d = Math.random();
    m = (int)(d*6);
    System.out.println("����" + today + "�A�ڭn�Y" + menu[m] + "�A����" + price[m] + "��");
  }
  public static void selection2(String today,String menu[],int price[]){
    String a;
    for (int i=0;i<price.length ;i++ ) {
      for (int m=0;m<=i ;m++ ) {
        if (price[i]<price[m]) {
          a=menu[i];
          menu[i]=menu[m];
          menu[m]=a;
          price[i] = price[i]+price[m];
          price[m] = price[i]-price[m];
          price[i] = price[i]-price[m];
        }
      }
    }
    for (int i=0;i<price.length ;i++ ) {
      System.out.print(menu[i] + price[i]+"���B");
    }
  }
  public static void selection3(String today,String menu[],int price[]){
    String week[] ={"�P���@","�P���G","�P���T","�P���|","�P����","�P����","�P����"},a;
    int m,n;
    double d = Math.random();
    for (int i=0;i<price.length ;i++ ) {
      m = (int)(Math.random()*6);
      a=menu[i];
      menu[i]=menu[m];
      menu[m]=a;
      price[i] = price[i]+price[m];
      price[m] = price[i]-price[m];
      price[i] = price[i]-price[m];
    }
    for (int i=0;i<price.length ;i++ ) {
      System.out.println( week[i] + "�Y" + menu[i] + "�A" + price[i] + "��");
    }
  }
  public static void main(String[] args)throws IOException{
    int m;
    m = (int)(Math.random()*6);
    String menu[] = new String [7];
    int price[] = new int [7], a[] = new int [10];
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Date date = new Date();
    SimpleDateFormat week = new SimpleDateFormat("EEEE");
    String today = week.format(date);
    System.out.println("��J�o§�������λ���");
    for (int i = 0;i<price.length ;i++ ) {
      System.out.print("��� : ");
      menu[i] = buf.readLine();
      System.out.print("���� : ");
      price[i] = Integer.parseInt(buf.readLine());
    }
    for (int i=0;i<price.length ;i++ ) {
      System.out.println("��� : " + menu[i] + "�A���� : " + price[i]);
      System.out.println(i);
    }
    functions(today,menu,price);
  }
}