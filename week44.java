import java.io.*;
public class week44{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("輸入風速等級 : ");
                         int speed = Integer.parseInt(buf.readLine());
                         if(speed<8||speed>17){
                               do{
                                      System.out.print("請輸入介於8至17之間的整數\n輸入風速等級 : ");
                                      speed = Integer.parseInt(buf.readLine());
                                 }while(speed<8||speed>17);
                         }
                         System.out.print("風速等級"+speed+"為 : ");
                         if(speed>=8&&speed<=11)
                                System.out.print("輕度颱風");
                         else if(speed>=12&&speed<=15)
                                System.out.print("中度颱風");
                         else
                                System.out.print("強烈颱風");
            }
}