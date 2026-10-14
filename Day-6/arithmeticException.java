import java.util.Scanner;

class arithmeticException{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);
            sc.close();
        } catch (ArithmeticException e){
            System.err.println("Error : Performing Division by Zero - " + e);
        } finally {
            System.out.println("Executed Successfully");
        }
    }
}
