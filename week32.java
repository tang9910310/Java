import java.io.*;
public class week32{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�������:");
                         int price = Integer.parseInt(buf.readLine()); 
                         System.out.print("\n�п�J���ʶR���ƶq:");
                         int numbers = Integer.parseInt(buf.readLine());
                         System.out.print("\n�п�J�I�ڪ��B:");
                         int pay = Integer.parseInt(buf.readLine());
                         if(pay>=price*numbers){
                               System.out.println("\n��I���B:"+pay+"�A���I���B:"+price*numbers+"�A��s:"+(pay-price*numbers));
                         }
                         else
                               System.out.println("\n�I�ڪ��B����");
            }
}