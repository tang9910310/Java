import java.io.*;
public class week71{
  public static void circle(double n){
    System.out.println("半徑"+ n +"的圓形面積 : "+(n*n*3.14));
  }
  public static void square(double n){
    System.out.println("邊長"+ n +"的正方形面積 : "+(n*n));
  }
  public static void rectangle(double n,double m){
    System.out.println("長"+ n +"寬"+ m +"的矩形面積 : "+(n*m));
  }
  public static void trapezium(double n,double u,double d){
    System.out.println("上底"+ u +"下底"+ d +"且高為"+ n +"的梯形面積 : "+((u+d)*n/2));
  }
  public static void main(String[] args)throws IOException{
    circle(2.5);
    square(3);
    rectangle(4,8);
    trapezium(5,6,2);
  }
}




