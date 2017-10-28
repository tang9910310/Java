import java.io.*;
public class week73{
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
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    for (int i=0;i<name.length ;i++ ) {
      System.out.print("輸入學生名稱 : ");
      name[i] = buf.readLine();
      score[i] = input_score();
    }
    return name.length;
  }
  public static void show(String name[],double score[]){
    System.out.println("學生名稱\t總平均");
    for (int i=0;i<name.length ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (int)score[i]);
    }
  }
  public static void main(String[] args)throws IOException{
    int n;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("輸入學生人數 : ");
    n = Integer.parseInt(buf.readLine());
    double score[] = new double [n];
    String name[] = new String [n];
    input_data(name,score);
    show(name,score);
  }
}




