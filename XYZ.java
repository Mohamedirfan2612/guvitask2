// program to display Product (pid, price, quantity)
import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Product[] products = new Product[3];

        int maxPricePid = 0;
        double maxPrice = 0.0;
        double totalAmount = 0.0;

        // Accepting product information and processing in one step
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = obj.nextInt();
            System.out.print("Enter Price: ");
            double price = obj.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = obj.nextInt();

            // Create product object and store in array
            products[i] = new Product(pid, price, quantity);

            // Check for highest price
            if (price > maxPrice) {
                maxPrice = price;
                maxPricePid = pid;
            }

            // Calculate total amount spent
            totalAmount += price * quantity;
        }

        // Display results
        System.out.println("Product with the highest price has Pid: " + maxPricePid);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }
}

// Product class
class Product {
    int pid;
    double price;
    int quantity;

    // Constructor to initialize product properties
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

