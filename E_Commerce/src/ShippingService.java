import java.util.List;

class ShippingService {
    public static void ship(List<Shippable> items) {
        System.out.println("Shipping the following items:");
        for (Shippable item : items) {
            System.out.println("- " + item.getName() + " (Weight: " + item.getWeight() + "kg)");
        }
    }
}
