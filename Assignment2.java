
    import java.util.Scanner;

    public class Assignment2 {
    
        // Scanner Object
        static Scanner scan = new Scanner(System.in);
    
        public static void main(String[] args) {

            showMyOrder();
        
            scan.close();
        }

        static void showMyOrder() {
            System.out.println("Welcome to KFC!");

            System.out.println("What are your cravings today?");

            System.out.println("Enter your order: ");
            String order = scan.nextLine();

            System.out.println("Enter the price of your order: ");
            double a = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter your next order: ");
            String order1 = scan.nextLine();

            System.out.println("Enter the price of your order: ");
            double b = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter your next order: ");
            String order2 = scan.nextLine();

            System.out.println("Enter the price of your order: ");
            double c = scan.nextDouble();

            scan.nextLine();

            double total = a + b + c;

            System.out.println("Your orders are " + order +", " + order1 +", and " + order2 + "."); 

            System.out.println("Your order costs " + total + " pesos.");

        }   
    }
