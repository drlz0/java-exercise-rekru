package example.wall;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockImplementationTest {

    Block block1 = new BlockImplementation("brown", "leather");
    Block block2 = new BlockImplementation("black", "brick");


    @Before
    public void fieldInitialization() {
        block1 = new BlockImplementation("brown", "leather");
        block2 = new BlockImplementation("black", "brick");
    }

    @Test
    public void block1GetColorTest() {
        assertEquals("brown", block1.getColor());
    }

    @Test
    public void block2GetColorTest() {
        assertEquals("black",block2.getColor());
    }


    @Test
    public void block1GetMaterialTest() {
        assertEquals("leather", block1.getMaterial());
    }

    @Test
    public void block2GetMaterialTest() {
        assertEquals("brick", block2.getMaterial());
    }

    @Test
    public void blockToStringTest() {
        String ans= " [BlockImplement { color = brown, material = leather } ]";

        assertEquals(ans, block1.toString());

    }

}
