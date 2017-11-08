import java.io.*;
public class week94{
  public static void main(String[] args)throws IOException{
    Student scores = new Student();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入姓名 : ");
    scores.set_name(buf.readLine());
    System.out.print("請輸入平時成績 : ");
    scores.set_usual_score(Integer.parseInt(buf.readLine()));
    System.out.print("請輸入期中考成績 : ");
    scores.set_mid_score(Integer.parseInt(buf.readLine()));
    System.out.print("請輸入期末考成績 : ");
    scores.set_final_score(Integer.parseInt(buf.readLine()));
    scores.print();
  }
}
class Student{
  private String name;
  private int usual_score, mid_score, final_score;
  public void set_name(String str){
    name = str;
  }
  public void set_usual_score(int num)throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    if (num >= 0&&num <= 100) {
      usual_score = num;
    }
    else{
      while (num < 0||num >100) {
        System.out.print("您剛才輸入的是 : " + num + "，請重新輸入(0~100) : ");
        num = Integer.parseInt(buf.readLine());
      }
      usual_score = num;
    }
  }
  public void set_mid_score(int num)throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    if (num >= 0&&num <= 100) {
      mid_score = num;
    }
    else{
      while (num < 0||num >100) {
        System.out.print("您剛才輸入的是 : " + num + "，請重新輸入(0~100) : ");
        num = Integer.parseInt(buf.readLine());
      }
      mid_score = num;
    }
  }
  public void set_final_score(int num)throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    if (num >= 0&&num <= 100) {
      final_score = num;
    }
    else{
      while (num < 0||num >100) {
        System.out.print("您剛才輸入的是 : " + num + "，請重新輸入(0~100) : ");
        num = Integer.parseInt(buf.readLine());
      }
      final_score = num;
    }
  }
  public String get_name(){
    return name;
  }
  public int get_usual_score(){
    return usual_score;
  }
  public int get_mid_score(){
    return mid_score;
  }
  public int get_final_score(){
    return final_score;
  }
  public double get_overall_score(){
    return usual_score*0.3 + mid_score*0.3 + final_score*0.4;
  }
  public void print(){
    System.out.println("學生 : " + get_name());
    System.out.println("平時成績 : " + get_usual_score());
    System.out.println("期中考成績 : " + get_mid_score());
    System.out.println("期末考成績 : " + get_final_score());
    System.out.println("期末總成績 : " + get_overall_score());
  }
}