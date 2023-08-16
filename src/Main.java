public class Main {
    public static void main(String[] args) {

        int ticketPrice = 18_567;
        int mileCost = 20;

        int bonusMile = ticketPrice / mileCost;

        System.out.println("Стоимость билета " + ticketPrice);
        System.out.println("Количество бонусных миль " + bonusMile);

    }
}
