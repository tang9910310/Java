import java.io.*;
public class week1605 {
	public static void show (String name[], String sex[], String department[], int year[], int n) {
		int i;
		for (i = 0;i < n ;i++ ) {
			System.out.print("��" + (i + 1) + "��m�W�F" + name[i]);
			System.out.print("�A�ʧO�F" + sex[i]);
			System.out.print("�A��t�F" + department[i]);
			System.out.println("�A�~�֡F" + year[i] + "�C");
		}
	}
	public static void inquire (String name[], String sex[], String department[], int year[], int n) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("�п�J�n�d�߲ĴX�ӤH����ơG");
				int i = Integer.parseInt(buf.readLine());
                System.out.print("��" + i + "��m�W�F" + name[i - 1]);
				System.out.print("�A�ʧO�F" + sex[i - 1]);
				System.out.print("�A��t�F" + department[i - 1]);
				System.out.println("�A�~�֡F" + year[i - 1] + "�C");
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("�U�Ф��n�C�����c�d�n���n�A�ѬO�y���O�H���x�Z�C");
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�U�ШS���o�ӤH�C");
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
						System.out.print("�п�J�s�m�W�G");
						name[i - 1] = buf.readLine();
						break;
					case 2:
						System.out.print("�п�J�s�ʧO�G");
						sex[i - 1] = buf.readLine();
						break;
					case 3:
						System.out.print("�п�J�s��t�G");
						department[i - 1] = buf.readLine();
						break;
					case 4:
						System.out.print("�п�J�s�~�֡G");
						year[i - 1] = Integer.parseInt(buf.readLine());
						break;
					case 5:
						System.out.print("�п�J�s�m�W�G");
						name[i - 1] = buf.readLine();
						System.out.print("�п�J�s�ʧO�G");
						sex[i - 1] = buf.readLine();
						System.out.print("�п�J�s��t�G");
						department[i - 1] = buf.readLine();
						System.out.print("�п�J�s�~�֡G");
						year[i - 1] = Integer.parseInt(buf.readLine());
						break;
					default:
						System.out.println("�C���c�d�����U�СA�Ц����I�C");
						break;
				}
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("�ڤw�g�����D�n��U�л�����F�C");
				continue;
			}
			break;
		} while (true);

	}
	public static void modify (String name[], String sex[], String department[], int year[], int n) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("�п�J�n�ק�ĴX�ӤH����ơG");
				int i = Integer.parseInt(buf.readLine());
				name[i - 1] = name[i - 1];
				System.out.print("�п�J�n�ק諸����(1.�m�W 2.�ʧO 3.��t 4.�~�� 5.�Ҧ����)�G");
				int selection = Integer.parseInt(buf.readLine());
				itemModify(name, sex, department, year, n, selection, i);
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("�U�Хi�H�A�L���I�S���Y�ڡC");
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�U�Ц����I�n�ܡA�o�بƱ��٭n���X���C");
				continue;
			}
			break;
		} while (true);
	} 
 	public static void selection (String name[], String sex[], String department[], int year[], int n) throws IOException {
        String choice;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        do {
        	System.out.print("�п�ܥ\��(A.��ܩҦ���� B.�d�߳�@����� C.�ק��� D.���}�{��)�G");
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
        		    System.out.println("�{�������C");
        		    break;
        		default:
        			System.out.println("�U�ШC�����O�A�A�ÿ�J�C");
        			break;
        	}
        } while (!choice.equals("D"));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("�п�J�X����ơG");
				int	n = Integer.parseInt(buf.readLine());
				String name[] = new String[n];
				String sex[] = new String[n];
				String department[] = new String[n];
				int	year[] = new int[n];
				int i;
				for (i = 0;i < n ;i++ ) {
					do {
						try {
							System.out.print("�п�J��" + (i + 1) + "���m�W�F");
							name[i] = buf.readLine();
							System.out.print("�п�J��" + (i + 1) + "���ʧO�F");
							sex[i] = buf.readLine();
							System.out.print("�п�J��" + (i + 1) + "����t�F");
							department[i] = buf.readLine();
							System.out.print("�п�J��" + (i + 1) + "���~�֡F");
							year[i] = Integer.parseInt(buf.readLine());
						}
						catch (NumberFormatException e) {
							e.printStackTrace();
							System.out.println("�п�J�Ʀr�C");
							continue;
						}
						break;
					} while (true);
				}
				selection(name, sex, department, year, n);
			}
			catch (NegativeArraySizeException e) {
				e.printStackTrace();
				System.out.println("���o��J�t�ơC");
				continue;
			}
			break;
		} while (true);
	}
}