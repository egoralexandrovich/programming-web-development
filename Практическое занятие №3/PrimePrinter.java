import java.util.Scanner;

public class PrimePrinter {

    static void main() {

        // Создаем сканер для ввода пользователя
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // Запрашиваем число у пользователя
            System.out.print("Введите целое число: ");

            // Если пользователь ввел значение типа "INT"
            if (scanner.hasNextInt()) {
                // Сохраняем введенное значение
                int value = scanner.nextInt();

                // Создаем генератор для простых чисел
                PrimeGenerator generator = new PrimeGenerator();

                System.out.println("Простые числа до " + value + ":");
                System.out.println("-------------------------------");

                // Получаем первое простое число
                int prime = generator.nextPrime();

                // Выводим все простые числа, пока не превысим value
                while (prime <= value) {
                    System.out.println(prime);
                    // Получаем следующее простое число
                    prime = generator.nextPrime();
                }

                // Закрываем сканер
                scanner.close();
                return;
            }
            else {
                // Выводим пользователю сообщение об ошибке и очищаем его ввод
                System.out.println("Вы ввели не целое число! Попробуйте снова!");
                scanner.next();
            }
        }
    }

}