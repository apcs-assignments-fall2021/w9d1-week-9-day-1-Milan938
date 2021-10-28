public class VacationClient {
    public static void main(String[] args) {
        Vacation vaca = new Vacation(1000, 4, "Cruise");
        vaca.adddays(4);
        vaca.getdays();
        vaca.addcash(1000);
        vaca.subdays(3);
        System.out.println(vaca.getcash());
        System.out.println(vaca.getvacatype());
        System.out.println(vaca.getdays());
    }
}