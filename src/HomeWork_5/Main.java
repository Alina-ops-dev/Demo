package HomeWork_5;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты кредитных карт
        CreditCard card1 = new CreditCard("2020-2078-3333-7879", 1000);
        CreditCard card2 = new CreditCard("1112-5462-3328-4346", 3000);
        CreditCard card3 = new CreditCard("1111-2222-3333-4444", 6000);

        card1.deposit(300);
        card2.deposit(1500);
        card3.withdraw(1000);

        System.out.println("\nИнформация о картах:");
        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
    }
}

