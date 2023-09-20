
import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction obj = new Fraction();
        boolean repeat = true;
        char ans;
        while (repeat){ // a booloean for yes or no question
                System.out.print("Enter the numerator --> " );
                int n1 = input.nextInt(); //getting the numerator store it in n1
                obj.setNumerator(n1); //setting the getNumerator class as n1
                System.out.print("Enter the denominator --> " );
                int n2 = input.nextInt();//getting the denominator store it in n2
                obj.setDenominator(n2);//setting the getDenominator class as n2

                System.out.println("*********************OUTPUT*********************");
                System.out.println("\t NUMERATOR \t\t: "+obj.getNumerator()); //call Numerator
                System.out.println("\t DENOMINATOR \t\t: "+obj.getDenominator()); //call Denominator
                System.out.print("\t FRACTION \t\t: ");
                obj.showFractionForm(); // call Fraction Form
                System.out.print("\t LOWEST TERM \t\t: ");
                int x = n1;  //set n1 = x
                int y = n2; // set n2 = y 
                obj.determineLowestTerm(x, y); // call determineLowestTerm
                System.out.print("\t DECIMAL EQUIVALENT \t: ");
                obj.determineDecimalEquivalent(); //call determineDecimalEquivalent
                System.out.print("\t FRACTION TYPE \t\t: ");
                obj.determineFractionType(); //call obj.determineFractionType
                System.out.println();// next line
                System.out.print("Input again? [y/n] --> ");
                ans = input.next().charAt(0); 
            switch (ans){
                case 'y':
                    repeat = true; // program will repeat
                    break;
                case 'n': 
                    repeat = false; // while loop will end thus terminating the program
                    break;
            }
            System.out.println(); //next line
        }    
        System.exit(0); // code for terminating the program
        
    }
    
}
