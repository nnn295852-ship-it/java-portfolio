import java.util.Scanner;
class Verification {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean witness = false;
        String correctpass = "Nomiocool";
        int attempts = 0;
        
        while (attempts < 3 && witness == false) {
            System.out.print("Enter password: ");
            String inputpass = myObj.nextLine();
            
            if (inputpass.equals(correctpass)) {
                witness = true;
                System.out.print("Correct!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect pass. Attempts left: " + (3 - attempts)) ;
            }
        }
        
        if (witness == false) {
            System.out.print("Sorry, too many attempts");
        }  
    }
}
