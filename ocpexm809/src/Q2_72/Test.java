package Q2_72;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main (String [ ] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

      // int GDP=Integer.parseInt(br.readLine());
//        int GDP=Integer.parseInt(br.next());
     int GDP=br.read();
//        int GDP=br.nextInt();

        System.out.print ("Enter GDP: "+GDP);
    }

}

//I:\OCP