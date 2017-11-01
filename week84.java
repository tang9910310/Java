import java.io.*;
import java.util.*;
import java.text.*;
public class week84{
  public static void functions(String today,String menu[],int price[])throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請選擇功能(1.當天要吃什麼 2.價格排序 3.列出一周菜單 4.離開程式)：");
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
        System.out.println("程式結束");
        break;
      default:
        System.out.println("您剛才輸入的是 : " + selection + "，下次請選擇功能上的數(1~4)。");
        break;
    }
  }
  public static void selection1(String today,String menu[],int price[]){
    int m;
    double d = Math.random();
    m = (int)(d*6);
    System.out.println("今天" + today + "，我要吃" + menu[m] + "，價格" + price[m] + "元");
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
      System.out.print(menu[i] + price[i]+"元、");
    }
  }
  public static void selection3(String today,String menu[],int price[]){
    String week[] ={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"},a;
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
      System.out.println( week[i] + "吃" + menu[i] + "，" + price[i] + "元");
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
    System.out.println("輸入這禮拜的菜單及價錢");
    for (int i = 0;i<price.length ;i++ ) {
      System.out.print("菜單 : ");
      menu[i] = buf.readLine();
      System.out.print("價錢 : ");
      price[i] = Integer.parseInt(buf.readLine());
    }
    for (int i=0;i<price.length ;i++ ) {
      System.out.println("菜單 : " + menu[i] + "，價錢 : " + price[i]);
      System.out.println(i);
    }
    functions(today,menu,price);
  }
}