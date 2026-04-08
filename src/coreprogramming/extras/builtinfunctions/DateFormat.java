package coreprogramming.extras.builtinfunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args){
        LocalDate tdy = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current Date(dd/MM/yyyy): " + tdy.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current Date(yyyy-MM-dd): " + tdy.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current Date(EEE, MMM dd, yyyy): " + tdy.format(format3));
    }
}