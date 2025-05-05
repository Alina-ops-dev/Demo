package HomeWork_5;

public class CreditCard {
    String Number;
    double balance;

    public CreditCard(String Number, double initialBalance) {
        this.Number = Number;
        this.balance = initialBalance;
    }
    // Метод для начисления суммы на карту
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Начислено " + amount + ". Новый баланс: " + balance);
        } else{
            System.out.println("Ошибка! Сумма должна быть положительной.");
        }
    }
    // Метод для снятия денег с карты
    public boolean withdraw(double amount) {
        if(balance >= amount && amount > 0){
            balance -= amount;
            System.out.println("Снято " + amount + ". Остаток: " + balance);
            return true;
        } else{
            System.out.println("Недостаточно средств или некорректная сумма!");
            return false;
        }
    }
    // Метод вывода информации о карте
    public void showInfo() {
        System.out.println("Номер счета: " + Number +
                "\nБаланс: " + balance);
    }
}
