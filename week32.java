import java.io.*;
public class week32{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("月餅單價為:");
                         int price = Integer.parseInt(buf.readLine()); 
                         System.out.print("\n請輸入欲購買月餅數量:");
                         int numbers = Integer.parseInt(buf.readLine());
                         System.out.print("\n請輸入付款金額:");
                         int pay = Integer.parseInt(buf.readLine());
                         if(pay>=price*numbers){
                               System.out.println("\n實付金額:"+pay+"，應付金額:"+price*numbers+"，找零:"+(pay-price*numbers));
                         }
                         else
                               System.out.println("\n付款金額不足");
            }
}