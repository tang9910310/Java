import java.io.*;
import java.util.*;
import java.text.*;
public class week83{
	public static void city(String a){
		String country[] = {"�ª��s","�۴�","�ھ�","�Ҩ�","�x�W","�F��","����"};
		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		if (a.equals(country[0])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT-8"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[1])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[2])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+1"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[3])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[4])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+8"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[5])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+9"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else if (a.equals(country[6])) {
			time.setTimeZone(TimeZone.getTimeZone("GMT+11"));
			System.out.println(a + "�{�b�ɶ� : " + time.format(date));
		}
		else{
			System.out.print("�z��~��J�n�d�ߪ����� : " + a + "�A�U���п�J�K�j�������@�C");
		}
        
	}
	public static void main(String[] args)throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�n�d�ߪ����� : ");
		String str = buf.readLine();
		city(str);
		
	}
}