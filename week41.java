import java.io.*;
public class week41{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�J�d�򪺳̤p�� : ");
                         int min = Integer.parseInt(buf.readLine());
                         System.out.print("\n�п�J�d�򪺳̤j�� : ");
                         int max = Integer.parseInt(buf.readLine());
                         System.out.print("\n�п�J�n�M�䪺���ƪ���� : ");
                         int base = Integer.parseInt(buf.readLine());
                         System.out.print("\n"+base+"�����Ƭ� : ");
                         while(min<=max){
                               if(min%base==0)
                                      System.out.print(min+" ");
                               min++;
                         }
            }
}