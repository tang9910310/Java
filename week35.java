import java.io.*;
public class week35{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�JTOEIC���Z:");
                         int scores = Integer.parseInt(buf.readLine()); 
                        
                         if(scores%5==0){
                               if(10<=scores&&scores<=990){
                                      if(scores>=860){
                                             System.out.println("�ҷ��C��:����");
                                      }
                                      else if(scores>=730){
                                             System.out.println("�ҷ��C��:�Ŧ�");
                                      }
                                      else if(scores>=470){
                                             System.out.println("�ҷ��C��:���");
                                      }
                                      else if(scores>=220){
                                             System.out.println("�ҷ��C��:�Ħ�");
                                      }
                                      else 
                                          System.out.println("�ҷ��C��:���");
                                                   
                               }
                               else
                                   System.out.println("��J�榡���~");
                         }
                         else
                             System.out.println("��J�榡���~");
            }
}