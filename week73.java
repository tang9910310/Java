import java.io.*;
public class week73{
  public static double input_score()throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�`���������� : ");
    int scores = Integer.parseInt(buf.readLine());
    while(scores<=0||scores>=100){
      System.out.println("�z��~��J���O : " + scores + " �A��J�榡���~ �A�Э��s��J(0~100)�C");
      System.out.print("��J�`���������� : ");
      scores = Integer.parseInt(buf.readLine());
    }
    return scores;
  }
  public static int input_data(String name[],double score[])throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    for (int i=0;i<name.length ;i++ ) {
      System.out.print("��J�ǥͦW�� : ");
      name[i] = buf.readLine();
      score[i] = input_score();
    }
    return name.length;
  }
  public static void show(String name[],double score[]){
    System.out.println("�ǥͦW��\t�`����");
    for (int i=0;i<name.length ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (int)score[i]);
    }
  }
  public static void main(String[] args)throws IOException{
    int n;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�ǥͤH�� : ");
    n = Integer.parseInt(buf.readLine());
    double score[] = new double [n];
    String name[] = new String [n];
    input_data(name,score);
    show(name,score);
  }
}




