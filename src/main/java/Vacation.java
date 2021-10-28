public class Vacation {
    private int totalmoney;
    private int totaldays;
    private String typeofvaca;

    public Vacation(int cash, int days, String type){
        totalmoney = cash;
        totaldays = days;
        typeofvaca = type;
    }

    public void adddays(int a) {
        totaldays = totaldays + a;
    }

    public void subdays(int a) {
        totaldays = totaldays - a;
    }

    public void addcash(int a) {
        totalmoney = totalmoney + a;
    }

    public void usecash(int a) {
        if(totalmoney - a >= 0) {
            totalmoney -= a;
        }
        else {
            System.out.println("You too broke for that lol");
        }
    }

    public void vacatype(String a) {
        typeofvaca = a;
    }

    public int getcash(){
        return totalmoney;
    }

    public int getdays(){
        return totaldays;
    }

    public String getvacatype(){
        return typeofvaca;
    }
}
