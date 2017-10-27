import java.io.*;
public class week65{
  public static int colors(int n){
    double d = Math.random();
    n = (int) (d * 4 ) + 1;
    switch (n){
      case 1:
         System.out.print("梅花 ");
         break;
      case 2:
         System.out.print("方塊 ");
         break;
      case 3:
         System.out.print("愛心 ");
         break;
      case 4:
         System.out.print("桃花 ");
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
    System.out.println(" ， 你的點數 : " + myscores);
    return myscores;
  }
  public static float computercards(int n,int m,float computerscores,String poker[],float value[]){
    int i,j,k;
    double d = Math.random();
    m = (int) (d * 13 ) + 1;
    System.out.print(poker[m-1]);
    computerscores = computerscores + value[m-1];
    System.out.println(" ， 電腦的點數 : "+computerscores);
    return computerscores;
  }
  public static void main(String[] args)throws IOException{
    int n=0,m=0;
    float myscores=0f,computerscores=0f;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    float value[] = {1f,2f,3f,4f,5f,6f,7f,8f,9f,10f,0.5f,0.5f,0.5f};
    String poker[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    System.out.print("抽到 : ");
    n = colors(n);
    myscores = mycards(n,m,myscores,poker,value);
    System.out.print("加牌請輸入1 ，不加牌請輸入0 : ");
    int select = Integer.parseInt(buf.readLine());
    if(select==1){
      do {
        System.out.print("抽到 : ");
        n = colors(n);
        myscores = mycards(n,m,myscores,poker,value);
        if (myscores>10.5) {
          System.out.println("玩家點數爆掉，電腦獲勝");
          break;
        }
        System.out.print("加牌請輸入1 ，不加牌請輸入0 : ");
        select = Integer.parseInt(buf.readLine());
      }while(select == 1);
    }
    if (myscores<=10.5) {
      if (select!=1&&select!=0) {
        System.out.println("您剛才輸入的是 : "+select+" ， 已違反遊戲規則 ， 電腦直接獲勝");
      }
      else{
        System.out.print("電腦抽到 : ");
        n = colors(n);
        computerscores = computercards(n,m,computerscores,poker,value);
        do {
          System.out.print("電腦抽到 : ");
          n = colors(n);
          computerscores = computercards(n,m,computerscores,poker,value);
          if (computerscores>10.5) {
            System.out.println("電腦點數爆掉，玩家獲勝");
            break;
          }
          if (computerscores>=7) {
            break;
          }
        }while(myscores>computerscores);
        if (computerscores>myscores&&computerscores<=10.5) {
          System.out.println("電腦點數較大，電腦獲勝");
        }
        else if (computerscores==myscores&&computerscores<=10.5) {
          System.out.println("點數相同，電腦獲勝");
        }
        else if (computerscores<myscores&&computerscores<=10.5) {
          System.out.println("玩家點數較大，玩家獲勝");
        }
      }
    }
  }
}




