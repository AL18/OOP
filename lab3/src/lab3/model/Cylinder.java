package lab3.model;

public class Cylinder extends AbstractForm{

    private lab3.model.Wood wood;
    private float length;
    private float radius;

    public Cylinder(lab3.model.Wood wood, float length, float radius) {
        super(wood);
        this.length = length;
        this.radius = radius;
    }

    public lab3.model.Wood getWood() {
        return wood;
    }

    public float getLength() {
        return length;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float volume() { return (float)(Math.PI * length * Math.pow(radius, 2)); }

    @Override
    public String toString() {
        return "Cylinder{" +
                "wood=" + wood +
                ", length=" + length +
                ", radius=" + radius +
                ",weight=" + weight() +
                '}';
    }
}
