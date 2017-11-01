import java.io.*;
import java.util.*;
import java.text.*;
public class week83{
	public static void city(String a){
		String country[] = {"舊金山","倫敦","巴黎","曼谷","台灣","東京","雪梨"};
		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		if (a.equals(country[0])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT-8"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[1])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[2])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+1"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[3])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[4])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+8"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[5])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+9"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else if (a.equals(country[6])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+11"));
			System.out.println(a + "現在時間 : " + time.format(date));
		}
		else{
			System.out.print("您剛才輸入要查詢的城市 : " + a + "，下次請輸入八大城市之一。");
		}
        
	}
	public static void main(String[] args)throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入要查詢的城市 : ");
		String str = buf.readLine();
		city(str);
		
	}
}