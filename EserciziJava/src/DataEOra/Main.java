package DataEOra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args){
        
        LocalDate x = LocalDate.now();
        System.out.println(x);
        DateTimeFormatter a = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy");
        System.out.println(x.format(a));

        LocalTime y = LocalTime.now();
        System.out.println(y);

        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);
    }
}
