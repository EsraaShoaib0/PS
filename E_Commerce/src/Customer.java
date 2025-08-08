import java.util.*;

class Customer {
    private String name;
    private double balance;
    private List<CartItem> cart = new ArrayList<>();

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addToCart(Product product, int quantity) {
        cart.add(new CartItem(product, quantity));
    }

    public void checkout() {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty.");
        }

        List<Shippable> itemsToShip = new ArrayList<>();
        double subtotal = 0;

        for (CartItem item : cart) {
            if (!item.product.isAvailable()) {
                throw new IllegalStateException(item.product.getName() + " is out of stock.");
            }
            if (item.isExpired()) {
                throw new IllegalStateException(item.product.getName() + " is expired.");
            }

            subtotal += item.getTotalPrice();
            if (item.isShippable()) {
                itemsToShip.add(item.getShippable());
            }
        }

        double shippingFees = itemsToShip.size() * 10; // flat fee per item
        double total = subtotal + shippingFees;

        if (total > balance) {
            throw new IllegalStateException("Insufficient balance.");
        }

        // Deduct from balance and product stock
        balance -= total;
        for (CartItem item : cart) {
            item.product.decreaseQuantity(item.quantity);
        }

        // Print receipt
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Shipping fees: $" + shippingFees);
        System.out.println("Total paid: $" + total);
        System.out.println("Remaining balance: $" + balance);

        // Ship items
        if (!itemsToShip.isEmpty()) {
            ShippingService.ship(itemsToShip);
        }

        cart.clear();
    }
}
