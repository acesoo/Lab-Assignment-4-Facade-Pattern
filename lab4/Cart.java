package lab4;

public class Cart implements HotelService {
    @Override
    public void executeService(String numberOfCarts) {
        requestCart(Integer.parseInt(numberOfCarts));
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service: Delivering " + numberOfCarts + " luggage cart(s)");
    }
}
