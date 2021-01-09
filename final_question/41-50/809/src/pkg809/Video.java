
package pkg809;

/**
 * Qestion 42
 * @Answer: ?
 */
public class Video {
    public void play() throws IOException{
        System.out.print("Video played.");
    }
}

public class Game extends Video{
    public void play() throws Exception{
        super.play();
        System.out.print("Game played.");
    }
}

try {
    new Game().play();
} catch (Exception e){
    System.out.prin(e.getClass());
}