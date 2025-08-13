
class Publication {
    String title;
    double price;
    int copies;

    // Common method (will be overridden)
    public void saleCopy(int soldCopies) {
        copies += soldCopies;
        System.out.println(soldCopies + " copies sold for " + title);
    }

    public double getTotalSales() {
        return price * copies;
    }
}

// Book class
class Book extends Publication {
    String author;

    // Specific method
    public void orderCopies(int orderedCopies) {
        copies += orderedCopies;
        System.out.println(orderedCopies + " copies of book ordered.");
    }

    // Overriding saleCopy method
    @Override
    public void saleCopy(int soldCopies) {
        super.saleCopy(soldCopies);
        System.out.println("Book '" + title + "' by " + author + " sold " + soldCopies + " copies.");
    }
}

// Magazine class
class Magazine extends Publication {
    int orderQty;
    String currentIssue;

    // Specific method
    public void receiveIssue(String issueName, int qty) {
        currentIssue = issueName;
        orderQty = qty;
        copies += qty;
        System.out.println(qty + " copies of " + currentIssue + " magazine received.");
    }

    // Overriding saleCopy method
    @Override
    public void saleCopy(int soldCopies) {
        super.saleCopy(soldCopies);
        System.out.println("Magazine issue '" + currentIssue + "' sold " + soldCopies + " copies.");
    }
}

// Main class
public class PublicationTest {
    public static void main(String[] args) {
        // Create Book object
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.price = 500;
        b1.author = "James Gosling";

        // Create Magazine object
        Magazine m1 = new Magazine();
        m1.title = "Tech World";
        m1.price = 100;

        // Order and sell book copies
        b1.orderCopies(5);
        b1.saleCopy(3);

        // Receive and sell magazine issue
        m1.receiveIssue("August 2025", 10);
        m1.saleCopy(5);

        // Display total sales
        System.out.println("\nTotal Book Sales: Rs. " + b1.getTotalSales());
        System.out.println("Total Magazine Sales: Rs. " + m1.getTotalSales());
    }
}