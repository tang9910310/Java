import java.io.*;
public class week75{
  public static double input_score()throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入平均的分數 : ");
    int scores = Integer.parseInt(buf.readLine());
    while(scores<=0||scores>=100){
      System.out.println("您剛才輸入的是 : " + scores + " ，輸入格式錯誤 ，請重新輸入(0~100)。");
      System.out.print("輸入平均的分數 : ");
      scores = Integer.parseInt(buf.readLine());
    }
    return scores;
  }
  public static int input_data(String name[],double score[])throws IOException{
    int i = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入學生名稱 : ");
    name[i] = buf.readLine();
    score[i] = input_score();
    i++;
    System.out.print("是否繼續輸入成績(Y/N) : ");
    String select = buf.readLine();
    while (select.charAt(0) == 'Y'){
      System.out.print("輸入學生名稱 : ");
      name[i] = buf.readLine();
      score[i] = input_score();
      i++;
      System.out.print("是否繼續輸入成績(Y/N) : ");
      select = buf.readLine();
    }
    if (select.charAt(0) != 'N') {
      System.out.println("您剛才輸入的是 : " + select + " ，下次請輸入(Y/N)");
    }
    return i;
  }
  public static void show(String name[],double score[],int n){
    System.out.println("學生名稱\t座號\t\t平均");
    for (int i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
    }
    System.out.print("成功輸入 " + n + " 筆資料 ，");
    System.out.println("共有 " + (name.length - n) + " 筆資料未被輸入。");
  }
  public static void select(String name[],double score[],int n)throws IOException{
    int selection;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1.顯示及格人數和不及格人數");
    System.out.println("2.顯示最高分座號及姓名");
    System.out.println("3.顯示最低分座號及姓名");
    System.out.println("4.列出各個組距的人數");
    System.out.println("5.列出不及格的學生座號及姓名");
    System.out.println("6.修改學生成績");
    System.out.println("7.離開");
    System.out.print("請選擇處理方式 : ");
    selection = Integer.parseInt(buf.readLine());
    while(selection!=7){
      switch(selection){
        case 1 :
          selection1(name,score,n);
          break;
        case 2 :
          selection2(name,score,n);
          break;
        case 3 :
          selection3(name,score,n);
          break;
        case 4 :
          selection4(name,score,n);
          break;
        case 5 :
          selection5(name,score,n);
          break;
        case 6 :
          selection6(name,score,n);
          break;
        case 7 :
          break;
        default :
          System.out.println("您剛才輸入的是 : " + selection + "，請重新輸入(1~7)");
          break;
      }
      System.out.println("1.顯示及格人數和不及格人數");
      System.out.println("2.顯示最高分座號及姓名");
      System.out.println("3.顯示最低分座號及姓名");
      System.out.println("4.列出各個組距的人數");
      System.out.println("5.列出不及格的學生座號及姓名");
      System.out.println("6.修改學生成績");
      System.out.println("7.離開");
      System.out.print("請選擇處理方式 : ");
      selection = Integer.parseInt(buf.readLine());
    }
    System.out.println("程式結束");
  }
  public static void selection1(String name[],double score[],int n){
    int pass = 0, fail = 0;
    for (int i=0;i<n ;i++ ) {
      if (score[i]>=60) {
        pass++;
      }
      else{
        fail++;
      }
    }
    System.out.println("及格 : " + pass + "，不及格 : " + fail);
    System.out.println("\t\t及格");
    if (pass!=0) {
      System.out.println("學生名稱\t座號\t\t平均");
      for (int i=0;i<n ;i++ ) {
        if (score[i]>=60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t\t不及格");
    if (fail!=0) {
      System.out.println("學生名稱\t座號\t\t平均");
      for (int i=0;i<n ;i++ ) {
        if (score[i]<60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
        }
      }
    }
  }
  public static void selection2(String name[],double score[],int n){
    int i,highest = 0;
    System.out.println("最高分學生名稱\t座號\t平均");
    for (i=0;i<n ;i++ ) {
      if ((int)score[i]>highest) {
        highest = (int)score[i];
      }
    }
    for (i=0;i<n ;i++ ) {
      if ((int)score[i] == highest) {
        System.out.println(" \t" + name[i] + "\t " + (i+1) + "\t " + (int)score[i]);
      }
    }
  }
  public static void selection3(String name[],double score[],int n){
    int i,lowest = 100;
    System.out.println("最低分學生名稱\t座號\t平均");
    for (i=0;i<n ;i++ ) {
      if ((int)score[i]<lowest) {
        lowest = (int)score[i];
      }
    }
    for (i=0;i<n ;i++ ) {
      if ((int)score[i] == lowest) {
        System.out.println(" \t" + name[i] + "\t " + (i+1) + "\t " + (int)score[i]);
      }
    }
  }
  public static void selection4(String name[],double score[],int n){
    int i,a0 = 0,a1 = 0,a2 = 0,a3 = 0,a4 = 0;
    System.out.println("\t各個組距人數");
    for (i=0;i<n ;i++ ) {
      if (score[i]<60) {
        a0++;
      }
      else if (score[i]<70) {
        a1++;
      }
      else if (score[i]<80) {
        a2++;
      }
      else if (score[i]<90) {
        a3++;
      }
      else if (score[i]<=100) {
        a4++;
      }
    }
    System.out.println("\t分數(0~59)" + a0 + "人");
    if (a0!=0) {
      System.out.println("學生名稱\t座號\t平均");
      for (i=0;i<n ;i++ ) {
        if (score[i]<60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t分數(60~69)" + a1 + "人");
    if (a1!=0) {
      System.out.println("學生名稱\t座號\t平均");
      for (i=0;i<n ;i++ ) {
        if (score[i]<70&&score[i]>=60&&a1!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t分數(70~79)" + a2 + "人");
    if (a2!=0) {
      System.out.println("學生名稱\t座號\t平均");
      for (i=0;i<n ;i++ ) {
        if (score[i]<80&&score[i]>=70&&a2!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t分數(80~89)" + a3 + "人");
    if (a3!=0) {
      System.out.println("學生名稱\t座號\t平均");
      for (i=0;i<n ;i++ ) {
        if (score[i]<90&&score[i]>=80&&a3!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t分數(90~100)" + a4 + "人");
    if (a4!=0) {
      System.out.println("學生名稱\t座號\t平均");
      for (i=0;i<n ;i++ ) {
        if (score[i]>=90&&a4!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
  }
  public static void selection5(String name[],double score[],int n){
    int fail = 0;
    for (int i=0;i<n ;i++ ) {
      if (score[i]<60) {
        fail++;
      }
    }
    System.out.println("不及格人數 : " + fail + "人");
    System.out.println("學生名稱\t座號\t平均");
    for (int i=0;i<n ;i++ ) {
      if (score[i]<60) {
        System.out.println(" " + name[i] + "\t\t  " + (i+1) + "\t " + (int)score[i]);
      }
    }
  }
  public static void selection6(String name[],double score[],int n)throws IOException{
    int i,m = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入要修改成績的學生座號 : ");
    i = Integer.parseInt(buf.readLine());
    System.out.print("新成績 : ");
    score[i-1] = Integer.parseInt(buf.readLine());
    m++;
    System.out.print("是否要繼續修改(Y/N) : ");
    String select = buf.readLine();
    while (select.charAt(0) == 'Y'){
      System.out.print("輸入要修改成績的學生座號 : ");
      i = Integer.parseInt(buf.readLine());
      System.out.print("新成績 : ");
      score[i-1] = Integer.parseInt(buf.readLine());
      m++;
      System.out.print("是否要繼續修改(Y/N) : ");
      select = buf.readLine();
    }
    if (select.charAt(0) != 'N') {
      System.out.println("您剛才輸入的是 : " + select + " ，下次請輸入(Y/N)");
    }
    System.out.println("新資料 : ");
    System.out.println("學生名稱\t座號\t平均");
    for (i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t  " + (i+1) + "\t " + (int)score[i]);
    }
    System.out.print("成功修改" + m + "筆資料");
  }
  public static void main(String[] args)throws IOException{
    int n,i;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入學生人數 : ");
    n = Integer.parseInt(buf.readLine());
    double score[] = new double [n];
    String name[] = new String [n];
    i = input_data(name,score);
    show(name,score,i);
    select(name,score,i);
  }
}