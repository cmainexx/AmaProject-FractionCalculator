public class Fraction {
    private int numerator;
    private int denominator;
    int determineLowestTerm;
    
  //NUMERATOR
    //getter
    public int getNumerator(){
        return this.numerator;
    }
    //setter
    public void setNumerator(int num){
        this.numerator = num;
    }
  //DENOMINATOR
    //getter
    public int getDenominator(){
        return this.denominator;
    }
    //setter
    public void setDenominator(int num){
        this.denominator = num;
    }
  //FRACTION FORM
    public void showFractionForm(){
        System.out.println(numerator+"/"+denominator);
        
    }
  //LOWEST TERM
    //getter
    static int gcd(int a, int b)  {  
        if (b == 0)  
        return a;  
        return gcd(b, a % b);  
      
    }
    //setter
    public void determineLowestTerm(int x, int y){  
        int d;  //logic for getting Lowest term of fraction
	d = gcd(x, y);
	 
	if (d != 1) {
		x = x / d;
		y = y / d;
	}
	else if (d == 1) {
		x = 0;
		y = 0;
	}  

        System.out.println( x + "/" + y);  
        }  
     

  //DECIMAL EQUIVALENT
    public void determineDecimalEquivalent(){
        double decimal;
        //logic for getting decimal equivalent = division
        if (numerator == 0){
            System.out.println("0");
        } else if (denominator == 0){
            System.out.println("Undefined");
        } else {
            decimal = (double) numerator / denominator;
            System.out.println(decimal);
        }
        
    }
    
  //FRACTION TYPE
    public void determineFractionType(){
        
        if (denominator == 0){
            System.out.println("Undefined");
        } else if (numerator>denominator && numerator%denominator == 0){ //numerator is greater than denominator
            // and result is a whole number
            System.out.println("Whole Number");
        } else if (numerator>denominator) { //numerator is greater than denominator
            // but result has a decimal
            System.out.println("Improper Fraction");
        } else if (numerator<denominator){ //numerator is less than denominator
            System.out.println("Proper Fraction");
        }
        
    }
}
