package lab2.test;

import lab2.model.Wood;
import lab2.store.WoodDirectory;

public class TestWood {

    public static void main(String[] args) {
        //creating woods list
        WoodDirectory wd = new WoodDirectory();
        //check for el with id=3
        System.out.println(wd.get(3)+"\n");
        //creating new type of wood
        Wood w = new Wood(4, "Дуб", 1f);
        //testing adding method
        if(wd.add(w))
            System.out.println(wd);
        //trying to add with the same id
        if(!wd.add(w))
            System.out.println(w + "вже існує\n");
    }
}
