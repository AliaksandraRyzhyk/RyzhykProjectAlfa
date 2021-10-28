import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFactorial1(6));
        System.out.println(getFactorial2(4));
        fibo(10);
        System.out.println(arrayRevers(new int[]{1, 2, 3, 4, 5}));
        System.out.println(printRevers1("My name is Aliaksandra"));
        printRevers2("Minsk is the capital of Belarus");
        System.out.println(printRevers3("Minsk is the capital of Belarus"));
        System.out.println(splitIntoWords("My. name, is/ Aliaksandra"));
        System.out.println(splitIntoChars("Welcome to Guru99"));
        System.out.println(sortedStringArray("x", "О", 3));
        System.out.println(Arrays.toString(excludeNumberFromArray(new int[]{5, 6, 3, 5}, 5)));
        System.out.println(isSequenceOfTwoNumbers(new int[]{10, 89, 90, 10}));
        System.out.println(numberChar(new char[]{'a','c','x','A','x','c'}));
        System.out.println(isAnagram("лунь","Нуль"));
        System.out.println(isSequenceOfThreeNumbers(new int[]{1, 2, 4}));
    }

    // 1.Практические задачи на кодинг по Java:
    // 1.1.Вычисление факториала
    //1.1.1.нерекурсивный метод
    public static int getFactorial1(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    //1.1.2.рекурсивный метод
    public static int getFactorial2(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial2(number - 1);
    }

    // 1.2.Вычисления числа фибоначчи
    public static void fibo(int number) {
        int[] array = new int[number];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 1.3.Разворот(реверс)
    // 1.3.1.числового массива
    public static String arrayRevers(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return Arrays.toString(array);
    }

    // 1.3.2.строки (вариант 1)
    public static String printRevers1(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string).reverse();
        return String.valueOf(stringBuilder);
    }

    // 1.3.2.строки (вариант 2 без возврата строки, т.е. метод void)
    public static void printRevers2(String string) {
        char[] array = string.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    // 1.3.2.строки (вариант 2 c возвратом строки)
    public static String printRevers3(String string) {
        String reverseString = "";
        int stringLength = string.length();

        for (int x = stringLength - 1; x >= 0; x--) {
            reverseString += string.charAt(x);
        }
        return '\n' + reverseString;
    }

    // 1.4.Разбиение строки
    //1.4.1.с помощью split() на отдельные слова
    public static String splitIntoWords(String string){
        String[] array = string.split("[^\\p{L}\\p{N}]+");

        return Arrays.toString(array);
    }

    //1.4.2.через toCharArray() на отредельные символы
    public static String splitIntoChars(String string){
        char[] array = string.replace(" ","").toCharArray();//+ можно через replaceAll() и регулярные выражения

        return Arrays.toString(array);
    }

    //1.5.Написать метод, который принимает на вход строку a, строку b и число c. Метод должен возвращать строку, содержащую a в количестве c, разделённых b
    //Например: someMethod("x", "О", 3) → "xОxОx"
    public static String sortedStringArray(String a, String b, int c) {
        return a.concat(b).repeat(c - 1).concat(a);
    }

    //1.6.Написать метод, который принимает массив целых чисел и случайное целое число,
    // а возвращает массив из которого удалены все вхождения этого числа
    public static int[] excludeNumberFromArray(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }

        int[] newArray = new int[array.length - counter];
        int newCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[newCounter] = array[i];
                newCounter++;
            }
        }
        return newArray;
    }

    //1.7.Написать метод, который принимает массив целых чисел
    // и возвращает true, если в массиве последовательно расположены  2 одинаковых числа.
    public static boolean isSequenceOfTwoNumbers(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //1.8.Написать метод, который принимает массив char,
    // а возвращает Map<Character, Boolean>, где ключ - символ, значение - true, если символ встречается в массиве больше одного раза.
    public static Map<Character, Boolean> numberChar(char[] array) {
        Map<Character, Boolean> keyValue = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (keyValue.containsKey(array[i])) {
                keyValue.put(array[i], true);
            } else {
                keyValue.put(array[i], false);
            }
        }
        return keyValue;
    }

    //1.9.Написать метод, который проверяет, является ли одно слово анаграммой другого. Принимаем 2 строки. Возвращаем boolean
    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().toCharArray();
        char[] word2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    //1.10.Написать метод, который будет возвращать true, если поданный на вход массив int содержит 3 и более последовательных числа
    // в любом месте. Например :someMethod([2, 4, 5, 6, 2]) → true, someMethod([1, 2, 4]) → false"
    public static boolean isSequenceOfThreeNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] - 1) {
                count++;
            }
        }

        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
