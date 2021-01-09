package Q3_04;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args)throws IOException {
  Map<Integer, String> books=new TreeMap<>();
  books.put(1007,"A");
  books.put(1002,"C");
  books.put(1003,"B");
  books.put(1003,"B");
        System.out.println(books);
    }

}

//I:\OCP