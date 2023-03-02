package example.wall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // check Block interface performance
        Block blueStone = new BlockImplementation("blue", "stone");

        System.out.println("getColor test should be blue: " + blueStone.getColor());
        System.out.println("getMaterial test should be stone: " + blueStone.getMaterial());

        Block greenWood = new BlockImplementation("green", "wood");

        Block purpleSand = new BlockImplementation("purple", "sand");

        List<Block> listOfBlocks = new ArrayList<>();
        listOfBlocks.add(blueStone);
        listOfBlocks.add(greenWood);
        listOfBlocks.add(purpleSand);

        System.out.println("list of blocks test: " + listOfBlocks);

        System.out.println("Is blueStone and greenWood instance of Block?");
        System.out.println(blueStone instanceof Block);
        System.out.println(greenWood instanceof Block);
        System.out.println(purpleSand instanceof Block);

        // check wall class performance
        Wall wall = new Wall(listOfBlocks);
        System.out.println("test of wall to string " + wall);
        System.out.println();

        System.out.println("wall test existing color blue: " + wall.findBlockByColor("blue"));
        System.out.println("wall test not existing color red: " + wall.findBlockByColor("red"));
        System.out.println();

        System.out.println("wall test existing material stone: " + wall.findBlocksByMaterial("stone"));
        System.out.println("wall test not existing material steel: " + wall.findBlocksByMaterial("steel"));
        System.out.println();

        System.out.println("wall test count: " + wall.count());
        System.out.println();

        Wall wallEmpty=new Wall(null);

        System.out.println("wall empty test: "+wallEmpty);
        System.out.println("wall empty test find color: "+wallEmpty.findBlockByColor("blue"));
        System.out.println("wall empty test find material: "+wallEmpty.findBlocksByMaterial("steel"));
        System.out.println("wall empty test count: "+wallEmpty.count());

    }
}
