import java.io.*;
public class week43{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�J��� : ");
                         int month = Integer.parseInt(buf.readLine());
                         System.out.print("\n�п�J��� : ");
                         int date = Integer.parseInt(buf.readLine());
                         if(month>=1&&month<=12&&date>=1&&date<=31){
                               switch(month){
                                    case 1:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n�z���P�y�� : ���~�y");
                                          else if(date>=20&&date<=31)
                                                 System.out.print("\n�z���P�y�� : ���~�y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 2:
                                          if(date>=1&&date<=18)
                                                 System.out.print("\n�z���P�y�� : ���~�y");
                                          else if(date>=19&&date<=28)
                                                 System.out.print("\n�z���P�y�� : �����y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 3:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n�z���P�y�� : �����y");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n�z���P�y�� : �զϮy");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 4:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n�z���P�y�� : �զϮy");
                                          else if(date>=20&&date<=30)
                                                 System.out.print("\n�z���P�y�� : �����y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 5:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n�z���P�y�� : �����y");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n�z���P�y�� : ���l�y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 6:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n�z���P�y�� : ���l�y");
                                          else if(date>=22&&date<=30)
                                                 System.out.print("\n�z���P�y�� : ���ɮy");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 7:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n�z���P�y�� : ���ɮy");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n�z���P�y�� : ��l�y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 8:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n�z���P�y�� : ��l�y");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n�z���P�y�� : �B�k�y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 9:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n�z���P�y�� : �B�k�y");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n�z���P�y�� : �ѯ��y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 10:
                                          if(date>=1&&date<=23)
                                                 System.out.print("\n�z���P�y�� : �ѯ��y");
                                          else if(date>=24&&date<=31)
                                                 System.out.print("\n�z���P�y�� : ���Ȯy");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 11:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n�z���P�y�� : ���Ȯy");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n�z���P�y�� : �g��y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     case 12:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n�z���P�y�� : �g��y");
                                          else if(date>=22&&date<=31)
                                                 System.out.print("\n�z���P�y�� : �]�~�y");
                                          else 
                                                 System.out.print("\n�п�J���T�����");
                                          break;
                                     default:
                                          System.out.print("\n�п�J���T�����");
                                          break;
                               }
                         }
                         else
                               System.out.println("\n�п�J���T�����");
            }
}