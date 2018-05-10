package lab3.model;

public class Triangle extends AbstractForm {

    private float side;
    private float length;;

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public Triangle(Wood wood, float length, float side) {
        super(wood);
        this.length = length;
        this.side = side;
    }

    @Override
    public float volume() {
        return (float)(Math.pow(side, 2)*Math.sqrt(3)/4)*length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "wood=" + wood +
                ", side=" + side +
                ", length=" + length +
                ", weight=" + weight() +
                '}';
    }
}
