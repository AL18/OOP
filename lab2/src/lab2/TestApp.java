package lab2;

import lab2.model.Cylinder;
import lab2.model.IForm;
import lab2.model.Timber;
import lab2.store.ProductStore;
import lab2.store.WoodDirectory;

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
        //printing items list
        System.out.println(wd);
        System.out.println(ps);
        //counting items weight
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight() {
        float fullWeight = 0;
        for (IForm item: ps.getArr()) {
            fullWeight += item.weight();
        }
        return fullWeight;
    }

}
