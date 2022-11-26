package ru.maritariny;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;

        int count = 0;
        while (result <= 1_000_000) {

            if (increment <= 0) {
                break;
            }
            result = result + increment;
            count++;
        }
        System.out.println("Кол-во итераций: " + count);
        System.out.println("result: " + result);
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        int[] array = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        int[] array1 = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};

        int maxLength = 0;
        int minLength = 0;

        if (array1.length > array2.length) {
            maxLength = array1.length;
            minLength = array2.length;
        } else {
            maxLength = array2.length;
            minLength = array1.length;
        }

        int length = maxLength + minLength + minLength;
        int[] array3 = new int[length];

        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            }
            if (i < array2.length) {
                array3[i + array1.length] = array2[i];
            }
            if (i < array1.length && i < array2.length) {
                array3[i + array1.length + array2.length] = array1[i] * array2[i];
            }
        }

        System.out.println(Arrays.toString(array3));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String hello = "Hello world!";
        System.out.println(hello);
        hello = hello.replace("l", "r");
        System.out.println(hello);
        hello = hello.toUpperCase();
        System.out.println(hello);
        System.out.println(hello.substring(0, 8));

        String hello2 = "Hello world!";
        System.out.println(hello2.replace("l", "r").toUpperCase().substring(0, 8));
    }


}
