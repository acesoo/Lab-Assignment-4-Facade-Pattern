package lab4;

public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        valet.executeService(plateNumber);
    }

    public void requestHouseKeeping(String roomNumber) {
        houseKeeping.executeService(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.executeService(String.valueOf(numberOfCarts));
    }
}
