
package pkg809;

/**
 * Question 46
 * @Answer: ?
 */
public class Block {
    String color;
    int size;
    Block(int size, String color){
        this.size = size;
        this.color = color;
    }
}

List<Block> blocks = new ArrayList<>();
blocks.add(new Block(10,"Green"));
blocks.add(new Block(7,"Red"));
blocks.add(new Block(12,"Blue"));
Collections.sort(blocks, new ColorSorterI());