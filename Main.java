package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testSizes = {1000, 5000, 10000}; // Размеры массивов для тестирования

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        ArraySort arraySort = new ArraySort();


        for (int size : testSizes) {
            int[] randomArray = SortingUtils.generateRandomArray(size);
            System.out.println("Тестирование пузырьковой сортировки для массива размером: " + size);
            SortingUtils.measureSortingTime(bubbleSort, randomArray);
            System.out.println();

            randomArray = SortingUtils.generateRandomArray(size); // Генерируем новый массив для следующей сортировки
            System.out.println("Тестирование сортировки слиянием для массива размером: " + size);
            SortingUtils.measureSortingTime(mergeSort, randomArray);
            System.out.println();

            randomArray = SortingUtils.generateRandomArray(size);
            System.out.println("Тестирование сортировки Array.sort()  для массива размером: " + size);
            SortingUtils.measureSortingTime(arraySort, randomArray);
            System.out.println();
        }
    }
}

