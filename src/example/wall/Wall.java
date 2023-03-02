package example.wall;

import java.util.*;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = Objects.requireNonNullElse(blocks, Collections.emptyList());
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {

        return Optional.of(blocks.stream()
                .filter(block->block.getColor().contains(color))
                .findAny()).get();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

        return blocks.stream()
                .filter(block -> block.getMaterial().contains(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        long countBlocks= blocks.size();
        return (int) countBlocks;
    }

    @Override
    public String toString() {
        return " [Wall { blocks= " + blocks + " } ]";
    }
}

