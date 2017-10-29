import java.io.*;
public class week75{
  public static double input_score()throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J���������� : ");
    int scores = Integer.parseInt(buf.readLine());
    while(scores<=0||scores>=100){
      System.out.println("�z��~��J���O : " + scores + " �A��J�榡���~ �A�Э��s��J(0~100)�C");
      System.out.print("��J���������� : ");
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
    }
    return i;
  }
  public static void show(String name[],double score[],int n){
    System.out.println("�ǥͦW��\t�y��\t\t����");
    for (int i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
    }
    System.out.print("���\��J " + n + " ����� �A");
    System.out.println("�@�� " + (name.length - n) + " ����ƥ��Q��J�C");
  }
  public static void select(String name[],double score[],int n)throws IOException{
    int selection;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1.��ܤή�H�ƩM���ή�H��");
    System.out.println("2.��̰ܳ����y���Ωm�W");
    System.out.println("3.��̧ܳC���y���Ωm�W");
    System.out.println("4.�C�X�U�ӲնZ���H��");
    System.out.println("5.�C�X���ή檺�ǥͮy���Ωm�W");
    System.out.println("6.�ק�ǥͦ��Z");
    System.out.println("7.���}");
    System.out.print("�п�ܳB�z�覡 : ");
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
          System.out.println("�z��~��J���O : " + selection + "�A�Э��s��J(1~7)");
          break;
      }
      System.out.println("1.��ܤή�H�ƩM���ή�H��");
      System.out.println("2.��̰ܳ����y���Ωm�W");
      System.out.println("3.��̧ܳC���y���Ωm�W");
      System.out.println("4.�C�X�U�ӲնZ���H��");
      System.out.println("5.�C�X���ή檺�ǥͮy���Ωm�W");
      System.out.println("6.�ק�ǥͦ��Z");
      System.out.println("7.���}");
      System.out.print("�п�ܳB�z�覡 : ");
      selection = Integer.parseInt(buf.readLine());
    }
    System.out.println("�{������");
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
    System.out.println("�ή� : " + pass + "�A���ή� : " + fail);
    System.out.println("\t\t�ή�");
    if (pass!=0) {
      System.out.println("�ǥͦW��\t�y��\t\t����");
      for (int i=0;i<n ;i++ ) {
        if (score[i]>=60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t\t���ή�");
    if (fail!=0) {
      System.out.println("�ǥͦW��\t�y��\t\t����");
      for (int i=0;i<n ;i++ ) {
        if (score[i]<60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t\t " + (int)score[i]);
        }
      }
    }
  }
  public static void selection2(String name[],double score[],int n){
    int i,highest = 0;
    System.out.println("�̰����ǥͦW��\t�y��\t����");
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
    System.out.println("�̧C���ǥͦW��\t�y��\t����");
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
    System.out.println("\t�U�ӲնZ�H��");
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
    System.out.println("\t����(0~59)" + a0 + "�H");
    if (a0!=0) {
      System.out.println("�ǥͦW��\t�y��\t����");
      for (i=0;i<n ;i++ ) {
        if (score[i]<60) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t����(60~69)" + a1 + "�H");
    if (a1!=0) {
      System.out.println("�ǥͦW��\t�y��\t����");
      for (i=0;i<n ;i++ ) {
        if (score[i]<70&&score[i]>=60&&a1!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t����(70~79)" + a2 + "�H");
    if (a2!=0) {
      System.out.println("�ǥͦW��\t�y��\t����");
      for (i=0;i<n ;i++ ) {
        if (score[i]<80&&score[i]>=70&&a2!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t����(80~89)" + a3 + "�H");
    if (a3!=0) {
      System.out.println("�ǥͦW��\t�y��\t����");
      for (i=0;i<n ;i++ ) {
        if (score[i]<90&&score[i]>=80&&a3!=0) {
          System.out.println(" " + name[i] + "\t\t " + (i+1) + "\t " + (int)score[i]);
        }
      }
    }
    System.out.println("\t����(90~100)" + a4 + "�H");
    if (a4!=0) {
      System.out.println("�ǥͦW��\t�y��\t����");
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
    System.out.println("���ή�H�� : " + fail + "�H");
    System.out.println("�ǥͦW��\t�y��\t����");
    for (int i=0;i<n ;i++ ) {
      if (score[i]<60) {
        System.out.println(" " + name[i] + "\t\t  " + (i+1) + "\t " + (int)score[i]);
      }
    }
  }
  public static void selection6(String name[],double score[],int n)throws IOException{
    int i,m = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��J�n�ק令�Z���ǥͮy�� : ");
    i = Integer.parseInt(buf.readLine());
    System.out.print("�s���Z : ");
    score[i-1] = Integer.parseInt(buf.readLine());
    m++;
    System.out.print("�O�_�n�~��ק�(Y/N) : ");
    String select = buf.readLine();
    while (select.charAt(0) == 'Y'){
      System.out.print("��J�n�ק令�Z���ǥͮy�� : ");
      i = Integer.parseInt(buf.readLine());
      System.out.print("�s���Z : ");
      score[i-1] = Integer.parseInt(buf.readLine());
      m++;
      System.out.print("�O�_�n�~��ק�(Y/N) : ");
      select = buf.readLine();
    }
    if (select.charAt(0) != 'N') {
      System.out.println("�z��~��J���O : " + select + " �A�U���п�J(Y/N)");
    }
    System.out.println("�s��� : ");
    System.out.println("�ǥͦW��\t�y��\t����");
    for (i=0;i<n ;i++ ) {
      System.out.println(" " + name[i] + "\t\t  " + (i+1) + "\t " + (int)score[i]);
    }
    System.out.print("���\�ק�" + m + "�����");
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
    select(name,score,i);
  }
}