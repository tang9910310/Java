import java.io.*;
public class week31{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("�п�J�A���m�W:");
                         String name = buf.readLine(); 
                         System.out.print("\n�п�J�A���ʧO:");
                         String sex = buf.readLine();
                         System.out.print("\n�п�J�A���褸�X�ͦ~��:");
                         int year = Integer.parseInt(buf.readLine());
                         System.out.print("\n�п�J�A���X�ͦa:");
                         String birthplace = buf.readLine();
                         System.out.println("�m�W:"+name);
                         System.out.println("�ʧO:"+sex);
                         System.out.println("�褸�X�ͦ~��:"+year);
                         System.out.println("�X�ͦa:"+birthplace);
}
}