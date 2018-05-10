package lab3;

import lab3.model.*;
import lab3.store.ProductStore;
import lab3.store.WoodDirectory;

public class TestApp {

    //woods list
    private WoodDirectory wd = new WoodDirectory();
    //timbers list
    private ProductStore ps = new ProductStore();

    public static void main(String[] args) {
        TestApp app = new TestApp();
        app.startApp();
    }

    private void startApp() {
        //filling productStore
        ps.add(new Timber(wd.get(0), 5f, 0.5f, 0.4f));
        ps.add(new Timber(wd.get(1), 10f, 0.5f, 0.4f));
        ps.add(new Cylinder(wd.get(2), 5f, 0.3f));
        ps.add(new Triangle(wd.get(1), 10f, 0.5f));
        ps.add(new Waste(20f));
        //printing items list
        System.out.println(wd);
        System.out.println(ps);
        //counting items weight
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight() {
        float fullWeight = 0;
        for (IWeight item: ps.getArr()) {
            fullWeight += item.weight();
        }
        return fullWeight;
    }

}
