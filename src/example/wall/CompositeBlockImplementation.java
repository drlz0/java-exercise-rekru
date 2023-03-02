package example.wall;

import java.util.*;

public class CompositeBlockImplementation extends BlockImplementation implements CompositeBlock {
    private final List<Block> blocks = new ArrayList<>();


    public List<Block> getBlocks() { return Collections.unmodifiableList(blocks); }


    public String toString() {
        return " [CompositeBlockImplement { blocks=" + blocks + ", getColor()=" + getColor() + ", getMaterial()="
            + getMaterial() + " } ]"; }

}
