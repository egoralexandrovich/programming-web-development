
public class MicrowaveAtWork {

    static void main(String[] args) {
        // Создаем объект класса с использованием конструктора
        Microwave microwaveUser1 = new Microwave();

        // Допустим, что пользователь установил таймер на микроволновой печи сначала на 60 секунд
        // Затем пользователь понял, что этого много, сбросил таймер и установил значение на 30 секунд
        microwaveUser1.IncreaseTime(2);

        microwaveUser1.ResetTime();

        microwaveUser1.IncreaseTime(1);
        // Выводим значение переменной time с использованием метода getTime
        System.out.println("Текущее значение времени: " + microwaveUser1.getTime());

        microwaveUser1.ChangeLevelPower(1);
        // Выводим значение переменной power с использованием метода getPower
        System.out.println("Текущее значение мощности: " + microwaveUser1.getPower());

        microwaveUser1.RunMicrowave();

        System.out.println("------------------------------------");

        // Создаем объект класса с использованием конструктора
        Microwave microwaveUser2 = new Microwave();

        // Представим ситуацию, что пользователь установил таймер на 60 секунд и запустил микроволновую печь
        microwaveUser2.IncreaseTime(2);

        // Выводим значение переменной time с использованием метода getTime
        System.out.println("Текущее значение времени: " + microwaveUser2.getTime());
        microwaveUser2.ChangeLevelPower(1);

        // Выводим значение переменной power с использованием метода getPower
        System.out.println("Текущее значение мощности: " + microwaveUser2.getPower());
        microwaveUser2.RunMicrowave();

    }
}