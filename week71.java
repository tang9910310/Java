import java.io.*;
public class week71{
  public static void circle(double n){
    System.out.println("�b�|"+ n +"����έ��n : "+(n*n*3.14));
  }
  public static void square(double n){
    System.out.println("���"+ n +"������έ��n : "+(n*n));
  }
  public static void rectangle(double n,double m){
    System.out.println("��"+ n +"�e"+ m +"���x�έ��n : "+(n*m));
  }
  public static void trapezium(double n,double u,double d){
    System.out.println("�W��"+ u +"�U��"+ d +"�B����"+ n +"����έ��n : "+((u+d)*n/2));
  }
  public static void main(String[] args)throws IOException{
    circle(2.5);
    square(3);
    rectangle(4,8);
    trapezium(5,6,2);
  }
}




