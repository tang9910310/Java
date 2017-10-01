import java.io.*;
public class week34{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入秒數:");
                         int second = Integer.parseInt(buf.readLine()); 
                         int day = second/86400;
                         int hr = second%86400/3600;
                         int min = second%86400%3600/60;
                         int sec = second%86400%3600%60;
                         System.out.print("\n一共經過了:");
                         if(day!=0){
                               System.out.print(day+"天");
                          }
                          if(hr!=0){
                               System.out.print(hr+"小時");
                          }
                          if(min!=0){
                               System.out.print(min+"分鐘");
                          }
                          if(sec!=0){
                               System.out.print(sec+"秒");
                          }
            }
}