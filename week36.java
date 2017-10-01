import java.io.*;
public class week36{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("輸入攻擊數值:");
                         int attack = Integer.parseInt(buf.readLine()); 
                         System.out.print("輸入增益值:");
                         double buff = Double.parseDouble(buf.readLine());
                         int damage = (int)(attack*buff);
                         System.out.println("增益造成傷害值:"+damage);
                         System.out.print("增益運算結果:");
                         if(attack>0&&buff>0){
                               if(damage==2147483647&&attack!=1&&buff!=1){
                                      System.out.println("「overflow」");
                               }
                               else if(damage==0){
                                      System.out.println("「underflow」");
                               }
                               else
                                   System.out.println("「正常」");
                         }
                         else
                             System.out.println("輸入格式錯誤");
            }
}