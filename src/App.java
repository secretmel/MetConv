import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Metric Converter!!!");
            System.out.println("Please input your conversion. For example, '1 km = m'.");
            System.out.println("Enter '-1' if you wish to exit the program.");
            
            String userInput = "";
            while (!userInput.equals("-1")) {
                System.out.print("Enter your conversion query: ");
                userInput = scanner.nextLine();

                if(userInput.equals ("-1")){
                    break;
                }
                
                if (userInput.equals("1 in = cm")){
                    System.out.println("1 in = 2.54 cm");
                } 
                else if (userInput.equals("1 ft = in")){
                    System.out.println("1 ft = 12 in");
                }else if("1 ft = mi".equals(userInput)){
                    System.out.println("1 mi = 5280 ft");
                }
                else if("1 yd = ft".equals(userInput)){
                    System.out.println("1 yd = 3 ft");
                }
                else if("1 mi = yd".equals(userInput)){
                    System.out.println("1 mi = 1760 yd");
                }
                else if (userInput.equals("1 cm = in")) {
                    System.out.println("1 cm = 0.3937 in");
                }
                else if (userInput.equals("1 m = ft")) {
                    System.out.println("1 m = 3.2808 ft");
                }
                else if (userInput.equals("1 mm = in")) {
                    System.out.println("1 mm = 0.03937 in");
                }
                else if (userInput.equals("1 km = mi")) {
                    System.out.println("1 km = 0.62137 mi");
                }
                else{
                    System.out.println("Sorry, we do not have that conversion available. Or we don't reconize that input.");
                    }
            }
            System.out.println("Exiting the program. Goodbye!");
        }
    }
}