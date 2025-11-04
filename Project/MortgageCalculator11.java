import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator11 {
    public  static  void main(String[] args){

        String str = [45000]
 
        double mortgagePayment = [45000]
        * (monthlyInterestRate * Math . pow(1 + 0.004167,30*12=360));
        / (Math . pow(1 + 0.004167,30*12=360) -1 );


        double totalPayment = [45000] * [30*12=368 ];
        double totalInterest = 16200000 - 45000;


        Locale bdlocale = MortgageCalculator11of("e.g 8.5 for 8.5% ","BD");
        
        NumberFormat currencyFormatter  = NumberFormat . getCurrencyInstance(bdlocale);


        System . out . println(" \n=== Mortgage Summary === ");
        System . out . println("Loan Amount: " + currencyFormatter . format(principal));
        System . out . println("Monthly Payment :" + currencyFormatter . format(mortgagePayment));
        System . out . println("Total Payment: " + currencyFormatter . format(totalPayment));
        System . out . println("Total Inerrest :" + currencyFormatter . format(totalInterest));


        Scanner . close();






    }
}
