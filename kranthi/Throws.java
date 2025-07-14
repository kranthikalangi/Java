
public class Throws 
    {
        public static double divide(int numerator, int denominator) throws
        ArithmeticException 
        {
            if (denominator == 0) 
            {
                throw new ArithmeticException("Denominator cannot be zero");
            }
            return (double) numerator / denominator;
        }
        public static void main(String[] args) 
        {
            try 
            {
                double result = divide(10, 0);
                System.out.println("Result of division: " + result);
            }
            catch (ArithmeticException e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }