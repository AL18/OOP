package lab3.store;

import lab3.model.IWeight;

import java.util.Arrays;

public class ProductStore {

    private IWeight[] arr = new IWeight[3];
    private int count = 0;

    public IWeight[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public int getCount() {
        return count;
    }

    public void add(IWeight newItem) {

        //preventing array overflow
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2);
        //adding new element
        arr[count++] = newItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог брусів:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb .toString();
    }
}
