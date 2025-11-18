import java.util.Scanner;

public class BankAccountManager {

    public static void main(String[] args) {

        /*
        Создаем новый экземпляр класса BankAccount для добавления банковского счета
        Дополнительно добавляем переменную для считывания пользовательского ввода с клавиатуры
         */
        BankAccount myAccount = new BankAccount(0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вас приветствует банк ПАО 'Егор Александрович'!");

        while (true) {
            // Передаем список доступных действий пользователю на экран приложения
            System.out.println("Выберите интересующую Вас операцию с банковским счетом!");
            System.out.println("1 – Пополнить банковский счет.");
            System.out.println("2 – Снять денежные средства с банковского счета.");
            System.out.println("3 – Посмотреть информацию о балансе банковского счета.");
            System.out.println("4 – Выйти из приложения банка.");
            System.out.print("Введите номер операции: ");

            // Проверяем, что пользователь ввел значение в формате Int
            if (scanner.hasNextInt()) {
                //Считываем введенное пользователем число и добавляем его в переменную
                int inputValue = scanner.nextInt();

                if (inputValue == 1) {
                    System.out.print("Введите сумму пополнения: ");
                    // Проверяем, что пользователь ввел значение в формате Double
                    if (scanner.hasNextDouble()) {
                        double inputAmount = scanner.nextDouble();
                        myAccount.deposit(inputAmount);
                    }
                    else {
                        System.out.println("Вы ввели не число! Попробуйте повторить попытку!");
                        scanner.next(); // Очищаем неправильный ввод пользователя из буфера Scanner
                    }
                }

                else if (inputValue == 2) {
                    System.out.print("Введите сумму снятия: ");
                    // Проверяем, что пользователь ввел значение в формате Double
                    if (scanner.hasNextDouble()) {
                        double inputAmount = scanner.nextDouble();
                        boolean successWithdraw = myAccount.withdraw(inputAmount);
                        if (successWithdraw == true) {
                            System.out.println("Выполнена операция снятия денежных средств с баланса в размере: " + inputAmount + " руб.");
                        }
                        else if (inputAmount <= 0) {
                            System.out.println("Ошибка снятия: 'Вы ввели отрицательное число при снятии денежных средств баланса!'");
                        }
                        else {
                            System.out.println("Недостаточно денег на балансе банковского счета!");
                        }
                    }
                    else {
                        System.out.println("Вы ввели не число! Попробуйте повторить попытку!");
                        scanner.next(); // Очищаем неправильный ввод пользователя из буфера Scanner
                    }
                }

                else if (inputValue == 3) {
                    myAccount.getBalance();
                }

                else if (inputValue == 4) {
                    System.out.println("До свидания!");
                    scanner.close();
                    return; // Выходим из метода main
                }
            }
            else {
                System.out.println("Вы ввели некорректный номер операции! Попробуйте снова!");
                scanner.next(); // Очищаем неправильный ввод пользователя из буфера Scanner
            }
        }
    }
}