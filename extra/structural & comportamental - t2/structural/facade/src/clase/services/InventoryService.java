package clase.services;

public class InventoryService {
    public boolean isInStock(String productId) {
        System.out.println("Verific stoc pentru produsul: " + productId);
        // simulare: produsul este mereu în stoc
        return true;
    }
}

