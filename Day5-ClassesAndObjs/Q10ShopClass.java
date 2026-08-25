import java.util.Scanner;

public class Q10ShopClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Shop shop = new Shop(n);

        for (int i = 0; i < n; i++) {
            String product = sc.next();
            shop.addProduct(product);
        }

        shop.displayProducts();

        sc.close();
    }
}

class Shop {
    String[] products;
    int index = 0;

    public Shop(int n) {
        products = new String[n];
    }

    public void addProduct(String product) {
        products[index] = product;
        index++;
    }

    public void displayProducts() {
        System.out.println("Available Products:");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}