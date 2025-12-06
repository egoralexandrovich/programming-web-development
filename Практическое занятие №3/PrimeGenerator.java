
public class PrimeGenerator {

    private int currentValue;

    public boolean isPrime(int userValue) {

        // Число "1" - является составным числом
        if (userValue == 1) {
            return false;
        }

        // Число "2" - является простым числом
        if (userValue == 2) {
            return true;
        }

        // Все четные числа (кроме числа "2") – составные
        if (userValue % 2 == 0) {
            return false;
        }

        // Переменная divide - сохраняет в себе значения делителей
        // Переменная userValue делится на каждый доступный делитель
        for (int divide = 3; divide <= Math.sqrt(userValue); divide++) {
            // Если был найден делитель для переменной userValue
            if (userValue % divide == 0) {
                return false;
            }
        }
        return true;
    }

    public int nextPrime() {
        int candidate = currentValue + 1;
        // Пока переменная candidate не будет простым числом
        // Будет происходить ее увеличение на одну единицу
        while (!isPrime(candidate)) {
            candidate++;
        }
        // Сохраняем найденное простое число
        currentValue = candidate;

        return candidate;
    }
}