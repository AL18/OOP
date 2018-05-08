package lab3.model;

public class Timber extends AbstractForm {

    private float length;
    private float height;
    private float width;

    public Timber(Wood wood, float length, float height, float width) {
        super(wood);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float volume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Timber{" +
                "wood=" + wood +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                ",weight=" + weight() +
                '}';
    }
}
