import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(changeNegativeNumberOfArray(5));
        System.out.println(changeNumbersOfArray(3));
    }


    //2. Создать коллекцию целых чисел, написать методы:
    //2.1 Который отрицательные числа делает положительными и возвращает коллекцию.
    // Количество принимаемых и возвращаемых элементов коллекций должно совпадать
    public static List<Integer> changeNegativeNumberOfArray(int size) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            number.add((int) ((Math.random() * 31) - 15));
        }

        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) < 0) {
                number.set(i, Math.abs(number.get(i)));
            }
        }
        return number;
    }

    //2.2. Который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
    // Количество принимаемых и возвращаемых элементов коллекций должно совпадать
    public static List<Integer> changeNumbersOfArray(int size) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            number.add((int) ((Math.random() * 31) - 15));
        }

        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 != 0) {
                number.set(i, number.get(i) - 100);
            } else {
                number.set(i, number.get(i) * 100);
            }
        }
        return number;
    }
}
