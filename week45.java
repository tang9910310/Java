import java.io.*;
public class week45{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         int m = (int)(Math.random()*60)+1;
                         System.out.println("�I�쪺���X�� : "+m);
                         System.out.print("�O�_�~���I�W(Y/N) : ");
                         String selection = buf.readLine();
                         if(selection.charAt(0)=='Y'){
                                 do{
                                      m = (int)(Math.random()*60)+1;
                                      if(m==3||m==31||m==35||m==46||m==47||m==57)
                                                continue;
                                      System.out.println("�I�쪺���X�� : "+m);
                                      System.out.print("�O�_�~���I�W(Y/N) : ");
                                      selection = buf.readLine();
                                 }while(selection.charAt(0)=='Y');
                                 if(selection.charAt(0)=='N')
                                        System.out.println("�{������");
                                 else
                                        System.out.println("�z��~��J���O : "+selection+"\n�Э��s��J");
                         }
                         else if(selection.charAt(0)=='N')
                                 System.out.println("�{������");
                         else
                                 System.out.println("�z��~��J���O : "+selection+"\n�Э��s��J");
            }
}