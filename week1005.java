import java.io.*;
public class week1005{
  public static void function(Dog dog[], int n) throws IOException{
    int selection = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    do {
      System.out.print("請選擇以下功能：1 顯示所有寵物資訊，2 顯示最年長寵物資訊");
      System.out.print("，3 修改寵物資料，4 離開程式：");
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
          System.out.println("您剛才輸入的是：" + selection + "，認為您要顯示資訊，下次請輸入(1~4)");
          selection1(dog,n);
          break;
      }
    } while (selection != 4);
    System.out.println("程式結束");
  } 
  public static void selection1(Dog dog[], int n) {
    for (int i = 0;i < n ;i++ ) {
      System.out.print("您的第" + (i + 1) + "隻");
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
    System.out.print("欲修改的寵物：");
    i = Integer.parseInt(buf.readLine());
    System.out.print("1：修改名稱，2：修改寵物品種，3：修改寵物年齡：");
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
        System.out.println("您剛才輸入的是：" + modify + "，設定為修改年齡，下次請輸入(1~3)");
        modification3(dog,i,n);
        break;
    }
    for (int k = 0;k < 14;k++ ) {
      System.out.print("*");
    }
    System.out.print("新資料");
    for (int k = 0;k < 14;k++ ) {
      System.out.print("*");
    }
    System.out.println();
    selection1(dog,n);
  }
  public static void modification1(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("原名稱：" + dog[i - 1].getName() + "，欲修改為：");
    dog[i - 1].setName(buf.readLine());
  }
  public static void modification2(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("原品種：" + dog[i - 1].getVariety() + "，欲修改為：");
    dog[i - 1].setVariety(buf.readLine());
  }
  public static void modification3(Dog dog[], int i, int n) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("原年齡：" + dog[i - 1].getAge() + "，欲修改為：");
    dog[i - 1].setAge(Integer.parseInt(buf.readLine()));
  }
  public static void main(String[] args) throws IOException {
    int age = 0, i = 0, n = 0;
    String name, variety;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入寵物數量：");
    n = Integer.parseInt(buf.readLine());
    Dog dog[] = new Dog[n];
    for (i = 0;i < n ;i++ ) {
      System.out.print("請輸入第" + (i + 1) + "位寵物名稱：");
      name = buf.readLine();
      System.out.print("請輸入第" + (i + 1) + "位寵物品種：");
      variety = buf.readLine();
      System.out.print("請輸入第" + (i + 1) + "位寵物年紀：");
      age = Integer.parseInt(buf.readLine());
      dog[i] = new Dog(name, variety, age);
    }
    function(dog,n);
  }
}