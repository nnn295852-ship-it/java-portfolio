public class GroceryCalculator {
    public static void main ( String [] args ) {
        String item1 = " Chips ";
        double price1 = 5.25;
        
        String item2 = " Soda ";
        double price2 = 3.50;
        
        String item3 = " Ramen ";
        double price3 = 4.99;
        
        double totalPrice = price1 + price2 + price3 ;
        System.out.println(" Item 1: " + item1 + " Price: " + price1 ) ;
        System.out.println(" Item 2: " + item2 + " Price: " + price2 ) ;
        System.out.println(" Item 3: " + item3 + " Price: " + price3 ) ;
        System.out.println(" Grand Total : " + totalPrice ) ;     
    }
    }
