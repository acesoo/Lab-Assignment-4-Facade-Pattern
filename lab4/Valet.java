package lab4;

public class Valet implements HotelService {
    @Override
    public void executeService(String plateNumber) {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service: Picking up vehicle with plate number " + plateNumber);
    }
}