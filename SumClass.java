public class SumClass {
    public static void main(String[] args) {
        double sum = 0.0;       
        double term = 1.0;      
        double ratio = 0.9;    
        double precision = 0.01; 

        
        while (term >= precision) {
            sum += term;       
            term *= ratio;      
        }

        System.out.println("Sum of the series is: " + sum);
    }
}