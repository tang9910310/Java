import java.io.*;
public class week43{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("½Ğ¿é¤J¤ë¥÷ : ");
                         int month = Integer.parseInt(buf.readLine());
                         System.out.print("\n½Ğ¿é¤J¤é´Á : ");
                         int date = Integer.parseInt(buf.readLine());
                         if(month>=1&&month<=12&&date>=1&&date<=31){
                               switch(month){
                                    case 1:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n±zªº¬P®y¬° : ¼¯½~®y");
                                          else if(date>=20&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤ô²~®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 2:
                                          if(date>=1&&date<=18)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤ô²~®y");
                                          else if(date>=19&&date<=28)
                                                 System.out.print("\n±zªº¬P®y¬° : Âù³½®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 3:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n±zªº¬P®y¬° : Âù³½®y");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : ¥Õ¦Ï®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 4:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n±zªº¬P®y¬° : ¥Õ¦Ï®y");
                                          else if(date>=20&&date<=30)
                                                 System.out.print("\n±zªº¬P®y¬° : ª÷¤û®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 5:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n±zªº¬P®y¬° : ª÷¤û®y");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : Âù¤l®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 6:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n±zªº¬P®y¬° : Âù¤l®y");
                                          else if(date>=22&&date<=30)
                                                 System.out.print("\n±zªº¬P®y¬° : ¥¨ÃÉ®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 7:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n±zªº¬P®y¬° : ¥¨ÃÉ®y");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : ·à¤l®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 8:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n±zªº¬P®y¬° : ·à¤l®y");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : ³B¤k®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 9:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n±zªº¬P®y¬° : ³B¤k®y");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤Ñ¯¯®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 10:
                                          if(date>=1&&date<=23)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤Ñ¯¯®y");
                                          else if(date>=24&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤ÑÃÈ®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 11:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n±zªº¬P®y¬° : ¤ÑÃÈ®y");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n±zªº¬P®y¬° : ®g¤â®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     case 12:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n±zªº¬P®y¬° : ®g¤â®y");
                                          else if(date>=22&&date<=31)
                                                 System.out.print("\n±zªº¬P®y¬° : Å]½~®y");
                                          else 
                                                 System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                                     default:
                                          System.out.print("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
                                          break;
                               }
                         }
                         else
                               System.out.println("\n½Ğ¿é¤J¥¿½Tªº¤é´Á");
            }
}