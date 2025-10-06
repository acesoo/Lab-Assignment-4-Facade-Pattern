package lab4;

public class HouseKeeping implements HotelService {
    @Override
    public void executeService(String roomNumber) {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("HouseKeeping service: Cleaning room number " + roomNumber);
    }
}
