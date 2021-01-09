package Q2_64;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface CourseFilter extends Predicate<String>{
    public default boolean test(String str){
        return str.contains("Java");
    }
}

public class Test {
    public static void main(String[] args) {
List<String> strs=Arrays.asList("Java","Java EE", "Embedded Java");
Predicate<String> cf1=s->s.length() > 3;
Predicate cf2=new CourseFilter() {
    @Override
    public boolean test(String str) {
        return str.startsWith("Java");
    }
};
long c=strs.stream().filter(cf1).filter(cf2).count();
        System.out.println(c);
    }

}

//I:\OCP