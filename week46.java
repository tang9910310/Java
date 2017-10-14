import java.io.*;
public class week46{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         int sum=0;
                         System.out.print("請選擇功能(1.提款、2.存款、3.查詢餘額、4.離開) : ");
                         int function = Integer.parseInt(buf.readLine());
                         while(function!=4){
                               switch(function){
                                    case 1:
                                         System.out.print("請輸入提款金額 : ");
                                         int withdrawal = Integer.parseInt(buf.readLine());
                                         if(sum>=withdrawal){
                                                 sum = sum-withdrawal;
                                                 System.out.println("提款成功，目前餘額 : "+sum);
                                         }
                                         else
                                                 System.out.println("金額不足，目前餘額 : "+sum);
                                         break;
                                    case 2:
                                         System.out.print("請輸入存款金額 : ");
                                         int deposit = Integer.parseInt(buf.readLine());
                                         sum = sum+deposit;
                                         System.out.println("存款成功，目前餘額 : "+sum);
                                         break;
                                    case 3:
                                         System.out.println("目前餘額 : "+sum);
                                         break;
                                    case 4:
                                         System.out.println("感謝您的使用，歡迎下次的光臨。");
                                         break;
                                    default:
                                         System.out.println("輸入錯誤，沒有此功能，請重新輸入。");
                                         break;
                               }
                               System.out.print("請選擇功能(1.提款、2.存款、3.查詢餘額、4.離開) : ");
                               function = Integer.parseInt(buf.readLine());
                         }
                         if(function==4){
                                System.out.println("感謝您的使用，歡迎下次的光臨。");
                         }
                         
            }
}