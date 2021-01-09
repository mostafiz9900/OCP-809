public class Product
{
	String name;
	int qty;
	
	public String toString(){
	    return name;
	}
	
	public Product(String name, int qty){
	    this.name = name;
	    this.qty = qty;
	}
	
	static class ProductFilter{
	    public static boolean isAvailable(Product p){   //line 1
	        return p.qty >= 10;
	    }
	}
	
	List<Product> product = Arrays.asList{
	    new Product("MotherBoard",5),
	    new Product("Speaker",20);
	    product.stream()
	    .filter(Product::ProductFilter::isAvailable())  //line 2
	    .forEach(p -> System.out.println(p));
	}
}