import java.io.*;
public class week1605 {
	public static void show (String name[], String sex[], String department[], int year[], int n) {
		int i;
		for (i = 0;i < n ;i++ ) {
			System.out.print("第" + (i + 1) + "位姓名；" + name[i]);
			System.out.print("，性別；" + sex[i]);
			System.out.print("，科系；" + department[i]);
			System.out.println("，年齡；" + year[i] + "。");
		}
	}
	public static void inquire (String name[], String sex[], String department[], int year[], int n) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("請輸入要查詢第幾個人的資料：");
				int i = Integer.parseInt(buf.readLine());
                System.out.print("第" + i + "位姓名；" + name[i - 1]);
				System.out.print("，性別；" + sex[i - 1]);
				System.out.print("，科系；" + department[i - 1]);
				System.out.println("，年齡；" + year[i - 1] + "。");
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("助教不要每次都惡搞好不好，老是造成別人的困擾。");
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("助教沒有這個人。");
				continue;
			}
			break;
		} while (true);
	}
	public static void itemModify (String name[], String sex[], String department[], int year[], int n, int selection, int i) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				switch (selection) {
					case 1:
						System.out.print("請輸入新姓名：");
						name[i - 1] = buf.readLine();
						break;
					case 2:
						System.out.print("請輸入新性別：");
						sex[i - 1] = buf.readLine();
						break;
					case 3:
						System.out.print("請輸入新科系：");
						department[i - 1] = buf.readLine();
						break;
					case 4:
						System.out.print("請輸入新年齡：");
						year[i - 1] = Integer.parseInt(buf.readLine());
						break;
					case 5:
						System.out.print("請輸入新姓名：");
						name[i - 1] = buf.readLine();
						System.out.print("請輸入新性別：");
						sex[i - 1] = buf.readLine();
						System.out.print("請輸入新科系：");
						department[i - 1] = buf.readLine();
						System.out.print("請輸入新年齡：");
						year[i - 1] = Integer.parseInt(buf.readLine());
						break;
					default:
						System.out.println("每次惡搞都有助教，請收斂點。");
						break;
				}
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("我已經不知道要跟助教說什麼了。");
				continue;
			}
			break;
		} while (true);

	}
	public static void modify (String name[], String sex[], String department[], int year[], int n) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("請輸入要修改第幾個人的資料：");
				int i = Integer.parseInt(buf.readLine());
				name[i - 1] = name[i - 1];
				System.out.print("請輸入要修改的項目(1.姓名 2.性別 3.科系 4.年齡 5.所有資料)：");
				int selection = Integer.parseInt(buf.readLine());
				itemModify(name, sex, department, year, n, selection, i);
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("助教可以再無聊點沒關係啊。");
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("助教成熟點好嗎，這種事情還要做幾次。");
				continue;
			}
			break;
		} while (true);
	} 
 	public static void selection (String name[], String sex[], String department[], int year[], int n) throws IOException {
        String choice;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        do {
        	System.out.print("請選擇功能(A.顯示所有資料 B.查詢單一筆資料 C.修改資料 D.離開程式)：");
        	choice = buf.readLine();
        	switch (choice) {
        		case "A":
        			show(name, sex, department, year, n);
        			break;
        		case "B":
        			inquire(name, sex, department, year, n);
        			break;
        		case "C":
        			modify(name, sex, department, year, n);
        			break;
        		case "D":
        		    System.out.println("程式結束。");
        		    break;
        		default:
        			System.out.println("助教每次都是你，亂輸入。");
        			break;
        	}
        } while (!choice.equals("D"));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("請輸入幾筆資料：");
				int	n = Integer.parseInt(buf.readLine());
				String name[] = new String[n];
				String sex[] = new String[n];
				String department[] = new String[n];
				int	year[] = new int[n];
				int i;
				for (i = 0;i < n ;i++ ) {
					do {
						try {
							System.out.print("請輸入第" + (i + 1) + "筆姓名；");
							name[i] = buf.readLine();
							System.out.print("請輸入第" + (i + 1) + "筆性別；");
							sex[i] = buf.readLine();
							System.out.print("請輸入第" + (i + 1) + "筆科系；");
							department[i] = buf.readLine();
							System.out.print("請輸入第" + (i + 1) + "筆年齡；");
							year[i] = Integer.parseInt(buf.readLine());
						}
						catch (NumberFormatException e) {
							e.printStackTrace();
							System.out.println("請輸入數字。");
							continue;
						}
						break;
					} while (true);
				}
				selection(name, sex, department, year, n);
			}
			catch (NegativeArraySizeException e) {
				e.printStackTrace();
				System.out.println("不得輸入負數。");
				continue;
			}
			break;
		} while (true);
	}
}