import java.io.*;
public class week46{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         int sum=0;
                         System.out.print("�п�ܥ\��(1.���ڡB2.�s�ڡB3.�d�߾l�B�B4.���}) : ");
                         int function = Integer.parseInt(buf.readLine());
                         while(function!=4){
                               switch(function){
                                    case 1:
                                         System.out.print("�п�J���ڪ��B : ");
                                         int withdrawal = Integer.parseInt(buf.readLine());
                                         if(sum>=withdrawal){
                                                 sum = sum-withdrawal;
                                                 System.out.println("���ڦ��\�A�ثe�l�B : "+sum);
                                         }
                                         else
                                                 System.out.println("���B�����A�ثe�l�B : "+sum);
                                         break;
                                    case 2:
                                         System.out.print("�п�J�s�ڪ��B : ");
                                         int deposit = Integer.parseInt(buf.readLine());
                                         sum = sum+deposit;
                                         System.out.println("�s�ڦ��\�A�ثe�l�B : "+sum);
                                         break;
                                    case 3:
                                         System.out.println("�ثe�l�B : "+sum);
                                         break;
                                    case 4:
                                         System.out.println("�P�±z���ϥΡA�w��U�������{�C");
                                         break;
                                    default:
                                         System.out.println("��J���~�A�S�����\��A�Э��s��J�C");
                                         break;
                               }
                               System.out.print("�п�ܥ\��(1.���ڡB2.�s�ڡB3.�d�߾l�B�B4.���}) : ");
                               function = Integer.parseInt(buf.readLine());
                         }
                         if(function==4){
                                System.out.println("�P�±z���ϥΡA�w��U�������{�C");
                         }
                         
            }
}