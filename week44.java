import java.io.*;
public class week44{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("��J���t���� : ");
                         int speed = Integer.parseInt(buf.readLine());
                         if(speed<8||speed>17){
                               do{
                                      System.out.print("�п�J����8��17���������\n��J���t���� : ");
                                      speed = Integer.parseInt(buf.readLine());
                                 }while(speed<8||speed>17);
                         }
                         System.out.print("���t����"+speed+"�� : ");
                         if(speed>=8&&speed<=11)
                                System.out.print("���׻䭷");
                         else if(speed>=12&&speed<=15)
                                System.out.print("���׻䭷");
                         else
                                System.out.print("�j�P�䭷");
            }
}