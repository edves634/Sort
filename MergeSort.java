package Sort;

import java.util.Arrays;

public class MergeSort implements SortingUtils.Sorter {

    // Основной метод, который сортирует массив
    @Override
    public void sort(int[] array) {
        if (array.length < 2) {
            return; // Если массив состоит из одного элемента или пустой, ничего не делаем
        }
        int mid = array.length / 2; // Находим середину массива

        // Создаем левые и правые подмассивы
        int[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        // Рекурсивно сортируем обе половины
        sort(leftHalf);
        sort(rightHalf);

        // Сливаем отсортированные половины
        merge(array, leftHalf, rightHalf);
    }

    // Метод для слияния двух подмассивов
    private void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        // Слияние элементов в отсортированном порядке
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        // Копируем оставшиеся элементы левого подмассива, если есть
        while (i < leftHalf.length) {
            array[k++] = leftHalf[i++];
        }

        // Копируем оставшиеся элементы правого подмассива, если есть
        while (j < rightHalf.length) {
            array[k++] = rightHalf[j++];
        }
    }
}

