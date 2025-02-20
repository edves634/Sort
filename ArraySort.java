package Sort;

import java.util.Arrays;

public class ArraySort implements SortingUtils.Sorter {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}

