package lab3.model;

public class Wood {

    private int id;
    private String name;
    private float density;

    public Wood(int id, String name, float density) {
        this.id = id;
        this.name = name;
        this.density = density;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getDensity() {
        return density;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}
