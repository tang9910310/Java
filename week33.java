import java.io.*;
public class week33{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�J�褸�~��:");
                         int year = Integer.parseInt(buf.readLine()); 
                         
                         if(year%4==0){
                               if(year%100==0&&year%400!=0){
                                      System.out.println("�褸"+year+"���O�Ӧ~");
                               }
                               else
                                    System.out.println("�褸"+year+"�O�Ӧ~");
                         }
                         else
                              System.out.println("�褸"+year+"���O�Ӧ~");
            }
}