package example.wall;

public class BlockImplementation implements Block {

    private String color;
    private String material;

    public BlockImplementation(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public BlockImplementation() {
        super();
    }

    // getters
    @Override
    public String getColor() { return this.color; }

    @Override
    public String getMaterial() { return this.material; }

    // show color and material
    public String toString() { return " [BlockImplement { color = " + color + ", material = " + material + " } ]"; }
}
