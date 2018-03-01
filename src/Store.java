import java.util.ArrayList;

public class Store {
    public static void main (String args[]) {

        ArrayList<Product> starBucksProducts = new ArrayList();
        starBucksProducts.add(new Product("cookie", "soft", 2.50));
        starBucksProducts.add(new Product("red tea", "rooibus", 1.50));
        starBucksProducts.add(new Product("bagel", "toasted", 1.50));
        starBucksProducts.add(new Product("donut","sweet and gooey",2.5));
        starBucksProducts.add(new Product("cupCake","like a cup", 2.5));
        Vendor starBucks = new Vendor("Starbucks", starBucksProducts);
        
        ArrayList<Product> qtProducts = new ArrayList();
        qtProducts.add(new Product("mango", "ripe", .99));
        qtProducts.add(new Product("Chips", "crispy", 5));
        qtProducts.add(new Product("Gummy Bear", "Soft", 6));
        qtProducts.add(new Product("Chocolate", "milky", 4));
        qtProducts.add(new Product("bagel", "toasted", 1.50));
        Vendor qt = new Vendor("qt", qtProducts);

        ArrayList<Product> Seven11Products = new ArrayList();
        Seven11Products.add(new Product("Cheetos", "puffy", 3.5));
        Seven11Products.add(new Product("greek", "blueberry", 1.99));
        Seven11Products.add(new Product("almonds", "salted", 3.99));
        Seven11Products.add(new Product("pringles", "sour cream", 1.99));
        Seven11Products.add(new Product("Ice Cream", "cold", 3));
        Vendor seven11 = new Vendor("Seven11", Seven11Products);
/*
        Product cookie = new Product("cookie", "soft", 2.50);
        Product bagel = new Product("bagel", "toasted", 1.50);
        Product yogurt = new Product("greek", "blueberry", 1.99);
        Product tea = new Product("red tea", "rooibus", 1.50);
        Product mango = new Product("mango", "ripe", .99);
        Product almonds = new Product("almonds", "salted", 3.99);
        Product pringles = new Product("pringles", "sour cream", 1.99);
        Product donut = new Product("donut", "sweet and gooey", 2.5);
        Product iceCream = new Product("Ice Cream", "cold", 3);
        Product chips = new Product("Chips", "crispy", 5);
        Product chocolate = new Product("Chocolate", "milky", 4);
        Product cheetos = new Product("Cheetos", "puffy", 3.5);
        Product cupCake = new Product("cupCake", "like a cup", 2.5);
        Product choclateChipCookie = new Product("Chocolate Chip Cookie", "has chocolate chips", 1.5);
        Product gumyBear = new Product("Gummy Bear", "Soft", 6);
*/
        }
    }
}

