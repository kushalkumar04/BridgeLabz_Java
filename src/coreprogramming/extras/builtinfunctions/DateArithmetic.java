package coreprogramming.extras.builtinfunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the date(yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate org = LocalDate.parse(input);
        LocalDate result = org.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Original date is " + org.format(formatting));
        System.out.println("Resultant date is " + result.format(formatting));
        sc.close();
    }
}