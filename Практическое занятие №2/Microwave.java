
public class Microwave {

    // Добавление инстанс переменных и константы
    private int power;
    private double time;
    private final double RUN_TIME = 30;

    // Метод для увеличения времени на 30 секунд
    public double IncreaseTime(double click) {
        time += RUN_TIME * click;
        return time;
    }

    // Метод для изменения уровня мощности микроволновой печи
    public int ChangeLevelPower(int power) {
        this.power = power;

        if (power < 1) {
            System.out.println("Вы ввели неверный уровень мощности! Используйте диапазон от 1 до 2!");
            System.out.println("В качестве параметра по умолчанию была установлена мощность равная 1!");
            this.power = 1;
        }
        else if (power > 2) {
            System.out.println("Вы ввели неверный уровень мощности! Используйте диапазон от 1 до 2!");
            System.out.println("В качестве параметра по умолчанию была установлена мощность равная 2!");
            this.power = 2;
        }

        return this.power;
    }

    // Метод для сброса установленного таймера микроволновой печи
    public double ResetTime() {
        time = 0;
        return time;
    }

    // Метод для запуска установленного таймера в микроволновой печи
    public void RunMicrowave() {
        System.out.println("Приготовление в течение " + time + " секунд!");
        while (time > 0) {
            System.out.println("ЖЖЖЖ-ЖЖЖЖ");
            time -= 15; // 15 секунд в этом контексте используется для ускорения разгогрева в микроволновой печи
        }
        System.out.println("Готово, ваша еда была разогрета!");
    }
}