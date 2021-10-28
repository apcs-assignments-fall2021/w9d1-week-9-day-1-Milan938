import java.util.Scanner;

public class VacationClient {
    public static void main(String[] args) {
        Vacation vaca = new Vacation(1000, 4, "Cruise");
        vaca.adddays(4);
        vaca.getdays();
    }
}
