import java.io.*;
public class week64{
    public static void student(int n)throws IOException{
      int i,j,max=0,min=100,a0=0,a1=0,a2=0,a3=0,a4=0;
      int a[][] = new int [n][4];
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      for(i=1;i<=n;i++){
        System.out.println("��"+i+"�H���Z :");
        System.out.print("�п�J��"+i+"�H���ɦ��Z :");
        a[i-1][0] = Integer.parseInt(buf.readLine());
        System.out.print("�п�J��"+i+"�H�������Z :");
        a[i-1][1] = Integer.parseInt(buf.readLine());
        System.out.print("�п�J��"+i+"�H�������Z :");
        a[i-1][2] = Integer.parseInt(buf.readLine());
        a[i-1][3] = (int)(a[i-1][0]*0.3+a[i-1][1]*0.35+a[i-1][2]*0.35);
      }
      for(i=1;i<=n;i++){
        System.out.println("��"+i+"�H���Z :");
        System.out.print("���ɦ��Z : "+a[i-1][0]);
        System.out.print("\t�������Z : "+a[i-1][1]);
        System.out.print("\t�������Z : "+a[i-1][2]);
        System.out.println("\t�Ǵ����Z : "+a[i-1][3]);
      }
      for(i=1;i<=n;i++){
        if (a[i-1][3]<60) {
          System.out.println("��"+i+"�H���Z���ή�A�L���Ǵ����Z �G"+a[i-1][3]);
        }
      }
      System.out.println("�U�ӦҸժ��նZ");
      for (j=0;j<4;j++) {
        if (j==0) {
          System.out.print("���ɦ��Z : ");
        }
        else if (j==1) {
          System.out.print("\n�������Z : ");
        }
        else if (j==2) {
          System.out.print("\n�������Z : ");
        }
        else
          System.out.print("\n�Ǵ����Z : ");
        for (i=0;i<n;i++) {
          if (a[i][j]<60) {
            a0++;
          }
          else if (a[i][j]<70) {
            a1++;
          }
          else if (a[i][j]<80) {
            a2++;
          }
          else if (a[i][j]<90) {
            a3++;
          }
          else if (a[i][j]<=100) {
            a4++;
          }
        }
        if (a0!=0) {
          System.out.print("0~59 : "+a0+"�H");
        }
        if (a1!=0) {
          System.out.print(" �A 60~69 : "+a1+"�H");
        }
        if (a2!=0) {
          System.out.print(" �A 70~79 : "+a2+"�H");
        }  
        if (a3!=0) {
          System.out.print(" �A 80~89 : "+a3+"�H");
        }
        if (a4!=0) {
          System.out.print(" �A 90~100 : "+a4+"�H");
        }
        a0=0;
        a1=0;
        a2=0;
        a3=0;
        a4=0;
      }
      System.out.print("\n�п�J�z�Q�n�d�ߪ��ĴX��ǥͦ��Z : ");  
      i = Integer.parseInt(buf.readLine());
      System.out.println("���ɦ��Z : "+a[i-1][0]+"�������Z : "+a[i-1][1]+"�������Z : "+a[i-1][2]+"�Ǵ����Z : "+a[i-1][3]);
      System.out.print("�O�_�~��d�߾ǥͦ��Z(Y/N) : ");
      String select = buf.readLine(); 
      do{
        System.out.print("�п�J�z�Q�n�d�ߪ��ĴX��ǥͦ��Z : ");  
        i = Integer.parseInt(buf.readLine());
        System.out.println("���ɦ��Z : "+a[i-1][0]+"�������Z : "+a[i-1][1]+"�������Z : "+a[i-1][2]+"�Ǵ����Z : "+a[i-1][3]);
        System.out.print("�O�_�~��d�߾ǥͦ��Z(Y/N) : ");
        select = buf.readLine();
      }while(select.charAt(0)=='Y');
      System.out.println("�����{��");
      System.out.print("�п�J�z�Q�n�d�ߦ��Z���̰��γ̧C���Aa�G���ɦ��Z�Bb�G�������Z�Bc�G�������Z�Bd�G�Ǵ����Z : ");
      String selection = buf.readLine();
      switch(selection){
        case "a" :
          for (i=0;i<n;i++ ) {
            if (max<a[i][0]) {
              max = a[i][0];
            }
            if (min>a[i][0]) {
              min = a[i][0];
            }
          }
          System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
          break;
        case "b" :
          for (i=0;i<n;i++ ) {
            if (max<a[i][1]) {
              max = a[i][1];
            }
            if (min>a[i][1]) {
              min = a[i][1];
            }
          }
          System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
          break;
        case "c" :
          for (i=0;i<n;i++ ) {
            if (max<a[i][2]) {
              max = a[i][2];
            }
            if (min>a[i][2]) {
              min = a[i][2];
            }
          }
          System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
          break;
        case "d" :
          for (i=0;i<n;i++ ) {
            if (max<a[i][3]) {
              max = a[i][3];
            }
            if (min>a[i][3]) {
              min = a[i][3];
            }
          }
          System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
          break;
        default:
          System.out.println("�z��~��J���O : "+selection+" �A �п�Ja~d���������T�ﶵ");
          break;
      }
      max=0;
      min=100;
      System.out.print("�O�_�~��d�߾ǥͦ��Z(Y/N) : ");
      select = buf.readLine();
      do{
        max=0;
        min=100;
        System.out.print("�п�J�z�Q�n�d�ߦ��Z���̰��γ̧C���Aa�G���ɦ��Z�Bb�G�������Z�Bc�G�������Z�Bd�G�Ǵ����Z : ");
        selection = buf.readLine();
        switch(selection){
          case "a" :
            for (i=0;i<n;i++ ) {
              if (max<a[i][0]) {
                max = a[i][0];
              }
              if (min>a[i][0]) {
                min = a[i][0];
              }
            }
            System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
            break;
          case "b" :
            for (i=0;i<n;i++ ) {
              if (max<a[i][1]) {
                max = a[i][1];
              }
              if (min>a[i][1]) {
                min = a[i][1];
              }
            }
            System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
            break;
          case "c" :
            for (i=0;i<n;i++ ) {
              if (max<a[i][2]) {
                max = a[i][2];
              }
              if (min>a[i][2]) {
                min = a[i][2];
              }
            }
            System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
            break;
          case "d" :
            for (i=0;i<n;i++ ) {
              if (max<a[i][3]) {
                max = a[i][3];
              }
              if (min>a[i][3]) {
                min = a[i][3];
              }
            }
            System.out.println("�̰��� : "+max+" �A �̧C�� : "+min);
            break;
          default:
            System.out.println("�z��~��J���O : "+selection+" �A �п�Ja~d���������T�ﶵ");
            break;
        }
        System.out.print("�O�_�~��d�߾ǥͦ��Z(Y/N) : ");
        select = buf.readLine();
      }while(select.charAt(0)=='Y');
      System.out.println("�����{��");
    }
    public static void main(String[] args)throws IOException{
      int n;
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("�п�J�ǥͤH�� : ");
      n = Integer.parseInt(buf.readLine());
      student(n);
    }
}
