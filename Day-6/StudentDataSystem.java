import java.io.*;
import java.util.Scanner;

public class StudentDataSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many Entries Would you Like to Include : ");
            int numberOfEntries = sc.nextInt();
            sc.nextLine();

            while (numberOfEntries > 0) {

                System.out.print("Enter the User Name : ");
                String userName = sc.nextLine();

                System.out.print("Enter the User ID : ");
                int userId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter " + userName + "'s Department : ");
                String departmentName = sc.nextLine();

                try (FileWriter fw = new FileWriter("Data.txt")) {
                    fw.write("User : " + userName + "\n");
                    fw.write("ID : " + userId + "\n");
                    fw.write("Department : " + departmentName + "\n");
                    fw.write("--------------------");

                    System.out.println("Student Data Saved Successfully");
                } catch (IOException e) {
                    System.err.println(e.getLocalizedMessage());
                }

                numberOfEntries--;
            }

            sc.close();
        }
    }
}
