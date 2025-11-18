
public class BankAccount {
    /*
    Объявляем инстанс переменную для хранения сведений о балансе
    Представленный подход позволит реализовать простой пример инкапсуляции
     */
    private double balance;

    /*
    Используем конструктор для создания экземпляра класса
    Представленный шаг позволит добавить на баланс начальную сумму
     */
    public BankAccount(double InitialBalance) {
        if (InitialBalance >= 0) {
            this.balance = InitialBalance;
        }
        else {
            this.balance = 0;
        }
    }

    /*
    Объявляем функцию для внесения депозита на банковский аккаунт
     */
    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Баланс был пополнен на денежную сумму в размере: " + amount + " руб.");
        }
        else {
            System.out.println("Ошибка пополнения: 'Вы ввели отрицательное число при пополнении баланса!'");
        }
    }

    /*
    Объявляем функцию для снятия денежных средств с баланса банковского аккаунта
     */
    public void withdraw(double amount) {
        if (amount >= 0) {
            if (balance - amount >= 0) {
                balance -= amount;
                System.out.println("С баланса была снята денежная сумма в размере: " + amount + " руб.");
            }
            else {
                System.out.println("Недостаточно денежных средств на балансе! Процедура снятия не может быть выполнена!");
            }
        }
        else {
            System.out.println("Ошибка снятия: 'Вы ввели отрицательное число при снятии денежных средств с баланса!'");
        }
    }

    /*
    Переменная balance недоступна для использования в других классах
    Поэтому необходимо создать публичный метод для чтения этой переменной
     */
    public double getBalance() {
        System.out.println("Текущий баланс составляет: " + balance + " руб.");
        return balance;
    }
}