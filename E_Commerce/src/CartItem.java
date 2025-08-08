class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Quantity exceeds stock");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public boolean isExpired() {
        if (product instanceof ExpirableProduct) {
            return ((ExpirableProduct) product).isExpired();
        }
        return false;
    }

    public boolean isShippable() {
        return product instanceof Shippable;
    }

    public Shippable getShippable() {
        return (Shippable) product;
    }
}
