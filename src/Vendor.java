import java.util.ArrayList

public class Vendor {
    private ArrayList<Product> products;
    private String name;

    public Vendor(String name, ArrayList<Product> products){
        this.name = name;
        this.products = products;
    }
}
