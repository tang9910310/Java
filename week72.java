import java.io.*;
public class week72{
  public static int method(int n){
    if(n==1){
      n = 5;
      return n;
    }
    else if (n==2) {
      n=6;
      return n;
    }
    else{
      return method(n-1)+method(n-2);
    }
  }
  public static void main(String[] args)throws IOException{
    int n;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入變形費氏數列的第幾項 : ");
    n = Integer.parseInt(buf.readLine());
    System.out.println("第"+n+"項費氏數列的值為 : "+method(n));
  }
}



