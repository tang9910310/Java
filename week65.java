import java.io.*;
public class week65{
  public static int colors(int n){
    double d = Math.random();
    n = (int) (d * 4 ) + 1;
    switch (n){
      case 1:
         System.out.print("���� ");
         break;
      case 2:
         System.out.print("��� ");
         break;
      case 3:
         System.out.print("�R�� ");
         break;
      case 4:
         System.out.print("��� ");
         break;
      default:
         break;
    }
    return n;
  }
  public static float mycards(int n,int m,float myscores,String poker[],float value[]){
    int i,j,k;
    double d = Math.random();
    m = (int) (d * 13 ) + 1;
    System.out.print(poker[m-1]);
    myscores = myscores + value[m-1];
    System.out.println(" �A �A���I�� : " + myscores);
    return myscores;
  }
  public static float computercards(int n,int m,float computerscores,String poker[],float value[]){
    int i,j,k;
    double d = Math.random();
    m = (int) (d * 13 ) + 1;
    System.out.print(poker[m-1]);
    computerscores = computerscores + value[m-1];
    System.out.println(" �A �q�����I�� : "+computerscores);
    return computerscores;
  }
  public static void main(String[] args)throws IOException{
    int n=0,m=0;
    float myscores=0f,computerscores=0f;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    float value[] = {1f,2f,3f,4f,5f,6f,7f,8f,9f,10f,0.5f,0.5f,0.5f};
    String poker[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    System.out.print("��� : ");
    n = colors(n);
    myscores = mycards(n,m,myscores,poker,value);
    System.out.print("�[�P�п�J1 �A���[�P�п�J0 : ");
    int select = Integer.parseInt(buf.readLine());
    if(select==1){
      do {
        System.out.print("��� : ");
        n = colors(n);
        myscores = mycards(n,m,myscores,poker,value);
        if (myscores>10.5) {
          System.out.println("���a�I���z���A�q�����");
          break;
        }
        System.out.print("�[�P�п�J1 �A���[�P�п�J0 : ");
        select = Integer.parseInt(buf.readLine());
      }while(select == 1);
    }
    if (myscores<=10.5) {
      if (select!=1&&select!=0) {
        System.out.println("�z��~��J���O : "+select+" �A �w�H�ϹC���W�h �A �q���������");
      }
      else{
        System.out.print("�q����� : ");
        n = colors(n);
        computerscores = computercards(n,m,computerscores,poker,value);
        do {
          System.out.print("�q����� : ");
          n = colors(n);
          computerscores = computercards(n,m,computerscores,poker,value);
          if (computerscores>10.5) {
            System.out.println("�q���I���z���A���a���");
            break;
          }
          if (computerscores>=7) {
            break;
          }
        }while(myscores>computerscores);
        if (computerscores>myscores&&computerscores<=10.5) {
          System.out.println("�q���I�Ƹ��j�A�q�����");
        }
        else if (computerscores==myscores&&computerscores<=10.5) {
          System.out.println("�I�ƬۦP�A�q�����");
        }
        else if (computerscores<myscores&&computerscores<=10.5) {
          System.out.println("���a�I�Ƹ��j�A���a���");
        }
      }
    }
  }
}




