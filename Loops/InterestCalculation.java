import java.util.Scanner;
class InterestCalculation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter initial deposit amount: ");
        double deposit = myObj.nextInt();
        System.out.print("Enter annual interest rate (in percentage): ");
        double interest = myObj.nextInt();
        System.out.print("Enter number of years: ");
        double years = myObj.nextInt();


        for (int a = 0; a < (years); a++) {
            deposit = deposit + (deposit * (interest / 100.0));
            System.out.println("Year " + (a + 1) + ": " + deposit);
        }
    }
}
