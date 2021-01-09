package Q2_65;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        File file=new File("emplouyees.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        BufferedReader brCopy=null;
        try (BufferedReader br=new BufferedReader(new FileReader(file.getAbsoluteFile()))){
//            line 1
            br.lines().forEach(c-> System.out.println(c));
            brCopy=br;

        }
        brCopy.ready();
    }

}

//I:\OCP