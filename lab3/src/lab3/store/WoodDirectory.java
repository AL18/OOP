package lab3.store;

import lab3.model.Wood;

import java.util.Arrays;


public class WoodDirectory {

    private Wood[] arr = new Wood[3];
    private int count = 0;

    //init block
    {
        arr[0] = new Wood(0, "Модрина", 1.1f);
        arr[1] = new Wood(1, "Ялина", 0.9f);
        arr[2] = new Wood(2, "Сосна", 0.7f);
        count = 3;
    }

//getter
    public Wood[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public int getCount() {
        return count;
    }

    public Wood get(int id) {
        for (Wood i : arr) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public boolean add(Wood newWood) {
        //check for uniqueness
        if (get(newWood.getId()) != null)
            return false;
        //preventing array overflow
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2);
        //adding new element
        arr[count++] = newWood;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог деревини:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb .toString();
    }
}
