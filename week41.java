import java.io.*;
public class week41{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入範圍的最小數 : ");
                         int min = Integer.parseInt(buf.readLine());
                         System.out.print("\n請輸入範圍的最大數 : ");
                         int max = Integer.parseInt(buf.readLine());
                         System.out.print("\n請輸入要尋找的倍數的基值 : ");
                         int base = Integer.parseInt(buf.readLine());
                         System.out.print("\n"+base+"的倍數為 : ");
                         while(min<=max){
                               if(min%base==0)
                                      System.out.print(min+" ");
                               min++;
                         }
            }
}