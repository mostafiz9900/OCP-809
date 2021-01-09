package Q3_06;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args)throws IOException {
        List<String> codes= Arrays.asList("B","C","A","D");
        codes.parallelStream().forEach(s-> System.out.print(s));
        System.out.println("");
        codes.parallelStream().forEachOrdered(sl-> System.out.print(sl));
    }

}

//I:\OCP