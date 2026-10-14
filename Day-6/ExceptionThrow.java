import java.util.InputMismatchException;
import java.util.Scanner;

class CustomExp extends Exception {
    public CustomExp(String msg) {
        super(msg);
    }
}

public class ExceptionThrow {
    public static void main(String[] args) {
        try(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1 : ");
            int a = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            int b = sc.nextInt();

            System.err.println();
            int age = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Unexpected Behaviour");
            }

            if (age < 18) {
                throw new CustomExp("Age Restriction Bwahahaha");
            }

            System.out.println(a / b);
            sc.close();
        } catch (ArithmeticException e) {
            System.err.println("Error : Performing Division by Zero - " + e);
        } catch (InputMismatchException e) {
            System.err.println(e);
        } catch (CustomExp e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Executed Successfully");
        }
    }

}
