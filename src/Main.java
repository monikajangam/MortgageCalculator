
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        final byte Month_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Intrest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyIntrest = annualInterest /  PERCENT / Month_IN_YEAR;

        System.out.println("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years*Month_IN_YEAR;

        //mortage calculation formula
        double mortgage = principal *(monthlyIntrest*Math.pow(1+monthlyIntrest,numberOfPayments)) / (Math.pow(1+monthlyIntrest,numberOfPayments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);



        System.out.println("Mortgage: "+mortgageFormatted);


    }
}