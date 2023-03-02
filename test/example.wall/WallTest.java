package example.wall;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WallTest {

    List<Block> listOfBlocks= new ArrayList<>();
    Wall wall = new Wall(listOfBlocks);

    @Before
    public void fieldInitializationTest() {
        Block brownLeather = new BlockImplementation("brown", "leather");

        Block blackBrick = new BlockImplementation("black", "brick");

        listOfBlocks.add(brownLeather);
        listOfBlocks.add(blackBrick);
    }

    @Test
    public void findColorTest() {
        System.out.println("color brown: " + wall.findBlockByColor("brown"));
    }

    @Test
    public void findColorTestEmpty() {
        System.out.println("color null: " + wall.findBlockByColor("yellow"));
    }

    @Test
    public void findMaterialTest() {
        System.out.println("material brick: " + wall.findBlocksByMaterial("brick"));
    }

    @Test
    public void findMaterialTestEmpty() {
        System.out.println("material null: " + wall.findBlocksByMaterial("sand"));
    }

    @Test
    public void countTest() {
        System.out.println("count: " + wall.count());
    }
}
