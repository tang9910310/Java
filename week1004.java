import java.io.*;
public class week1004{
  public static void main(String args[])throws IOException{
    String information;
    String name, position = "????";
    int year = 1, i = 0;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入員工資訊[名稱、職位、年資]：");
    information = buf.readLine();
    String split[] = information.split(",");
    name = split[0];
    for (i = 0;i<split[1].length() ;i++ ) {
      if (split[1].charAt(i) < '0'||split[1].charAt(i) > '9') {
        break;
      }
    }
    if (i < split[1].length()) {
      position = split[1];
    }
    else {
      year = Integer.parseInt(split[1]);
    }
    if (split.length > 2) {
      for (i = 0;i<split[split.length - 1].length() ;i++ ) {
        if (split[split.length - 1].charAt(i) >= '0'&&split[split.length - 1].charAt(i) <= '9') {
          break;
        }
      }
      if (i < split[split.length - 1].length()) {
        year = Integer.parseInt(split[split.length - 1]);
      }
      else {
        position = split[split.length - 1];
      }
    }
    Employee employee = new Employee(name, position, year);
    employee.show();
  }
}