
public class MicrowaveAtWork {

    static void main(String[] args) {
        // Создаем объект класса с использованием конструктора
        Microwave microwave_1 = new Microwave();

        // Допустим, что пользователь установил таймер на микроволновой печи сначала на 60 секунд
        // Затем пользователь понял, что этого много, сбросил таймер и установил значение на 30 секунд
        microwave_1.IncreaseTime(2);
        microwave_1.ChangeLevelPower(1);
        microwave_1.ResetTime();
        microwave_1.IncreaseTime(1);
        microwave_1.RunMicrowave();

        System.out.println("------------------------------------");

        // Создаем объект класса с использованием конструктора
        Microwave microwave_2 = new Microwave();

        // Представим ситуацию, что пользователь установил таймер на 60 секунд и запустил микроволновую печь
        microwave_2.IncreaseTime(2);
        microwave_2.RunMicrowave();
    }
}