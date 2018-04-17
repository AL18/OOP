package lab2.store;

import lab2.model.IForm;
import lab2.model.Timber;

import java.util.Arrays;

public class ProductStore {

    private IForm[] arr = new IForm[3];
    private int count = 0;

    public IForm[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public int getCount() {
        return count;
    }

    public void add(IForm newItem) {

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
