import java.util.Scanner;
class Order {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int z = myObj.nextInt();
        if (x<y && z<y && x<z) {
            System.out.println("Numbers in Order: " + x + " , " + z + " , " + y);
        } else if (z<x && y<x && y<z) {
            System.out.println("Numbers in Order: " + y + " , " + z + " , " + x);
        } else if (z<x && z<y && x<y) {
            System.out.println("Numbers in Order: " + z + " , " + x + " , " + y);
        } else if (z<x && z<y && y<x) {
            System.out.println("Numbers in Order: " + z + " , " + y + " , " + x);
        } else if (x<z && x<y && y<z) {
            System.out.println("Numbers in Order: " + x + " , " + y + " , " + z);
        } else if (x<z && y<z && y<x) {
            System.out.println("Numbers in Order: " + y + " , " + x + " , " + z);
        }
    }
}
