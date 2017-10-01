import java.io.*;
public class week35{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入TOEIC成績:");
                         int scores = Integer.parseInt(buf.readLine()); 
                        
                         if(scores%5==0){
                               if(10<=scores&&scores<=990){
                                      if(scores>=860){
                                             System.out.println("證照顏色:金色");
                                      }
                                      else if(scores>=730){
                                             System.out.println("證照顏色:藍色");
                                      }
                                      else if(scores>=470){
                                             System.out.println("證照顏色:綠色");
                                      }
                                      else if(scores>=220){
                                             System.out.println("證照顏色:棕色");
                                      }
                                      else 
                                          System.out.println("證照顏色:橘色");
                                                   
                               }
                               else
                                   System.out.println("輸入格式錯誤");
                         }
                         else
                             System.out.println("輸入格式錯誤");
            }
}