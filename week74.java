import java.io.*;
public class week74{
  public static double input_score()throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入總平均的分數 : ");
    int scores = Integer.parseInt(buf.readLine());
    while(scores<=0||scores>=100){
      System.out.println("您剛才輸入的是 : " + scores + " ，輸入格式錯誤 ，請重新輸入(0~100)。");
      System.out.print("輸入總平均的分數 : ");
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
      System.out.println("程式結束");
    }
    return i;
  }
  public static void show(String name[],double score[],int n){
    System.out.println("學生名稱\t總平均");
    for (int i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (int)score[i]);
    }
    System.out.print("成功輸入 " + n + " 筆資料 ，");
    System.out.println("共有 " + (name.length - n) + " 筆資料未被輸入。");
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
  }
}





