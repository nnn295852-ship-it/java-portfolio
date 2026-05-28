import java.util.Scanner;
class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your average grade?");
        int grade = myObj.nextInt();
        if (grade>= 85) {
            System.out.println("What is your family income?");
            int income = myObj.nextInt();
            
            if (income<300000 && income>100000) {
                System.out.println("Partial Consideration");
            } else if (income<100000) {
                System.out.println("Full Scholarship");
            } else {
                System.out.println("No Scholarship");
            }
        } else {
            System.out.println("No Scholarship");
        }
    }
}
