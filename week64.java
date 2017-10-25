import java.io.*;
public class week64{
    public static void student(int n)throws IOException{
      int i,j,max=0,min=100,a0=0,a1=0,a2=0,a3=0,a4=0;
      int a[][] = new int [n][4];
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      for(i=1;i<=n;i++){
        System.out.println("第"+i+"人成績 :");
        System.out.print("請輸入第"+i+"人平時成績 :");
        a[i-1][0] = Integer.parseInt(buf.readLine());
        System.out.print("請輸入第"+i+"人期中成績 :");
        a[i-1][1] = Integer.parseInt(buf.readLine());
        System.out.print("請輸入第"+i+"人期末成績 :");
        a[i-1][2] = Integer.parseInt(buf.readLine());
        a[i-1][3] = (int)(a[i-1][0]*0.3+a[i-1][1]*0.35+a[i-1][2]*0.35);
      }
      for(i=1;i<=n;i++){
        System.out.println("第"+i+"人成績 :");
        System.out.print("平時成績 : "+a[i-1][0]);
        System.out.print("\t期中成績 : "+a[i-1][1]);
        System.out.print("\t期末成績 : "+a[i-1][2]);
        System.out.println("\t學期成績 : "+a[i-1][3]);
      }
      for(i=1;i<=n;i++){
        if (a[i-1][3]<60) {
          System.out.println("第"+i+"人成績不及格，他的學期成績 ："+a[i-1][3]);
        }
      }
      System.out.println("各個考試的組距");
      for (j=0;j<4;j++) {
        if (j==0) {
          System.out.print("平時成績 : ");
        }
        else if (j==1) {
          System.out.print("\n期中成績 : ");
        }
        else if (j==2) {
          System.out.print("\n期末成績 : ");
        }
        else
          System.out.print("\n學期成績 : ");
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
          System.out.print("0~59 : "+a0+"人");
        }
        if (a1!=0) {
          System.out.print(" ， 60~69 : "+a1+"人");
        }
        if (a2!=0) {
          System.out.print(" ， 70~79 : "+a2+"人");
        }  
        if (a3!=0) {
          System.out.print(" ， 80~89 : "+a3+"人");
        }
        if (a4!=0) {
          System.out.print(" ， 90~100 : "+a4+"人");
        }
        a0=0;
        a1=0;
        a2=0;
        a3=0;
        a4=0;
      }
      System.out.print("\n請輸入您想要查詢的第幾位學生成績 : ");  
      i = Integer.parseInt(buf.readLine());
      System.out.println("平時成績 : "+a[i-1][0]+"期中成績 : "+a[i-1][1]+"期末成績 : "+a[i-1][2]+"學期成績 : "+a[i-1][3]);
      System.out.print("是否繼續查詢學生成績(Y/N) : ");
      String select = buf.readLine(); 
      do{
        System.out.print("請輸入您想要查詢的第幾位學生成績 : ");  
        i = Integer.parseInt(buf.readLine());
        System.out.println("平時成績 : "+a[i-1][0]+"期中成績 : "+a[i-1][1]+"期末成績 : "+a[i-1][2]+"學期成績 : "+a[i-1][3]);
        System.out.print("是否繼續查詢學生成績(Y/N) : ");
        select = buf.readLine();
      }while(select.charAt(0)=='Y');
      System.out.println("結束程式");
      System.out.print("請輸入您想要查詢成績的最高及最低分，a：平時成績、b：期中成績、c：期末成績、d：學期成績 : ");
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
          System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
          System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
          System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
          System.out.println("最高分 : "+max+" ， 最低分 : "+min);
          break;
        default:
          System.out.println("您剛才輸入的是 : "+selection+" ， 請輸入a~d之間的正確選項");
          break;
      }
      max=0;
      min=100;
      System.out.print("是否繼續查詢學生成績(Y/N) : ");
      select = buf.readLine();
      do{
        max=0;
        min=100;
        System.out.print("請輸入您想要查詢成績的最高及最低分，a：平時成績、b：期中成績、c：期末成績、d：學期成績 : ");
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
            System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
            System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
            System.out.println("最高分 : "+max+" ， 最低分 : "+min);
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
            System.out.println("最高分 : "+max+" ， 最低分 : "+min);
            break;
          default:
            System.out.println("您剛才輸入的是 : "+selection+" ， 請輸入a~d之間的正確選項");
            break;
        }
        System.out.print("是否繼續查詢學生成績(Y/N) : ");
        select = buf.readLine();
      }while(select.charAt(0)=='Y');
      System.out.println("結束程式");
    }
    public static void main(String[] args)throws IOException{
      int n;
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("請輸入學生人數 : ");
      n = Integer.parseInt(buf.readLine());
      student(n);
    }
}
