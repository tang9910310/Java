import java.io.*;
public class week34{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�J���:");
                         int second = Integer.parseInt(buf.readLine()); 
                         int day = second/86400;
                         int hr = second%86400/3600;
                         int min = second%86400%3600/60;
                         int sec = second%86400%3600%60;
                         System.out.print("\n�@�@�g�L�F:");
                         if(day!=0){
                               System.out.print(day+"��");
                          }
                          if(hr!=0){
                               System.out.print(hr+"�p��");
                          }
                          if(min!=0){
                               System.out.print(min+"����");
                          }
                          if(sec!=0){
                               System.out.print(sec+"��");
                          }
            }
}