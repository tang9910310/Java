import java.io.*;
public class week45{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         int m = (int)(Math.random()*60)+1;
                         System.out.println("點到的號碼為 : "+m);
                         System.out.print("是否繼續點名(Y/N) : ");
                         String selection = buf.readLine();
                         if(selection.charAt(0)=='Y'){
                                 do{
                                      m = (int)(Math.random()*60)+1;
                                      if(m==3||m==31||m==35||m==46||m==47||m==57)
                                                continue;
                                      System.out.println("點到的號碼為 : "+m);
                                      System.out.print("是否繼續點名(Y/N) : ");
                                      selection = buf.readLine();
                                 }while(selection.charAt(0)=='Y');
                                 if(selection.charAt(0)=='N')
                                        System.out.println("程式結束");
                                 else
                                        System.out.println("您剛才輸入的是 : "+selection+"\n請重新輸入");
                         }
                         else if(selection.charAt(0)=='N')
                                 System.out.println("程式結束");
                         else
                                 System.out.println("您剛才輸入的是 : "+selection+"\n請重新輸入");
            }
}