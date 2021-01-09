package Q2_68;

public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object obj){
        boolean output = false;
        Book b= (Book) obj;
        if (this.id==b.id){
            output=true;
        }
        return output;
    }
    public static void main(String[] args) {
        Book b1=new Book(101, "Java Programing");
        Book b2=new Book(102, "Java Programing");
        System.out.println(b1.equals(b2));
    }

}


