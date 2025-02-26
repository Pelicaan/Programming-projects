import java.math.BigDecimal;
import java.util.Scanner;

public class FindPItotheNthDigit {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            BigDecimal b1 = new BigDecimal(22.0);
            BigDecimal b2 = new BigDecimal(7.0);
            System.out.println("To how many devimal places do youwant to print PI");
            int number = input.nextInt();
            
            if (number < 32627) 
                System.out.println(b1.divide(b2, number, BigDecimal.ROUND_UP));
            else
                System.out.println("Limit Exceeded!!!");
            
            
    }  
};  