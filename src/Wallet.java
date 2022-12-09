import java.time.LocalDate;

public class Wallet {


    private float money=0;
    private double creditCard=0;
    private LocalDate date;
    private String place;

    public Wallet(float money, double creditCard, LocalDate date, String place) {
        this.money = money;
        this.creditCard = creditCard;
        this.date = date;
        this.place = place;

    }

    public Wallet(float money, double creditCard, LocalDate date) {
        this.money = money;
        this.creditCard = creditCard;
        this.date = date;
    }

    public Wallet(float money, LocalDate date, String place) {
        this.money = money;
        this.date = date;
        this.place = place;
    }

    public Wallet(double creditCard, LocalDate date, String place) {
        this.creditCard = creditCard;
        this.date = date;
        this.place = place;
    }

    public Wallet(float money, LocalDate date) {
        this.money = money;
        this.date = date;
    }

    public Wallet(double creditCard, LocalDate date) {
        this.creditCard = creditCard;
        this.date = date;
    }

    //getters setters

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Your status: "+ money +" "+ creditCard;
    }
}
