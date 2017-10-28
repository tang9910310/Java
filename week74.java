import java.io.*;
public class week74{
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
    int i = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�ǥͦW�� : ");
    name[i] = buf.readLine();
    score[i] = input_score();
    i++;
    System.out.print("�O�_�~���J���Z(Y/N) : ");
    String select = buf.readLine();
    while (select.charAt(0) == 'Y'){
      System.out.print("��J�ǥͦW�� : ");
      name[i] = buf.readLine();
      score[i] = input_score();
      i++;
      System.out.print("�O�_�~���J���Z(Y/N) : ");
      select = buf.readLine();
    }
    if (select.charAt(0) != 'N') {
      System.out.println("�z��~��J���O : " + select + " �A�U���п�J(Y/N)");
      System.out.println("�{������");
    }
    return i;
  }
  public static void show(String name[],double score[],int n){
    System.out.println("�ǥͦW��\t�`����");
    for (int i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (int)score[i]);
    }
    System.out.print("���\��J " + n + " ����� �A");
    System.out.println("�@�� " + (name.length - n) + " ����ƥ��Q��J�C");
  }
  public static void main(String[] args)throws IOException{
    int n,i;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�ǥͤH�� : ");
    n = Integer.parseInt(buf.readLine());
    double score[] = new double [n];
    String name[] = new String [n];
    i = input_data(name,score);
    show(name,score,i);
  }
}





