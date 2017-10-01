import java.io.*;
public class week33{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入西元年份:");
                         int year = Integer.parseInt(buf.readLine()); 
                         
                         if(year%4==0){
                               if(year%100==0&&year%400!=0){
                                      System.out.println("西元"+year+"不是閨年");
                               }
                               else
                                    System.out.println("西元"+year+"是閨年");
                         }
                         else
                              System.out.println("西元"+year+"不是閨年");
            }
}