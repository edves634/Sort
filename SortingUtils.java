package Sort;

import java.util.Arrays;
import java.util.Random;

public abstract class SortingUtils {

    // Метод для генерации случайного массива
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000); // Генерация чисел от 0 до 9999
        }
        return array;
    }

    // Метод для измерения времени выполнения сортировки
    public static void measureSortingTime(Sorter sorter, int[] array) {
        int[] copy = Arrays.copyOf(array, array.length); // Копируем массив для сортировки
        long startTime = System.nanoTime(); // Начало отсчета времени
        sorter.sort(copy); // Вызов сортировки
        long endTime = System.nanoTime(); // Конец отсчета времени
        long duration = endTime - startTime; // Вычисляем продолжительность
        System.out.println("Время выполнения: " + duration + " наносекунд");
    }

    public abstract void sort(int[] array);

    // Интерфейс для сортировщиков
    public interface Sorter {
        void sort(int[] array);
    }
}

