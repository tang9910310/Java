import java.io.*;
public class week31{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入你的姓名:");
                         String name = buf.readLine(); 
                         System.out.print("\n請輸入你的性別:");
                         String sex = buf.readLine();
                         System.out.print("\n請輸入你的西元出生年份:");
                         int year = Integer.parseInt(buf.readLine());
                         System.out.print("\n請輸入你的出生地:");
                         String birthplace = buf.readLine();
                         System.out.println("姓名:"+name);
                         System.out.println("性別:"+sex);
                         System.out.println("西元出生年份:"+year);
                         System.out.println("出生地:"+birthplace);
}
}