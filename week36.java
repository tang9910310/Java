import java.io.*;
public class week36{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("��J�����ƭ�:");
                         int attack = Integer.parseInt(buf.readLine()); 
                         System.out.print("��J�W�q��:");
                         double buff = Double.parseDouble(buf.readLine());
                         int damage = (int)(attack*buff);
                         System.out.println("�W�q�y���ˮ`��:"+damage);
                         System.out.print("�W�q�B�⵲�G:");
                         if(attack>0&&buff>0){
                               if(damage==2147483647&&attack!=1&&buff!=1){
                                      System.out.println("�uoverflow�v");
                               }
                               else if(damage==0){
                                      System.out.println("�uunderflow�v");
                               }
                               else
                                   System.out.println("�u���`�v");
                         }
                         else
                             System.out.println("��J�榡���~");
            }
}